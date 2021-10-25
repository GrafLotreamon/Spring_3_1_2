package com.web.spring_3_1_1.config;

import com.web.spring_3_1_1.model.Role;
import com.web.spring_3_1_1.model.User;
import com.web.spring_3_1_1.service.RoleService;
import com.web.spring_3_1_1.service.UserService;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.HashSet;
import java.util.Set;


@Component
public class InitDefaultUsers {

    private final UserService userService;
    private final RoleService roleService;

    public InitDefaultUsers(UserService userService, RoleService roleService) {
        this.userService = userService;
        this.roleService = roleService;
    }

    @PostConstruct
    private void createDefaultusers() {
        roleService.addRole(new Role("ROLE_ADMIN"));
        roleService.addRole(new Role("ROLE_USER"));


        User useruser = new User("ADMIN", "admin", "1", "1", "1");
        User useruser2 = new User("USER", "user", "2", "2", "2");

        Set<Role> roles = new HashSet<>();
        roles.add(roleService.getRoleByRole("ROLE_ADMIN"));
        roles.add(roleService.getRoleByRole("ROLE_USER"));

        Set<Role> roles2 = new HashSet<>();
        roles2.add(roleService.getRoleByRole("ROLE_USER"));

        useruser.setRoles(roles);
        userService.addUser(useruser);

        useruser2.setRoles(roles2);
        userService.addUser(useruser2);


        System.out.println("В Базу добавлены два дефолтных юзера: \n" + useruser + "\n" + useruser2 + "\n");


    }
}




