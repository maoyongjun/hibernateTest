package org.justin.hibernateTest.entity.tdmac;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.persistence.Embeddable;
import javax.persistence.Entity;
import javax.persistence.Table;

@Embeddable
public class MfsyscserialKey implements Serializable{
	String	sysserialno;
	String	cserialno;
	Date	lasteditdt;
	public MfsyscserialKey(){}
	public MfsyscserialKey(String sysserialno, String cserialno, Date lasteditdt) {
		super();
		this.sysserialno = sysserialno;
		this.cserialno = cserialno;
		this.lasteditdt = lasteditdt;
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
	public Date getLasteditdt() {
		return lasteditdt;
	}
	public void setLasteditdt(Date lasteditdt) {
		this.lasteditdt = lasteditdt;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((cserialno == null) ? 0 : cserialno.hashCode());
		result = prime * result + ((lasteditdt == null) ? 0 : lasteditdt.hashCode());
		result = prime * result + ((sysserialno == null) ? 0 : sysserialno.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		MfsyscserialKey other = (MfsyscserialKey) obj;
		if (cserialno == null) {
			if (other.cserialno != null)
				return false;
		} else if (!cserialno.equals(other.cserialno))
			return false;
		if (lasteditdt == null) {
			if (other.lasteditdt != null)
				return false;
		} else if (!lasteditdt.equals(other.lasteditdt))
			return false;
		if (sysserialno == null) {
			if (other.sysserialno != null)
				return false;
		} else if (!sysserialno.equals(other.sysserialno))
			return false;
		return true;
	}

}
