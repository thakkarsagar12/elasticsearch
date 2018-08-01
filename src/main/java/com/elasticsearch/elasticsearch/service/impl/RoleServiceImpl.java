package com.elasticsearch.elasticsearch.service.impl;

import com.elasticsearch.elasticsearch.model.Role;
import com.elasticsearch.elasticsearch.service.RoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;


@Repository
public class RoleServiceImpl {

    @Autowired
    private RoleRepository roleRepository;

    public List<Role> findAllRole(List<Role> roles) {
        List<Role> foundRoles = new ArrayList<>();
        for (Role role:roles) {
            foundRoles.add(roleRepository.findById(role.getId()));
        }
        return foundRoles;
    }


}
