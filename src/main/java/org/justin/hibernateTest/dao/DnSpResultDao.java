package org.justin.hibernateTest.dao;

import java.util.List;

import org.justin.hibernateTest.entity.EntityTable1;
import org.justin.hibernateTest.entity.SdshippkitemQuery;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface DnSpResultDao extends JpaRepository<SdshippkitemQuery, Long>{
	
	@Query(value = "{call querydn3(?1)}", nativeQuery = true)
	public List<List<?>>     execSpQueryDn1(String dn);

}
