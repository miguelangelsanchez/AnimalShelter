package com.shelterService.shelterService.CONTROLLER;

import com.shelterService.shelterService.ENTITY.AppAdmin;
import org.springframework.http.ResponseEntity;

import java.util.Optional;

public interface IAdminController {
    ResponseEntity<Optional> readAll();
    ResponseEntity<Optional> readOne(int Id);
    ResponseEntity<Optional> insert(AppAdmin admin);
    ResponseEntity<Optional> update(AppAdmin admin);
    ResponseEntity<Optional> delete(int Id);
}

