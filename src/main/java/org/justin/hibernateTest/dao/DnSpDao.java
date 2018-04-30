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
public interface DnSpDao extends JpaRepository<SdshippkitemQuery, Long>{
	
	//可以正常使用
	@Query(value = "{call queryDN(?1)}", nativeQuery = true)
	public List<SdshippkitemQuery>  execSpQueryDn1(String dn);
	
	
	//测试查询多结果集 ，查询正常
	@Query(value = "{call queryDN1(?1)}", nativeQuery = true)
	public List<SdshippkitemQuery>  execSpQueryDn2( String dn);
	
	//存在局限性，方法的返回值，只能用out参数声明
	@Procedure(procedureName="queryDN1",outputParameterName="outs")//java.lang.IllegalArgumentException: Type cannot be null
	public void  execSpQueryDn3(@Param("dninput") String dn);

}
