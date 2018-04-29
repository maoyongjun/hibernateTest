package org.justin.hibernateTest.dao;

import java.util.List;

import org.justin.hibernateTest.entity.Permesssion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

/**
* @author:myz
* @version 1.0 
* 创建时间：2018年4月29日 下午6:52:27
*/
public interface PermesssionDao  extends JpaRepository<Permesssion, Long>{
	@Query("SELECT t,p from Permesssion t left join t.customers p  where t.permesssionName = :pName ")
	public List<Permesssion> findPermessionCustomerByPermessionName(@Param("pName")String pName);
}
