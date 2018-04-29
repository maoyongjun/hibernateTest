package org.justin.hibernateTest.service;

import java.util.List;

import org.justin.hibernateTest.entity.EntityTable1;

/**
* @author:myz
* @version 1.0 
* 创建时间：2018年4月29日 下午12:56:44
*/
public interface TestHibernateService {
	public EntityTable1 saveEntity(EntityTable1 testhibernate);
	public EntityTable1 findEntityByid(Long id);
	public List<EntityTable1> findEntityByName(String name);
}
