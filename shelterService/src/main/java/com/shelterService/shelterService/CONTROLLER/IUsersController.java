package com.shelterService.shelterService.CONTROLLER;

import com.shelterService.shelterService.ENTITY.AppUser;
import org.springframework.http.ResponseEntity;

import java.util.Optional;

public interface IUsersController {
    ResponseEntity<Optional> readAll();
    ResponseEntity<Optional> readOne(int Id);
    ResponseEntity<Optional> insert(AppUser user);
    ResponseEntity<Optional> update(AppUser user);
    ResponseEntity<Optional> delete(int Id);
}
