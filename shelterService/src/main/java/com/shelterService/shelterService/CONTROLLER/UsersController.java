package com.shelterService.shelterService.CONTROLLER;

import com.shelterService.shelterService.ENTITY.AppUser;
import com.shelterService.shelterService.SERVICE.IUsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@CrossOrigin
@RequestMapping("/api/v1/shelter/users")
@Primary
public class UsersController implements IUsersController{
    private final IUsersService usersService;

    @Autowired
    public UsersController(IUsersService usersService){
        this.usersService=usersService;
    }

    @Override
    @GetMapping
    public ResponseEntity<Optional> readAll() {
        return ResponseEntity.ok(usersService.readAll());
    }

    @Override
    @GetMapping("/{Id}")
    public ResponseEntity<Optional> readOne(@PathVariable("Id") int Id) {
        return ResponseEntity.ok(usersService.readOne(Id));
    }

    @Override
    @PostMapping
    public ResponseEntity<Optional> insert(@RequestBody AppUser user) {
        return ResponseEntity.ok(usersService.insert(user));
    }

    @Override
    @PutMapping
    public ResponseEntity<Optional> update(@RequestBody AppUser user) {
        return ResponseEntity.ok(usersService.update(user));
    }

    @Override
    @DeleteMapping("/{Id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public ResponseEntity<Optional> delete(@PathVariable("Id") int Id) {
        usersService.delete(Id);
        return ResponseEntity.noContent().build();
    }
}
