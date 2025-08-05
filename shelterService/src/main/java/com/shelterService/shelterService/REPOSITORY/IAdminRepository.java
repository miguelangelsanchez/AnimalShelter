package com.shelterService.shelterService.REPOSITORY;

import com.shelterService.shelterService.ENTITY.Admin;

import java.util.List;
import java.util.Optional;

public interface IAdminRepository {
    List<Admin> findAll();
    Optional<Admin> findById(int Id);
    void save(Admin admin);
    void deleteById(int Id);
}
