package com.shelterService.shelterService.SERVICE;

import com.shelterService.shelterService.ENTITY.Animal;
import com.shelterService.shelterService.ENTITY.User;

import java.util.List;
import java.util.Optional;

public interface IUsersService {
    Optional<List<User>> readAll();
    Optional<User> readOne(int Id);
    Optional<User> insert(User user);
    Optional<User> update(User user);
    void delete(int Id);
}
