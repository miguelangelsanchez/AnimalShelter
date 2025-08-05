package com.shelterService.shelterService.REPOSITORY;

import com.shelterService.shelterService.ENTITY.AppAdmin;
import org.springframework.context.annotation.Primary;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
@Primary
public interface AdminRepositoryH2 extends JpaRepository<AppAdmin,Integer> {
}