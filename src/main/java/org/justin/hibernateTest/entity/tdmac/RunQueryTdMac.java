package org.justin.hibernateTest.entity.tdmac;

public class RunQueryTdMac {
	public static void main(String[] args) {
		
		
		TdMacEntity entity = new TdMacEntity();
		TestResultProperty p = entity.getInstance(TdMacEntity.TDTYPE);
		p.setTestMsg("123");
		entity.getProperties().add(p);
	}
}
