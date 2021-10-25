package com.web.spring_3_1_1.repository;

import org.springframework.stereotype.Repository;
import com.web.spring_3_1_1.model.Role;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
public class RoleDaoImpl implements RoleDao {

    @PersistenceContext
    private EntityManager entityManager;

    protected EntityManager getEntityManager() {
        return this.entityManager;
    }


    @Override
    public Role getRoleByRole(String role) {
        return getEntityManager()
                .createQuery("select r from Role r where r.role = :role", Role.class)
                .setParameter("role", role)
                .getSingleResult();
    }

    @Override
    public Role getRoleById(Long id) {
        return getEntityManager().find(Role.class, id);
    }

    @Override
    public List<Role> allRoles() {
        return getEntityManager()
                .createQuery("select r from Role r", Role.class)
                .getResultList();
    }

    @Override
    public void addRole(Role role) {
        getEntityManager().persist(role);
    }

}
