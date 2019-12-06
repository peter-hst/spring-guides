package hst.peter.jooq.controller;

import lombok.extern.slf4j.Slf4j;
import org.jooq.DSLContext;
import org.jooq.Record1;
import org.jooq.Result;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author peter.huang
 * @date 2019/11/28 10:14
 */
@RestController
@Slf4j
public class HomeController {
    private DSLContext dsl;

    public HomeController(DSLContext dsl) {
        this.dsl = dsl;
    }

    @GetMapping("/")
    public String index() {
        Result<Record1<Integer>> result = dsl.selectOne().fetch();
        System.out.println(result);
        return result.formatHTML();
    }
}
