package org.justin.hibernateTest.dao;

import java.util.List;

import org.justin.hibernateTest.entity.systemuser.SystemSubName;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

/**
* @author:myz
* @version 1.0 
* 创建时间：2018年5月1日 上午9:35:36
*/
public interface SystemSubNameDao extends JpaRepository<SystemSubName, Long>{
	
	@Query(name="SELECT t FROM SystemSubName  t  WHERE t.subUserName=:subUserName")
	public List<SystemSubName> findSystemSubBySubUserName(@Param("subUserName")String subUsername);
}
