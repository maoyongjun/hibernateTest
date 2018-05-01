package org.justin.hibernateTest.dao;

import java.util.List;

import org.justin.hibernateTest.entity.systemuser.Permission;
import org.justin.hibernateTest.entity.systemuser.SystemUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

/**
* @author:myz
* @version 1.0 
* 创建时间：2018年4月29日 下午6:52:27
*/
public interface PermissionDao  extends JpaRepository<Permission, Long>{
	
	@Query(value="SELECT f FROM SystemUser t LEFT JOIN t.permissions  f WHERE t.username=:username ")
	public List<Permission> findPermissionCustomerByUsername(@Param("username")String username);
}
