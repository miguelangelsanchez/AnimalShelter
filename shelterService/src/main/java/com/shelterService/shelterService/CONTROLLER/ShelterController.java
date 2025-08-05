package com.shelterService.shelterService.CONTROLLER;

import com.shelterService.shelterService.ENTITY.Animal;
import com.shelterService.shelterService.SERVICE.IShelterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@CrossOrigin
@RequestMapping("/api/v1/shelter/animals")
@Primary
public class ShelterController implements IShelterController{
    private final IShelterService shelterService;

    @Autowired
    public ShelterController(IShelterService shelterService){
        this.shelterService=shelterService;
    }

    @Override
    @GetMapping
    public ResponseEntity<Optional> readAll() {
        return ResponseEntity.ok(shelterService.readAll());
    }

    @Override
    @GetMapping("/{Id}")
    public ResponseEntity<Optional> readOne(@PathVariable("Id") int Id) {
        return ResponseEntity.ok(shelterService.readOne(Id));
    }

    @Override
    @PostMapping
    public ResponseEntity<Optional> insert(@RequestBody Animal animal) {
        return ResponseEntity.ok(shelterService.insert(animal));
    }

    @Override
    @PutMapping
    public ResponseEntity<Optional> update(@RequestBody Animal animal) {
        return ResponseEntity.ok(shelterService.update(animal));
    }

    @Override
    @DeleteMapping("/{Id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public ResponseEntity<Optional> delete(@PathVariable("Id") int Id) {
        shelterService.delete(Id);
        return ResponseEntity.noContent().build();
    }
}
