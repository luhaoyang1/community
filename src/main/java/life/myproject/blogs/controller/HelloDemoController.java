package life.myproject.blogs.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author lu
 * @date 2019-11-04 10:23
 */
@RestController
public class HelloDemoController {
    @GetMapping(value="/hello")
    public String sayHello(){
        return "hello world";
    }

}
