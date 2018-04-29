package org.justin.hibernateTest.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.justin.hibernateTest.dao.EntityTable1Dao;
import org.justin.hibernateTest.entity.EntityTable1;
import org.justin.hibernateTest.service.TestHibernateService;
import org.springframework.stereotype.Service;

/**
* @author:myz
* @version 1.0 
* 创建时间：2018年4月29日 下午12:58:58
*/
@Service
public class TestHibernateServiceImpl implements TestHibernateService {
	
	@Resource
	private EntityTable1Dao entityTable1Dao;
	
	@Override
	public EntityTable1 saveEntity(EntityTable1 testhibernate) {
		return entityTable1Dao.save(testhibernate);
	}

	@Override
	public EntityTable1 findEntityByid(Long id) {
		// TODO Auto-generated method stub
		return entityTable1Dao.findOne(id);
	}

	public List<EntityTable1> findEntityByName(String name) {
		// TODO Auto-generated method stub
		return entityTable1Dao.findEntityByName(name);
	}

}
