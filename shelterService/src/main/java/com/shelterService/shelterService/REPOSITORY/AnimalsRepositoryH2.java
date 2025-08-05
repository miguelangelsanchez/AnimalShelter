package com.shelterService.shelterService.REPOSITORY;

import com.shelterService.shelterService.ENTITY.Animal;
import org.springframework.context.annotation.Primary;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
@Primary
public interface AnimalsRepositoryH2 extends JpaRepository<Animal,Integer> {
}
