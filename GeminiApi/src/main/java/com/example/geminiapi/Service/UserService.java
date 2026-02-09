package com.example.geminiapi.Service;

import com.example.geminiapi.Model.UserModel;
import com.example.geminiapi.Repository.UserRepository;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Service
public class UserService {
    private final UserRepository repository;
    public UserService(UserRepository repository){
        this.repository = repository;
    }

    public UserModel AddRequest(UserModel user) {
        String response = "No Response";
        user.setResponse(response);
        return repository.save(user);
    }

    public List<UserModel> GetResponse() {
        return repository.findAll();
    }
}
