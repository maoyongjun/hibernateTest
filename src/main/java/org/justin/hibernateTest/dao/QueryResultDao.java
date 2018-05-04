package org.justin.hibernateTest.dao;

import java.util.List;

import org.justin.hibernateTest.entity.tdmac.QueryResult;
import org.justin.hibernateTest.entity.tdmac.QueryResultKey;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

//@NoRepositoryBean
public interface QueryResultDao extends JpaRepository<QueryResult, QueryResultKey>{
	
	@Query(value="SELECT t FROM QueryResult t  WHERE t.sysserialno=:sn ")
	public List<QueryResult> findResultBySysserialno(@Param("sn")String sn);

}
