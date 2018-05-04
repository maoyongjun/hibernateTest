package org.justin.hibernateTest.dao;

import org.justin.hibernateTest.entity.tdmac.QueryResult;
import org.justin.hibernateTest.entity.tdmac.QueryResultKey;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.NoRepositoryBean;
import org.springframework.data.repository.query.Param;

//@NoRepositoryBean
public interface QueryResultDao extends JpaRepository<QueryResult, Long>{
	
	@Query(value="SELECT t FROM QueryResult t  WHERE t.sysserialno=:sn ")
	public QueryResult findResultBySysserialno(@Param("sn")String sn);

}
