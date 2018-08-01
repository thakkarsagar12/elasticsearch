package com.elasticsearch.elasticsearch.service;

import com.elasticsearch.elasticsearch.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<Role, Integer> {

    void deleteById(Long id);

    Role findById(Long id);
}
