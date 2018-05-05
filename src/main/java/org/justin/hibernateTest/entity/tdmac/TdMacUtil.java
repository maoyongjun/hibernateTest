package org.justin.hibernateTest.entity.tdmac;

import java.util.List;

public class TdMacUtil {
	
	public List<TestResultProperty> addTdsFromFiled2(TdMacEntity entity,String filed2){
		
		int fromIndex=filed2.indexOf("ETH");
		int toIndex=filed2.indexOf(";", fromIndex);
		String tds=filed2.substring(fromIndex, toIndex);
		tds = tds.replaceAll("ETH<|ETH\\{|ETH\\(|>", "");
		String[] tdArray = tds.split(",");
		for(String temp:tdArray){
			TestResultProperty p = entity.getInstance(TdMacEntity.TDTYPE);
			p.setTestMsg(temp);
			entity.getProperties().add(p);
		}
		return entity.getProperties();
	}
	
	public List<TestResultProperty> addBmcFromFiled2(TdMacEntity entity,String filed2){
		int fromIndex=filed2.indexOf("BMC");
		int toIndex=filed2.length();
		String bmc=filed2.substring(fromIndex, toIndex);
		TestResultProperty p = entity.getInstance(TdMacEntity.BMCTYPE);
		bmc = bmc.toUpperCase().replaceAll("BMC<|BMC\\(|BMC\\{|>", "");
		p.setTestMsg(bmc);
		entity.getProperties().add(p);
		return entity.getProperties();
	}
}
