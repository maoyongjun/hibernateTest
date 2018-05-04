package org.justin.hibernateTest.entity.tdmac;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class TdMacDocument {
	
	Map<Long,TdMacEntity > entitys = new HashMap<Long,TdMacEntity>();
	
	private List<QueryResult> queryResult = new ArrayList<QueryResult>();
	
	//将传入的拼接的SN，转化为集合
	public void addSSN(String ssns){
		String[] ssnsArray =ssns.split(",");
		Long id =-1l;
		for(int i=0;i<ssnsArray.length;i++){
			id = Long.valueOf(i+1);
			TdMacEntity entity = new TdMacEntity();
			entity.setSn(ssnsArray[i]);
			entity.setSnid(id);
			entitys.put(id, entity);
		}
	}
	
	public void buildMacTd(){
		
	}
	
	
	
	
	
	
}
