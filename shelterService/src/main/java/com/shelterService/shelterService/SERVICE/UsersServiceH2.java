package com.shelterService.shelterService.SERVICE;

import com.shelterService.shelterService.ENTITY.AppUser;
import com.shelterService.shelterService.REPOSITORY.IShelterUsersRepository;
import com.shelterService.shelterService.REPOSITORY.UsersRepositoryH2;
import org.springframework.context.annotation.Primary;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;
import java.util.Optional;

@Service
@Primary
public class UsersServiceH2 implements IUsersService{
    private final UsersRepositoryH2 usersRepository;

    public UsersServiceH2(UsersRepositoryH2 usersRepository){
        this.usersRepository=usersRepository;
    }

    @Override
    public Optional<List<AppUser>> readAll() {
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
    public Optional<AppUser> readOne(int Id) {
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
    public Optional<AppUser> insert(AppUser user) {
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
    public Optional<AppUser> update(AppUser user) {
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
