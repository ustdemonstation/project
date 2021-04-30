package com.example.JwtActivity.Controller;

import com.example.JwtActivity.Model.DaoUser;
import com.example.JwtActivity.Model.UserDto;
import com.example.JwtActivity.Repository.UserDao;
import com.example.JwtActivity.Service.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class AppController {
    @GetMapping("/msg")
    public String getData() {
        return "Happy learning";

    }
    private UserServiceImpl service;

    @Autowired
    public AppController(UserServiceImpl service) {
        this.service = service;
    }
    @GetMapping("users")
    public List<DaoUser> getAllUsers()
    {
        return service.getAllUsers();
    }
    @PostMapping("users")
    public ResponseEntity<DaoUser> addUser(@RequestBody DaoUser daoUser)
    {
        return new ResponseEntity<DaoUser>(service.addUser(daoUser),HttpStatus.CREATED);
    }
    @DeleteMapping("user/{id}")
    public void deleteUser(@PathVariable int id)
    {
        service.deleteUser(id);
    }
    @PutMapping("user")
    public ResponseEntity<DaoUser> updateUser(@RequestBody DaoUser daoUser)
    {
        return new ResponseEntity<DaoUser>(service.updateUser(daoUser),HttpStatus.OK);
    }
}