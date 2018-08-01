package com.elasticsearch.elasticsearch.service;



import com.elasticsearch.elasticsearch.model.User;
import com.elasticsearch.elasticsearch.model.UserDto;

import java.util.List;
import java.util.Optional;

public interface UserService {

    User save(UserDto user);
    List<User> findAll();
    void delete(long id);
    User findOne(String username);

    Optional<User> findById(Long id);


}
