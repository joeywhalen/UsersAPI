package com.tts.UsersAPI.Controller;

import com.tts.UsersAPI.Model.Users;
import com.tts.UsersAPI.Repository.UsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {

  @Autowired
  private UsersRepository usersRepository;

  @GetMapping("/users")
  public List<Users> getUsers() {
    return (List<Users>) usersRepository.findAll();
  }

}
