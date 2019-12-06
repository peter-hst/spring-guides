package hst.peter.jooq.controller;

import hst.peter.jooq.codegen.tables.Book;
import hst.peter.jooq.codegen.tables.records.BookRecord;
import hst.peter.jooq.domain.MyBook;
import lombok.extern.slf4j.Slf4j;
import org.jooq.DSLContext;
import org.jooq.Record;
import org.jooq.Result;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import static org.jooq.impl.DSL.*;

/**
 * @author peter.huang
 * @date 2019/11/28 11:05
 */
@RestController
@Slf4j
@RequestMapping("/book")
public class BookController {

    private final DSLContext dsl;

    public BookController(DSLContext dsl) {
        this.dsl = dsl;
    }

    @GetMapping("/list")
    public List<MyBook> list() {
        Result<Record> records = dsl.select().from(Book.BOOK).fetch();
        List<MyBook> books = records.into(MyBook.class);
        log.info("books : {}", books);
        return books;
    }

    @GetMapping("/sql")
    public String sql() {
        String sql = dsl.select(field("BOOK.ID")
                , field("BOOK.AUTHOR_ID")
                , field("BOOK.TITLE")
                , field("AUTHOR.first_name")
                , field("AUTHOR.last_name")
        ).from(table("BOOK"))
                .leftJoin(table("AUTHOR"))
                .on(field("BOOK.AUTHOR_ID").eq(field("AUTHOR.ID")))
                .where(field("BOOK.PUBLISHED_IN").eq(1948))
                .getSQL();
        log.info("sql: {}", sql);
        return sql;
    }

    @GetMapping("/sqlParam")
    public String sqlParam() {
        String sql = dsl.renderNamedParams(
                dsl.select(field("BOOK.ID")
                        , field("BOOK.AUTHOR_ID")
                        , field("BOOK.TITLE")
                        , field("AUTHOR.first_name")
                        , field("AUTHOR.last_name")
                ).from(table("BOOK"))
                        .leftJoin(table("AUTHOR"))
                        .on(field("BOOK.AUTHOR_ID").eq(field("AUTHOR.ID")))
                        .where(field("BOOK.PUBLISHED_IN").eq(param("year", 1948)))
        );
        log.info("sql: {}", sql);
        return sql;
    }
}
