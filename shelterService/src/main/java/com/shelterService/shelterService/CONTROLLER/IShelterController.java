package com.shelterService.shelterService.CONTROLLER;

import com.shelterService.shelterService.ENTITY.Animal;
import org.springframework.http.ResponseEntity;

import java.util.Optional;

public interface IShelterController {
    ResponseEntity<Optional> readAll();
    ResponseEntity<Optional> readOne(int Id);
    ResponseEntity<Optional> insert(Animal animal);
    ResponseEntity<Optional> update(Animal animal);
    ResponseEntity<Optional> delete(int Id);
}
