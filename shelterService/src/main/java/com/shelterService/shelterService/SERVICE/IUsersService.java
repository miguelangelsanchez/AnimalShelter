package com.shelterService.shelterService.SERVICE;

import com.shelterService.shelterService.ENTITY.AppUser;

import java.util.List;
import java.util.Optional;

public interface IUsersService {
    Optional<List<AppUser>> readAll();
    Optional<AppUser> readOne(int Id);
    Optional<AppUser> insert(AppUser user);
    Optional<AppUser> update(AppUser user);
    void delete(int Id);
}
