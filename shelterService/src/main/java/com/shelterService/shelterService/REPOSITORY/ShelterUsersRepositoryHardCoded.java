
package com.shelterService.shelterService.REPOSITORY;

import com.shelterService.shelterService.ENTITY.AppUser;
import org.springframework.context.annotation.Primary;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;
import org.springframework.web.server.ResponseStatusException;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;

@Component
//@Primary
public class ShelterUsersRepositoryHardCoded implements IShelterUsersRepository{
    private List<AppUser> users;

    public ShelterUsersRepositoryHardCoded(){
        users= new ArrayList<AppUser>();

        users.add(
                new AppUser.Builder()
                        .Id(1)
                        .Name("Anahi")
                        .Age(40)
                        .Img("anahi.jpg")
                        .Address("Congreso de la union 525")
                        .RegisterDate(new Date())
                        .Update(new Date())
                        .build()
        );

        users.add(
                new AppUser.Builder()
                        .Id(2)
                        .Name("Luna Rubi")
                        .Age(10)
                        .Img("luna.jpg")
                        .Address("av de las palmas 251")
                        .RegisterDate(new Date())
                        .Update(new Date())
                        .build()
        );

        users.add(
                new AppUser.Builder()
                        .Id(3)
                        .Name("Venus Esmeralda")
                        .Age(10)
                        .Img("venus.jpg")
                        .Address("av tejones 212")
                        .RegisterDate(new Date())
                        .Update(new Date())
                        .build()
        );
    }

    @Override
    public List<AppUser> findAll() {
        return users;
    }

    @Override
    public Optional<AppUser> findById(int Id) {
        return users.stream().filter(u->u.getId()==Id).findFirst();
    }

    @Override
    public void save(AppUser user) {
        Optional<AppUser> found = users.stream().filter(u->u.getId()==user.getId()).findFirst();

        if(found.isEmpty())
            users.add(user);
        else{
            found.ifPresent(
                    f->{
                        f.setAge(user.getAge());
                        f.setName(user.getName());
                        f.setImg(user.getImg());
                        f.setAddress(user.getAddress());
                        f.setRegisterDate(user.getRegisterDate());
                        f.setUpdate(new Date());
                    }
            );
        }
    }

    @Override
    public void deleteById(int Id) {
        boolean userDeleted = users.removeIf(u->u.getId()==Id);
        if(!userDeleted)
            throw new ResponseStatusException(HttpStatus.NOT_FOUND,"user with id:" + Id +" Not found ");
    }
}
