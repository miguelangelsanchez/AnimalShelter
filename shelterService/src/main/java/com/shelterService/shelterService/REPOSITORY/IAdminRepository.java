package com.shelterService.shelterService.REPOSITORY;

import com.shelterService.shelterService.ENTITY.AppAdmin;

import java.util.List;
import java.util.Optional;

public interface IAdminRepository {
    List<AppAdmin> findAll();
    Optional<AppAdmin> findById(int Id);
    void save(AppAdmin admin);
    void deleteById(int Id);
}
