package org.justin.hibernateTest.dao;

import java.util.List;

import org.justin.hibernateTest.entity.tdmac.QueryResult2;
import org.justin.hibernateTest.entity.tdmac.QueryResultKey;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

//@NoRepositoryBean
public interface QueryResult2Dao extends JpaRepository<QueryResult2, QueryResultKey>{
	
	@Query(value="SELECT t FROM QueryResult2 t  WHERE t.sysserialno=:sn ")
	public List<QueryResult2> findResultBySysserialno(@Param("sn")String sn);

}
