package com.sprint.security.example.security.repository;

import com.sprint.security.example.security.model.Role;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
interface RoleRepository extends JpaRepository<Role, Long> {

}