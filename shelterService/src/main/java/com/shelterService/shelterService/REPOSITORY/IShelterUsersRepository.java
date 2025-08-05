package com.shelterService.shelterService.REPOSITORY;

import com.shelterService.shelterService.ENTITY.User;

import java.util.List;
import java.util.Optional;

public interface IShelterUsersRepository {
    List<User> findAll();
    Optional<User> findById(int Id);
    void save(User user);
    void deleteById(int Id);
}
