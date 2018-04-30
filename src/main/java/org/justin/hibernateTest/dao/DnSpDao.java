package org.justin.hibernateTest.dao;

import java.util.List;

import org.justin.hibernateTest.entity.EntityTable1;
import org.justin.hibernateTest.entity.SdshippkitemQuery;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.data.repository.query.Param;

public interface DnSpDao extends JpaRepository<SdshippkitemQuery, Long>{
	
	//可以正常使用
	@Query(value = "{call queryDN(?1)}", nativeQuery = true)
	public List<SdshippkitemQuery>  execSpQueryDn1(@Param("dninput") String dn);
	
	//测试参数不声明，查询是否正常:查询正常
	@Query(value = "{call queryDN1(?1)}", nativeQuery = true)
	public List<SdshippkitemQuery>  execSpQueryDn2( String dn);
	
	//测试查询多结果集 ，查询正常
	@Query(value = "{call queryDN1(?1)}", nativeQuery = true)
	public List<SdshippkitemQuery>  execSpQueryDn3( String dn);
	
	//测试通过在实体类中声明的方式查询是否正常
	@Procedure("getDnSp")//java.lang.IllegalArgumentException: Type cannot be null
	public List<SdshippkitemQuery>  execSpQueryDn4(@Param("dninput") String dn);
	
	//测试通过在实体类中声明的方式查询是否正常
	@Procedure("getDnSp5")//java.lang.IllegalArgumentException: Type cannot be null
	public List<SdshippkitemQuery>  execSpQueryDn5(@Param("dninput") String dn);

	//测试通过在实体类中声明的方式查询是否正常
	@Procedure("getDnSp5")//java.lang.IllegalArgumentException: Type cannot be null
	public List<SdshippkitemQuery>  execSpQueryDn6(@Param("dninput") Long dn);
	
	//测试通过在实体类中声明的方式查询是否正常
	@Procedure("getDnSp6")//java.lang.IllegalArgumentException: Type cannot be null
	public List<SdshippkitemQuery>  execSpQueryDn7(@Param("dninput") Long dn,@Param("dninput1") Long dn1);
}
