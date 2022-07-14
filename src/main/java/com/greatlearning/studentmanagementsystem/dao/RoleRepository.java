package com.greatlearning.studentmanagementsystem.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.greatlearning.studentmanagementsystem.entity.Role;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {

}
