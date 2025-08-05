package com.shelterService.shelterService.CONTROLLER;

import com.shelterService.shelterService.ENTITY.AppAdmin;
import com.shelterService.shelterService.SERVICE.IAdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@CrossOrigin
@RequestMapping("/api/v1/shelter/admins")
@Primary
public class AdminController implements IAdminController{
    private final IAdminService adminService;

    @Autowired
    public AdminController(IAdminService adminService){
        this.adminService=adminService;
    }

    @Override
    @GetMapping
    public ResponseEntity<Optional> readAll() {
        return ResponseEntity.ok(adminService.readAll());
    }

    @Override
    @GetMapping("/{Id}")
    public ResponseEntity<Optional> readOne(@PathVariable("Id") int Id) {
        return ResponseEntity.ok(adminService.readOne(Id));
    }

    @Override
    @PostMapping
    public ResponseEntity<Optional> insert(@RequestBody AppAdmin admin) {
        return ResponseEntity.ok(adminService.insert(admin));
    }

    @Override
    @PutMapping
    public ResponseEntity<Optional> update(@RequestBody AppAdmin admin) {
        return ResponseEntity.ok(adminService.update(admin));
    }

    @Override
    @DeleteMapping("/{Id}")
    public ResponseEntity<Optional> delete(@PathVariable("Id") int Id) {
        adminService.delete(Id);
        return ResponseEntity.noContent().build();
    }
}
