package org.example.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/test")
public class Test {

    @GetMapping("/test")
    public String test(@RequestBody A a){
        System.out.println(a.toString());
        return "success";
    }
    @RequestMapping("/test1")
    public String test1(@RequestParam("name") String name){
        System.out.println(name);
        return "success";
    }
}
class A{
    private  String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "A{" +
                "name='" + name + '\'' +
                '}';
    }
}
