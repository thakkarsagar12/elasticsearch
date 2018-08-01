package com.elasticsearch.elasticsearch.controller;

import com.elasticsearch.elasticsearch.model.User;
import com.elasticsearch.elasticsearch.model.UserDto;
import com.elasticsearch.elasticsearch.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import java.security.Principal;
import java.util.List;
import java.util.Optional;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping(value="/users", method = RequestMethod.GET)
    public List<User> listUser(){
        return userService.findAll();
    }

    @RequestMapping(value = "/users/{id}", method = RequestMethod.GET)
    public Optional<User> getOne(@PathVariable(value = "id") Long id){
        return userService.findById(id);
    }

    @RequestMapping(value = "/users/{id}", method = RequestMethod.DELETE)
    public ResponseEntity<?> deleteOne(@PathVariable(value = "id") Long id){
        System.out.println("Fetching & Deleting User with id :" + id);

        userService.delete(id);
        return new ResponseEntity<User>(HttpStatus.NO_CONTENT);
    }

    @RequestMapping(value="/signup", method = RequestMethod.POST)
    public User saveUser(@RequestBody UserDto user){
        return userService.save(user);
    }

    @RequestMapping(value="/login", method = RequestMethod.GET)
    public String printWelcome(ModelMap model, Principal principal ) {

        String name = principal.getName(); //get logged in username
        model.addAttribute("username", name);
        return name;

    }



}
