package org.justin.hibernateTest.dao;

import org.justin.hibernateTest.entity.systemuser.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleDao extends JpaRepository<Role, Long>{

}
