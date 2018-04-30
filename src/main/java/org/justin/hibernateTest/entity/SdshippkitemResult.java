package org.justin.hibernateTest.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class SdshippkitemResult implements Serializable{
	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
	private Long id;
	private String orderno;
	private String shiporderno ;
	private String sysserialno;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getOrderno() {
		return orderno;
	}
	public void setOrderno(String orderno) {
		this.orderno = orderno;
	}
	public String getShiporderno() {
		return shiporderno;
	}
	public void setShiporderno(String shiporderno) {
		this.shiporderno = shiporderno;
	}
	public String getSysserialno() {
		return sysserialno;
	}
	public void setSysserialno(String sysserialno) {
		this.sysserialno = sysserialno;
	}
	
}
