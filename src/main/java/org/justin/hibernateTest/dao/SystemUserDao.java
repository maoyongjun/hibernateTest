package org.justin.hibernateTest.dao;

import java.util.List;

import org.justin.hibernateTest.entity.systemuser.SystemUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

/**
* @author:myz
* @version 1.0 
* 创建时间：2018年5月1日 上午9:14:55
*/
public interface SystemUserDao extends JpaRepository<SystemUser, Long> {
	
	@Query(value="SELECT t FROM SystemUser t LEFT JOIN t.subNameList  WHERE t.username=:username ")
	public List<SystemUser> findSystemUserAndSubnameByUserName(@Param("username")String username);
}
