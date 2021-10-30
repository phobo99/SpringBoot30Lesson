package com.heaven.reactjwt.repository;

import com.heaven.reactjwt.model.ERole;
import com.heaven.reactjwt.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;


public interface RoleRepository extends JpaRepository<Role,Integer> {
    Optional<Role> findByName(ERole role);
}
