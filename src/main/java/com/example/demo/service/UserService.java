package com.example.demo.service;

import com.example.demo.entity.User;
import com.example.demo.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserMapper userMapper;

    public User findById(Long id) {
        System.out.print("\nservice(find_by_id) begin\n");
        return userMapper.findById(id);
    }

    public List<User> findAll(){
        System.out.print("\nservice(findAll) begin\n");
        return userMapper.findAll();
    }

    public String test(){
        System.out.print("\nservice(test) begin\n");
        return "hello world(in service)";
    }

}
