package com.shelterService.shelterService.SERVICE;

import com.shelterService.shelterService.ENTITY.User;
import com.shelterService.shelterService.REPOSITORY.IShelterUsersRepository;
import org.springframework.context.annotation.Primary;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;
import java.util.Optional;

@Service
@Primary
public class UsersService implements IUsersService{
    private IShelterUsersRepository usersRepository;

    public UsersService(IShelterUsersRepository usersRepository){
        this.usersRepository=usersRepository;
    }

    @Override
    public Optional<List<User>> readAll() {
        try{
            return Optional.of(usersRepository.findAll());
        }catch(Exception ex){
            throw new ResponseStatusException(
                    HttpStatus.NOT_ACCEPTABLE,
                    "CANT READ THE USERS "+ ex.getMessage()
            );
        }
    }

    @Override
    public Optional<User> readOne(int Id) {
        try{
            return usersRepository.findById(Id);
        }catch(Exception ex){
            throw new ResponseStatusException(
                    HttpStatus.NOT_ACCEPTABLE,
                    "CANT READ THE USER "+ ex.getMessage()
            );
        }
    }

    @Override
    public Optional<User> insert(User user) {
        try{
            usersRepository.save(user);
            return Optional.of(user);
        }catch(Exception ex){
            throw new ResponseStatusException(
                    HttpStatus.NOT_ACCEPTABLE,
                    "CANT SAVE THE USER "+ ex.getMessage()
            );
        }
    }

    @Override
    public Optional<User> update(User user) {
        try{
            usersRepository.save(user);
            return Optional.of(user);
        }catch(Exception ex){
            throw new ResponseStatusException(
                    HttpStatus.NOT_ACCEPTABLE,
                    "CANT UPDATE THE USER "+ ex.getMessage()
            );
        }
    }

    @Override
    public void delete(int Id) {
        try{
            usersRepository.deleteById(Id);
        }catch(Exception ex){
            throw new ResponseStatusException(
                    HttpStatus.NOT_ACCEPTABLE,
                    "CANT DELETE THE USER "+ ex.getMessage()
            );
        }
    }
}
