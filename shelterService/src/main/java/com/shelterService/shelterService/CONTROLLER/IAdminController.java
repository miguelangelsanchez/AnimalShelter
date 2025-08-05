package com.shelterService.shelterService.CONTROLLER;

import com.shelterService.shelterService.ENTITY.Admin;
import org.springframework.http.ResponseEntity;

import java.util.Optional;

public interface IAdminController {
    ResponseEntity<Optional> readAll();
    ResponseEntity<Optional> readOne(int Id);
    ResponseEntity<Optional> insert(Admin admin);
    ResponseEntity<Optional> update(Admin admin);
    ResponseEntity<Optional> delete(int Id);
}

