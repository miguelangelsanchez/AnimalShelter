package com.shelterService.shelterService.REPOSITORY;

import com.shelterService.shelterService.ENTITY.Animal;
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
public class ShelterRepositoryHardCoded implements IShelterRepository {

    private List<Animal> animals;

    public ShelterRepositoryHardCoded(){
        animals= new ArrayList<>();

        animals.add(
                new Animal.Builder()
                        .Id(1)
                        .Name("Rayas")
                        .Age(3)
                        .Description("soy una gata rayada europea muy vanidosa")
                        .Img("rayas.jpg")
                        .RegisterDate(new Date())
                        .Update(new Date())
                        .build()
        );

        animals.add(
                new Animal.Builder()
                        .Id(2)
                        .Name("Cheto")
                        .Age(2)
                        .Description("soy un gato naranja y gordo")
                        .Img("cheto.jpg")
                        .RegisterDate(new Date())
                        .Update(new Date())
                        .build()
        );

        animals.add(
                new Animal.Builder()
                        .Id(3)
                        .Name("Mia")
                        .Age(1)
                        .Description("soy una gata capuchino muy traviesa")
                        .Img("mia.jpg")
                        .RegisterDate(new Date())
                        .Update(new Date())
                        .build()
        );
    }

    @Override
    public List<Animal> findAll() {
        return animals;
    }

    @Override
    public Optional<Animal> findById(int Id) {
        return animals.stream().filter(a-> a.getId() == Id).findFirst();
    }

    @Override
    public void save(Animal animal) {
        Optional<Animal> found = animals.stream().filter(a-> a.getId() == animal.getId()).findFirst();

        if(found.isEmpty())
            animals.add(animal);
        else{
            found.ifPresent(f->{
                f.setName(animal.getName());
                f.setAge(animal.getAge());
                f.setDescription(animal.getDescription());
                f.setImg(animal.getImg());
                f.setRegisterDate(animal.getRegisterDate());
                f.setUpdate(animal.getUpdate());
                }
            );
        }
    }

    @Override
    public void deleteById(int Id) {
        boolean animalDeleted = animals.removeIf(a->a.getId()==Id);
        if (!animalDeleted)
            throw new ResponseStatusException(HttpStatus.NOT_FOUND,"animal with id:" + Id +" Not found ");
    }
}
