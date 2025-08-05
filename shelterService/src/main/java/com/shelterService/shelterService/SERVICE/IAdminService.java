package com.shelterService.shelterService.SERVICE;

import com.shelterService.shelterService.ENTITY.AppAdmin;

import java.util.List;
import java.util.Optional;

public interface IAdminService {
    Optional<List<AppAdmin>> readAll();
    Optional<AppAdmin> readOne(int Id);
    Optional<AppAdmin> insert(AppAdmin admin);
    Optional<AppAdmin> update(AppAdmin admin);
    void delete(int Id);
}
