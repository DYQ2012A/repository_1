package com.example.demo.controller;

// import com.example.demo.mapper.UserMapper;
import com.example.demo.entity.User;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {
    @Autowired
    private UserService UserService;  //跳过service，直接private UserMapper UserMapper是否可行？

    @RequestMapping("/test")
    public String test(){
        System.out.print("\ncontroller(test) begin\n");
        return UserService.test();
        //return "Hello World!";
    }

    @RequestMapping ("/")
    public List<User> findAll() {
        System.out.print("\ncontroller(findAll) begin\n");
        return UserService.findAll();
    }

    @GetMapping("/{id}")
    public User findById(@PathVariable Long id) {
        System.out.print("\ncontroller(find_by_id) begin\n");
        return UserService.findById(id);
    }

}
