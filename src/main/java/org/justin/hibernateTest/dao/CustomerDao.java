package org.justin.hibernateTest.dao;

import org.justin.hibernateTest.entity.Customer;
import org.justin.hibernateTest.entity.EntityTable1;
import org.springframework.data.jpa.repository.JpaRepository;

/**
* @author:myz
* @version 1.0 
* 创建时间：2018年4月29日 下午6:51:50
*/
public interface CustomerDao extends JpaRepository<Customer, Long>{

}
