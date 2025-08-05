package com.shelterService.shelterService.REPOSITORY;

import com.shelterService.shelterService.ENTITY.AppUser;

import java.util.List;
import java.util.Optional;

public interface IShelterUsersRepository {
    List<AppUser> findAll();
    Optional<AppUser> findById(int Id);
    void save(AppUser user);
    void deleteById(int Id);
}
