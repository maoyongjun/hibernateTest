package org.justin.hibernateTest.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
* @author:myz
* @version 1.0 
* 创建时间：2018年4月29日 下午5:35:16
*/
@Entity
@Table(name="test3")
public class EntityTable3 {
	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
	private long id;
	private String fileName;
	public long getId() {
		return id;
	}
	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
	public void setId(long id) {
		this.id = id;
	}
	public String getFileName() {
		return fileName;
	}
	public void setFileName(String fileName) {
		this.fileName = fileName;
	}
	
}
