package org.justin.hibernateTest.entity.tdmac;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name = "mfsyscserial")
@IdClass(MfsyscserialKey.class)	
public class Mfsyscserial {
	@Id
	String	sysserialno;
	@Id
	String	cserialno;
	String	custpartno;
	String	eeecode;
	String	partno;
	Integer	seqno;
	String	categoryname;
	String	othercategoryname;
	String	prodtype;
	String	formtype;
	String	eventpoint;
	String	stationname;
	String	lasteditby;
	@Id
	Date	lasteditdt;
	@Transient
	String sysserialnos;
	@Transient
	String cserialnos;
	@Transient
	String	categorynames;
	@Transient
	String description;
	@Transient
	String	oldlasteditdt;
	
	public String getOldlasteditdt() {
		return oldlasteditdt;
	}
	public void setOldlasteditdt(String oldlasteditdt) {
		this.oldlasteditdt = oldlasteditdt;
	}
	public String getCserialnos() {
		return cserialnos;
	}
	public void setCserialnos(String cserialnos) {
		this.cserialnos = cserialnos;
	}
	public String getSysserialno() {
		return sysserialno;
	}
	public void setSysserialno(String sysserialno) {
		this.sysserialno = sysserialno;
	}
	public String getCserialno() {
		return cserialno;
	}
	public void setCserialno(String cserialno) {
		this.cserialno = cserialno;
	}
	public String getCustpartno() {
		return custpartno;
	}
	public void setCustpartno(String custpartno) {
		this.custpartno = custpartno;
	}
	public String getEeecode() {
		return eeecode;
	}
	public void setEeecode(String eeecode) {
		this.eeecode = eeecode;
	}
	public String getPartno() {
		return partno;
	}
	public void setPartno(String partno) {
		this.partno = partno;
	}
	public Integer getSeqno() {
		return seqno;
	}
	public void setSeqno(Integer seqno) {
		this.seqno = seqno;
	}
	public String getCategoryname() {
		return categoryname;
	}
	public void setCategoryname(String categoryname) {
		this.categoryname = categoryname;
	}
	public String getOthercategoryname() {
		return othercategoryname;
	}
	public void setOthercategoryname(String othercategoryname) {
		this.othercategoryname = othercategoryname;
	}
	public String getProdtype() {
		return prodtype;
	}
	public void setProdtype(String prodtype) {
		this.prodtype = prodtype;
	}
	public String getFormtype() {
		return formtype;
	}
	public void setFormtype(String formtype) {
		this.formtype = formtype;
	}
	public String getStationname() {
		return stationname;
	}
	public void setStationname(String stationname) {
		this.stationname = stationname;
	}
	public String getLasteditby() {
		return lasteditby;
	}
	public void setLasteditby(String lasteditby) {
		this.lasteditby = lasteditby;
	}
	
	public Date getLasteditdt() {
		return lasteditdt;
	}
	public void setLasteditdt(Date lasteditdt) {
		this.lasteditdt = lasteditdt;
	}
	public String getSysserialnos() {
		return sysserialnos;
	}
	public void setSysserialnos(String sysserialnos) {
		this.sysserialnos = sysserialnos;
	}
	
	public String getEventpoint() {
		return eventpoint;
	}
	public void setEventpoint(String eventpoint) {
		this.eventpoint = eventpoint;
	}
	@Override
	public String toString() {
		return "MfsyscserialModel [sysserialno=" + sysserialno + ", cserialno=" + cserialno + ", custpartno="
				+ custpartno + ", eeecode=" + eeecode + ", partno=" + partno + ", seqno=" + seqno + ", categoryname="
				+ categoryname + ", othercategoryname=" + othercategoryname + ", prodtype=" + prodtype + ", formtype="
				+ formtype + ", eventpoint=" + eventpoint + ", stationname=" + stationname + ", lasteditby="
				+ lasteditby + ", lasteditdt=" + lasteditdt + ", sysserialnos=" + sysserialnos + "]";
	}
	public String getCategorynames() {
		return categorynames;
	}
	public void setCategorynames(String categorynames) {
		this.categorynames = categorynames;
	}

	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
}
