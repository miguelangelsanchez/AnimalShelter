package com.shelterService.shelterService.SERVICE;

import com.shelterService.shelterService.ENTITY.Animal;
import com.shelterService.shelterService.REPOSITORY.IShelterRepository;
import org.springframework.context.annotation.Primary;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;
import java.util.Optional;

@Service
@Primary
public class ShelterService implements IShelterService{
    private final IShelterRepository repository;

    public ShelterService(IShelterRepository repository){
        this.repository=repository;
    }

    @Override
    public Optional<List<Animal>> readAll() {
        try{
            return Optional.of(repository.findAll());
        }catch(Exception ex){
            throw new ResponseStatusException(
                    HttpStatus.NOT_ACCEPTABLE,
                    "CANT READ THE ANIMALS "+ ex.getMessage()
            );
        }
    }

    @Override
    public Optional<Animal> readOne(int Id) {
        try{
            return repository.findById(Id);
        }catch(Exception ex){
            throw new ResponseStatusException(
                    HttpStatus.NOT_ACCEPTABLE,
                    "CANT GET THE ANIMAL "+ ex.getMessage()
            );
        }
    }

    @Override
    public Optional<Animal> insert(Animal animal) {
        try{
            repository.save(animal);
            return Optional.of(animal);
        }catch(Exception ex){
            throw new ResponseStatusException(
                    HttpStatus.NOT_ACCEPTABLE,
                    "CANT SAVE THE ANIMAL "+ ex.getMessage()
            );
        }
    }

    @Override
    public Optional<Animal> update(Animal animal) {
        try{
            repository.save(animal);
            return Optional.of(animal);
        }catch(Exception ex){
            throw new ResponseStatusException(
                    HttpStatus.NOT_ACCEPTABLE,
                    "CANT UPDATE THE ANIMAL "+ ex.getMessage()
            );
        }
    }

    @Override
    public void delete(int Id) {
        try{
            repository.deleteById(Id);
        }catch(Exception ex){
            throw new ResponseStatusException(
                    HttpStatus.NOT_ACCEPTABLE,
                    "CANT DELETE THE ANIMAL "+ ex.getMessage()
            );
        }
    }
}
