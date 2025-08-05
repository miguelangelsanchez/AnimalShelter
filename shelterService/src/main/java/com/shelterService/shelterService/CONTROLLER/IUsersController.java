package com.shelterService.shelterService.CONTROLLER;

import com.shelterService.shelterService.ENTITY.Animal;
import com.shelterService.shelterService.ENTITY.User;
import org.springframework.http.ResponseEntity;

import java.util.Optional;

public interface IUsersController {
    ResponseEntity<Optional> readAll();
    ResponseEntity<Optional> readOne(int Id);
    ResponseEntity<Optional> insert(User user);
    ResponseEntity<Optional> update(User user);
    ResponseEntity<Optional> delete(int Id);
}
