package com.tts.UsersAPI.Repository;

import com.tts.UsersAPI.Model.Users;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UsersRepository extends CrudRepository<Users, Long> {
  List<Users> findAll(String state);

}
