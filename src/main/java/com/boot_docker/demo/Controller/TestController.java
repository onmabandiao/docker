package com.boot_docker.demo.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("test")
@RestController
public class TestController {
    @GetMapping("/{name}")
    public String testDocker(@PathVariable("name")String name){
        return "hello"+name;
    }
}
