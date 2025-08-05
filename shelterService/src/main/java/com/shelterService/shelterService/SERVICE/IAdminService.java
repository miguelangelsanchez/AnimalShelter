package com.shelterService.shelterService.SERVICE;

import com.shelterService.shelterService.ENTITY.Admin;

import java.util.List;
import java.util.Optional;

public interface IAdminService {
    Optional<List<Admin>> readAll();
    Optional<Admin> readOne(int Id);
    Optional<Admin> insert(Admin admin);
    Optional<Admin> update(Admin admin);
    void delete(int Id);
}
