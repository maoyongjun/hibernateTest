package org.justin.hibernateTest.dao;

import java.util.List;

import org.justin.hibernateTest.entity.SdshippkitemQuery;
import org.justin.hibernateTest.entity.SdshippkitemResult;
import org.justin.hibernateTest.entity.SdshippkitemResult2;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface DnSpResultDao extends JpaRepository<SdshippkitemResult, Long>{
	public static final String TYPE="a";
	
	@Query(value = "{call querydn3(?1,?2)}", nativeQuery = true)
	public List<SdshippkitemResult>     execSpQueryDn(String type,String dn);

}
