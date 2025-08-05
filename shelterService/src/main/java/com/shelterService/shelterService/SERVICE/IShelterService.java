package com.shelterService.shelterService.SERVICE;

import com.shelterService.shelterService.ENTITY.Animal;

import java.util.List;
import java.util.Optional;

public interface IShelterService {
    Optional<List<Animal>> readAll();
    Optional<Animal> readOne(int Id);
    Optional<Animal> insert(Animal animal);
    Optional<Animal> update(Animal animal);
    void delete(int Id);
}
