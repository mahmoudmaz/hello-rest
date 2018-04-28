package com.maziad.hellorest;

import com.maziad.hellorest.model.BasicMessage;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/pl/v1.0")
public class HelloController {


    IHelloService service;

    public HelloController(IHelloService service) {
        this.service = service;
    }

    @RequestMapping("/greeting")
    public BasicMessage greeting(@RequestParam(value="name", defaultValue="World") String name) {
        return service.sayHello();
    }
}
