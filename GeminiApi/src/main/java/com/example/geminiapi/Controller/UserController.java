package com.example.geminiapi.Controller;

import com.example.geminiapi.Model.UserModel;
import com.example.geminiapi.Service.UserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {
    private final UserService service;

    public UserController(UserService service) {
        this.service = service;
    }

    @PostMapping("/add")
    public UserModel AddRequest(@RequestBody UserModel user){
        return service.AddRequest(user);
    }
    @GetMapping("/users")
    public List<UserModel> GetResponse(){
        return service.GetResponse();
    }
}
