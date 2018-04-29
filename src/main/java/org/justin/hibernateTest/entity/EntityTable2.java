package org.justin.hibernateTest.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.data.domain.Example;

/**
* @author:myz
* @version 1.0 
* 创建时间：2018年4月29日 下午4:42:19
*/
@Entity
@Table(name="test2")
public class EntityTable2 {
	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
	private long id;
	private String name;
	public long getId() {
		return id;
	}
	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}
