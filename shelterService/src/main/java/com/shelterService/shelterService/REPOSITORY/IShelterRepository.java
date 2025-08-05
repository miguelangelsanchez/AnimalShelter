package com.shelterService.shelterService.REPOSITORY;

import com.shelterService.shelterService.ENTITY.Animal;

import java.util.List;
import java.util.Optional;

public interface IShelterRepository {
    List<Animal> findAll();
    Optional<Animal> findById(int Id);
    void save(Animal animal);
    void deleteById(int Id);
}
