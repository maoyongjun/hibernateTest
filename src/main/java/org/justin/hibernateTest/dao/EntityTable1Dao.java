package org.justin.hibernateTest.dao;

import java.util.List;

import javax.persistence.Table;

import org.justin.hibernateTest.entity.EntityTable1;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

/**
* @author:myz
* @version 1.0 
* 创建时间：2018年4月29日 下午12:51:17
*/
@Repository
@Table(name="testHibernate")
@Qualifier("testHibernateDao")
public interface EntityTable1Dao extends JpaRepository<EntityTable1, Long>{
	public EntityTable1 findOne(Long id);
	public EntityTable1 save(EntityTable1 testhibernate);
	
	@Query("SELECT t,p from EntityTable1 t left join t.entityTable2 p  where t.name = :name ")
	public List<EntityTable1> findEntityByName(@Param("name") String name);
}
