package org.justin.hibernateTest.entity.tdmac;

import java.util.ArrayList;
import java.util.List;

public class TdMacEntity {
	public static final int MACTYPE=1;
	public static final int TDTYPE=2;
	public static final int FWTYPE=3;
	public static final int BMCTYPE=4;
	private Long snid ;
	private String sn;
	private List<TestResultProperty> properties = new ArrayList<TestResultProperty>();
	private List<TdMacEntity> subEntity = new ArrayList<TdMacEntity>();
	public Long getSnid() {
		return snid;
	}
	public void setSnid(Long snid) {
		this.snid = snid;
	}
	public String getSn() {
		return sn;
	}
	public void setSn(String sn) {
		this.sn = sn;
	}
	
	public TestResultProperty getInstance(int  type){
		TestResultProperty property =null;
		if(MACTYPE==type){
			property= new Mac();
		}else if(TDTYPE == type){
			property= new Td();
		}else if (FWTYPE == type){
			property= new Fw();
		}else if(BMCTYPE==type){
			property = new Bmc();
		}
		return property;
	}
	
	
	public List<TestResultProperty> getProperties() {
		return properties;
	}
	public void setProperties(List<TestResultProperty> properties) {
		this.properties = properties;
	}


	private class Sn implements TestResultProperty{
		private String sn;
		private Long snid;
		
		public String getSn() {
			return sn;
		}
		public void setSn(String sn) {
			this.sn = sn;
		}
		public Long getSnid() {
			return snid;
		}
		public void setSnid(Long snid) {
			this.snid = snid;
		}
		@Override
		public String getTestMsg() {
			return sn;
		}
		@Override
		public void setTestMsg(String msg) {
			this.sn=msg;
		}
		
	}
	
	private class Mac extends Sn {
		private String mac;
		@Override
		public void setTestMsg(String msg) {
			this.mac=msg;
		}
		@Override
		public String getTestMsg() {
			return mac;
		}
		public String getMac() {
			return mac;
		}

		public void setMac(String mac) {
			this.mac = mac;
		}
		
	}
	private class Td extends Sn{
		
		private String td;
		@Override
		public void setTestMsg(String msg) {
			this.td=msg;
		}
		@Override
		public String getTestMsg() {
			return td;
		}
		public String getTd() {
			return td;
		}

		public void setTd(String td) {
			this.td = td;
		}
		

	}
private class Bmc extends Sn{
		
		private String bmc;
		@Override
		public void setTestMsg(String msg) {
			this.bmc=msg;
		}
		@Override
		public String getTestMsg() {
			return bmc;
		}
		public String getBmc() {
			return bmc;
		}
		public void setBmc(String bmc) {
			this.bmc = bmc;
		}
		

	}
	private class Fw extends Sn{
		private String fw;
		private String td;
		@Override
		public void setTestMsg(String msg) {
			this.fw=msg;
		}
		@Override
		public String getTestMsg() {
			return fw;
		}
		public String getFw() {
			return fw;
		}

		public void setFw(String fw) {
			this.fw = fw;
		}
		
	}
	
	
}
