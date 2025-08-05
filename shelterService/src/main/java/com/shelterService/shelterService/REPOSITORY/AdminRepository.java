package com.shelterService.shelterService.REPOSITORY;

import com.shelterService.shelterService.ENTITY.Admin;
import org.springframework.context.annotation.Primary;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;
import org.springframework.web.server.ResponseStatusException;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;

@Component
@Primary
public class AdminRepository implements  IAdminRepository {

    private final List<Admin> admins;

    public AdminRepository(){
        admins= new ArrayList<Admin>();

        admins.add(
                new Admin.Builder()
                        .Id(1)
                        .User("miguel")
                        .Password("e51972")
                        .Name("Miguel Angel")
                        .RegisterDate(new Date())
                        .Update(new Date())
                        .build()
        );

        admins.add(
                new Admin.Builder()
                        .Id(2)
                        .User("marco")
                        .Password("r8795")
                        .Name("Marco Antonio")
                        .RegisterDate(new Date())
                        .Update(new Date())
                        .build()
        );
    }

    @Override
    public List<Admin> findAll() {
        return admins;
    }

    @Override
    public Optional<Admin> findById(int Id) {
        return admins.stream().filter(a->a.getId()==Id).findFirst();
    }

    @Override
    public void save(Admin admin) {
        Optional<Admin> found = admins.stream().filter(a->a.getId()==admin.getId()).findFirst();

        if(found.isEmpty())
            admins.add(admin);
        else{
            found.ifPresent(f->{
                f.setUser(admin.getUser());
                f.setPassword(admin.getPassword());
                f.setName(admin.getPassword());
                f.setRegisterDate(admin.getRegisterDate());
                f.setUpdate(new Date());
            });
        }


    }

    @Override
    public void deleteById(int Id) {
        boolean adminDeleted = admins.removeIf(a->a.getId()==Id);

        if(!adminDeleted)
            throw new ResponseStatusException(HttpStatus.NOT_FOUND,"admin with id:" + Id +" Not found ");

    }
}
