package com.yiliaosoft.demo.Controller;


import org.springframework.web.bind.annotation.*;
/**
 * @RestController注解等价于@Controller+@ResponseBody的结合，
 * 使用这个注解的类里面的方法都以json格式输出。
 */
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
