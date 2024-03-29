/*
 * This file is generated by jOOQ.
 */
package hst.peter.jooq.codegen;


import hst.peter.jooq.codegen.tables.Author;
import hst.peter.jooq.codegen.tables.Book;
import hst.peter.jooq.codegen.tables.BookStore;
import hst.peter.jooq.codegen.tables.BookToBookStore;
import hst.peter.jooq.codegen.tables.Language;
import hst.peter.jooq.codegen.tables.T1;
import hst.peter.jooq.codegen.tables.TStudent;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Catalog;
import org.jooq.Table;
import org.jooq.impl.SchemaImpl;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.12.3"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Demodb extends SchemaImpl {

    private static final long serialVersionUID = -516692901;

    /**
     * The reference instance of <code>demodb</code>
     */
    public static final Demodb DEMODB = new Demodb();

    /**
     * The table <code>demodb.author</code>.
     */
    public final Author AUTHOR = Author.AUTHOR;

    /**
     * The table <code>demodb.book</code>.
     */
    public final Book BOOK = Book.BOOK;

    /**
     * The table <code>demodb.book_store</code>.
     */
    public final BookStore BOOK_STORE = BookStore.BOOK_STORE;

    /**
     * The table <code>demodb.book_to_book_store</code>.
     */
    public final BookToBookStore BOOK_TO_BOOK_STORE = BookToBookStore.BOOK_TO_BOOK_STORE;

    /**
     * The table <code>demodb.language</code>.
     */
    public final Language LANGUAGE = Language.LANGUAGE;

    /**
     * The table <code>demodb.t1</code>.
     */
    public final T1 T1 = hst.peter.jooq.codegen.tables.T1.T1;

    /**
     * The table <code>demodb.t_student</code>.
     */
    public final TStudent T_STUDENT = TStudent.T_STUDENT;

    /**
     * No further instances allowed
     */
    private Demodb() {
        super("demodb", null);
    }


    @Override
    public Catalog getCatalog() {
        return DefaultCatalog.DEFAULT_CATALOG;
    }

    @Override
    public final List<Table<?>> getTables() {
        List result = new ArrayList();
        result.addAll(getTables0());
        return result;
    }

    private final List<Table<?>> getTables0() {
        return Arrays.<Table<?>>asList(
            Author.AUTHOR,
            Book.BOOK,
            BookStore.BOOK_STORE,
            BookToBookStore.BOOK_TO_BOOK_STORE,
            Language.LANGUAGE,
            T1.T1,
            TStudent.T_STUDENT);
    }
}
