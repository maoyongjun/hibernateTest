package org.justin.hibernateTest.controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.annotation.Resource;
import javax.persistence.EntityManager;
import javax.persistence.StoredProcedureQuery;

import org.justin.hibernateTest.dao.CustomerDao;
import org.justin.hibernateTest.dao.DnSpDao;
import org.justin.hibernateTest.dao.DnSpResultDao;
import org.justin.hibernateTest.dao.DnSpResultDao2;
import org.justin.hibernateTest.dao.EntityTable2Dao;
import org.justin.hibernateTest.dao.EntityTable3Dao;
import org.justin.hibernateTest.dao.PermesssionDao;
import org.justin.hibernateTest.dao.SystemSubNameDao;
import org.justin.hibernateTest.dao.SystemUserDao;
import org.justin.hibernateTest.entity.Customer;
import org.justin.hibernateTest.entity.EntityTable1;
import org.justin.hibernateTest.entity.EntityTable2;
import org.justin.hibernateTest.entity.EntityTable3;
import org.justin.hibernateTest.entity.Permesssion;
import org.justin.hibernateTest.entity.SdshippkitemQuery;
import org.justin.hibernateTest.entity.SdshippkitemResult;
import org.justin.hibernateTest.entity.SdshippkitemResult2;
import org.justin.hibernateTest.entity.systemuser.SystemSubName;
import org.justin.hibernateTest.entity.systemuser.SystemUser;
import org.justin.hibernateTest.service.TestHibernateService;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
/**
* @author:myz
* @version 1.0 
* 创建时间：2018年4月29日 上午8:42:36
*/
@RestController
@EnableAutoConfiguration
public class TestController {
	
	@Resource
	TestHibernateService testHibernateService;
	
	@Resource
	CustomerDao customerDao;
	
	@Resource
	PermesssionDao permesssionDao;
	
	@Resource
	EntityTable2Dao table2Dao;
	
	@Resource
	EntityTable3Dao table3Dao;
	
	@Resource
	DnSpResultDao dnSpResultDao;
	
	@Resource
	DnSpResultDao2 dnSpResultDao2;
	@Resource
	DnSpDao dnSpDao;
	
	@Resource
	EntityManager manager;
	
	@Resource
	SystemUserDao systemUserDao;
	
	@Resource
	SystemSubNameDao systemSubNameDao;
	
	@GetMapping
	public String test(){
		return "test";
	}
	//通过调用实体类中的声明查询，不使用接口
	@GetMapping("/queryDN")
	@ResponseBody
	public List<SdshippkitemQuery> queryDN(String dn){
		StoredProcedureQuery query =manager.createNamedStoredProcedureQuery("getDnSp");
		query.setParameter("dninput", "abc");
		query.execute();
		return query.getResultList();
	}
	
	
	@GetMapping("/queryDN1")
	@ResponseBody
	public List<SdshippkitemQuery> queryDN1(String dn){
		
		return dnSpDao.execSpQueryDn1(dn);
	}
	@GetMapping("/queryDN2")
	@ResponseBody
	public List<SdshippkitemQuery> queryDN2(String dn){
		
		return dnSpDao.execSpQueryDn2(dn);
	}
	
	@GetMapping("/queryDN3")
	@ResponseBody
	public List<SdshippkitemQuery> queryDN3(String dn){
		 dnSpDao.execSpQueryDn3(dn);
		 return null;
	}
	@GetMapping("/queryDN4")
	@ResponseBody
	public List<List<?>>   queryDN4(String dn){
		List<List<?>> list = new ArrayList<>();
		List<SdshippkitemResult> list1 = dnSpResultDao.execSpQueryDn(dnSpResultDao.TYPE, dn);
		List<SdshippkitemResult2> list2 = dnSpResultDao2.execSpQueryDn(dnSpResultDao2.TYPE, dn);
		list.add(list1);
		list.add(list2);
//		list = dnSpResultDao.execSpQueryDn0(dnSpResultDao.TYPEA, dn);
		return list;
	}
	
	@GetMapping("/user/findAll")
	@ResponseBody	
	public List<SystemUser> findAll(){
		return systemUserDao.findAll();
	}
	
