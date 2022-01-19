package ru.kata.spring.boot_security.demo.service;

import ru.kata.spring.boot_security.demo.models.Role;

import java.util.Set;

public interface RoleService {

    Set<Role> getRoles();
    void saveRole(Role role);
}
