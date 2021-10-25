package com.web.spring_3_1_1.service;

import com.web.spring_3_1_1.model.Role;

import java.util.List;

public interface RoleService {

    Role getRoleByRole(String role);

    Role getRoleById(Long id);

    List<Role> allRoles();

    void addRole(Role role);
}
