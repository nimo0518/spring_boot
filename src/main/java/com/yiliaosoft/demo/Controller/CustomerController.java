package com.yiliaosoft.demo.Controller;


import org.springframework.web.bind.annotation.*;

@RestController
public class CustomerController {

    @RequestMapping("/hello")
    public String index(){
        return "Hello World";
    }

    @RequestMapping(value = "/json",method = RequestMethod.POST)
    public String getUserJson(@RequestBody  String data){
        return "Json"+ data;
    }

    @RequestMapping(value = "/aaa",method = RequestMethod.POST)
    public String getUserName(String username){
        return "gpf"+"aa"+username;
    }
}