	@GetMapping("/user/findByUsername")
	@ResponseBody	
	public List<SystemUser> findByUserName(String username){
		return systemUserDao.findSystemUserAndSubnameByUserName(username);
	}
	
	
	@GetMapping("/user/findSubByName")
	@ResponseBody	
	public List<SystemSubName> findSubByUserName(String subUsername){
		return systemSubNameDao.findSystemSubBySubUserName(subUsername);
	}
	
	@GetMapping("/user/save")
	@ResponseBody	
	public SystemUser saveUser(String username){
		SystemUser user = new SystemUser();
		user.setUsername(username);
		return systemUserDao.save(user);
	}
	
	
	@GetMapping("/user/saveSub")
	@ResponseBody	
	public SystemSubName saveUserSubName(Long userid,String subName){
		SystemUser user= systemUserDao.findOne(userid);
		SystemSubName sub = new SystemSubName();
		sub.setSubUserName(subName);
		sub.setUser(user);
		user.setLastEditDt(new Date());
		user.setSubCount(Long.valueOf(user.getSubNameList().size()+1));
		return systemSubNameDao.save(sub);
	}
	
	@GetMapping("/user/saveUserNew")
	@ResponseBody	
	public SystemUser saveSystemUserName(String userName){
		SystemSubName sub = new SystemSubName();
		sub.setSubUserName("subNameDefault");
		SystemUser user= new SystemUser();
		user.getSubNameList().add(sub);
		user.setUsername(userName);
		user.setLastEditDt(new Date());
		user.setSubCount(Long.valueOf(user.getSubNameList().size()));
		sub.setUser(user);//在被东方维护关系 ，这里需要设置，为了保存外键ID
		return systemUserDao.save(user);
	}
	

	@GetMapping("/user/findOneSub")
	@ResponseBody	
	public SystemSubName findOneSubName(Long subid){
		return systemSubNameDao.findOne(subid);
	}
	
	@GetMapping("/user/findAllSub")
	@ResponseBody	
	public List<SystemSubName> findSubName(){
		return systemSubNameDao.findAll();
	}
	
	@GetMapping("/save1")
	@ResponseBody
	public Customer testSave1(String custerName, String p1,String p2){
		Permesssion pe1= new Permesssion();
		pe1.setPermesssionName(p1);
		Permesssion pe2= new Permesssion();
		pe2.setPermesssionName(p2);
		permesssionDao.save(pe1);
		permesssionDao.save(pe2);
		Set set = new HashSet<>();
		set.add(pe1);
		set.add(pe2);
		Customer customer = new Customer();
		customer.setCustomerName(custerName);
		customer.setPermesssions(set);
		customerDao.save(customer);
		return customer;
		
		
	}
	
	@GetMapping("/save")
	@ResponseBody
	public EntityTable1 testSave(EntityTable1 testhibernate ){
		EntityTable2 entityTable2 = table2Dao.findOne(Long.valueOf(1l));
		if(null==entityTable2){
			entityTable2 = 		new EntityTable2();
			table2Dao.save(entityTable2);
		}
		entityTable2.setName("ggg");
		
		testhibernate.setEntityTable2(entityTable2);
		EntityTable3 table301= new EntityTable3();
		EntityTable3 table302= new EntityTable3();
		EntityTable3 table303= new EntityTable3();
		table301.setFileName("file1");
		table302.setFileName("file2");
		table303.setFileName("file3");
		table3Dao.save(table301);
		table3Dao.save(table302);
		table3Dao.save(table303);
		List<EntityTable3> list = new ArrayList<EntityTable3>();
		list.add(table301);
		list.add(table302);
		list.add(table303);
		testhibernate.setEntityTable3(list);
		return testHibernateService.saveEntity(testhibernate);
	}
	@GetMapping("/findOne")
	@ResponseBody
	public EntityTable1 testFindOne(Long id ){
		
		return testHibernateService.findEntityByid(id);
	}
	@GetMapping("/findByName")
	@ResponseBody
	public List<EntityTable1> testFindByName(String name){
		return testHibernateService.findEntityByName(name);
	}
	
	@GetMapping("/findCusterByPName")
	@ResponseBody
	public List<Permesssion> testfindCusterByPName(String pName){
		return permesssionDao.findPermessionCustomerByPermessionName(pName);
	}
}
