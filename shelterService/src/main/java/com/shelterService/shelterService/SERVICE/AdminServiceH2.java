package com.shelterService.shelterService.SERVICE;


import com.shelterService.shelterService.ENTITY.AppAdmin;
import com.shelterService.shelterService.REPOSITORY.AdminRepositoryH2;
import com.shelterService.shelterService.REPOSITORY.IAdminRepository;
import org.springframework.context.annotation.Primary;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;
import java.util.Optional;

@Service
@Primary
public class AdminServiceH2 implements IAdminService {

    private final AdminRepositoryH2 adminRepository;

    public AdminServiceH2(AdminRepositoryH2 adminRepository){
        this.adminRepository=adminRepository;
    }

    @Override
    public Optional<List<AppAdmin>> readAll() {
        try{
            return Optional.of(adminRepository.findAll());
        }catch(Exception ex){
            throw new ResponseStatusException(
                    HttpStatus.NOT_ACCEPTABLE,
                    "CANT READ THE ADMINS "+ ex.getMessage()
            );
        }
    }

    @Override
    public Optional<AppAdmin> readOne(int Id) {
        try{
            return adminRepository.findById(Id);
        }catch(Exception ex){
            throw new ResponseStatusException(
                    HttpStatus.NOT_ACCEPTABLE,
                    "CANT READ THE ADMIN "+ ex.getMessage()
            );
        }
    }

    @Override
    public Optional<AppAdmin> insert(AppAdmin admin) {
        try{
            adminRepository.save(admin);
            return Optional.of(admin);
        }catch(Exception ex){
            throw new ResponseStatusException(
                    HttpStatus.NOT_ACCEPTABLE,
                    "CANT INSERT THE ADMIN "+ ex.getMessage()
            );
        }
    }

    @Override
    public Optional<AppAdmin> update(AppAdmin admin) {
        try{
            adminRepository.save(admin);
            return Optional.of(admin);
        }catch(Exception ex){
            throw new ResponseStatusException(
                    HttpStatus.NOT_ACCEPTABLE,
                    "CANT UPDATE THE ADMIN "+ ex.getMessage()
            );
        }
    }

    @Override
    public void delete(int Id) {
        try{
            adminRepository.deleteById(Id);
        }catch(Exception ex){
            throw new ResponseStatusException(
                    HttpStatus.NOT_ACCEPTABLE,
                    "CANT DELETE THE ADMIN "+ ex.getMessage()
            );
        }
    }
}
