package com.web.spring_3_1_1.repository;

import com.web.spring_3_1_1.model.Role;

import java.util.List;

public interface RoleDao {
    Role getRoleByRole(String role);

    Role getRoleById(Long id);

    List<Role> allRoles();

     void addRole(Role role);
}




