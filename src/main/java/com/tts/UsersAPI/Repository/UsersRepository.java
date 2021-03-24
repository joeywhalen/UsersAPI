package com.tts.UsersAPI.Repository;

import com.tts.UsersAPI.Model.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UsersRepository extends CrudRepository<User, Long> {
  List<User> findAll(String state);

}
