package com.shelterService.shelterService.REPOSITORY;

import com.shelterService.shelterService.ENTITY.AppUser;
import org.springframework.context.annotation.Primary;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Repository
@Primary
public interface UsersRepositoryH2 extends JpaRepository<AppUser,Integer> {
}