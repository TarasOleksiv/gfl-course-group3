package com.example.group3demo.controller;

import com.example.group3demo.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

@RestController //(@Controller + @ResponseBody)
@RequestMapping(value="/api/test")
public class HelloController {

    //http://localhost:8080/api/test/hello
    @GetMapping(value = "/hello", produces = "Application/json")
    public User index() {

        return new User("Smith", LocalDateTime.now());
    }

    //http://localhost:8080/api/test/id?userName=Smith
    @GetMapping(value = "/id", produces = "Application/json")
    public User getUserById(@RequestParam(name="userName") String str) {

        return new User(str, LocalDateTime.now());
    }

    //http://localhost:8080/api/test/userName
    @GetMapping(value = "/{userName}", produces = "Application/json")
    public User getUserByName(@PathVariable(name="userName") String str) {

        return new User(str, LocalDateTime.now());
    }

    //http://localhost:8080/api/test/addUser
    @PostMapping(value = "/addUser", produces = "Application/json")
    public User saveUser(@RequestBody User user) {
        // save user to the database or to queue
        return user;
    }

    //http://localhost:8080/api/test/hello
    @PostMapping(value = "/hello", produces = "Application/json")
    public String indexPost() {
        // handle this
        return null;
    }

    //http://localhost:8080/api/test/hello
    @DeleteMapping(value = "/hello", produces = "Application/json")
    public void indexDelete() {
        // handle this

    }



}
