package org.justin.hibernateTest.controller;

import javax.annotation.Resource;

import org.justin.hibernateTest.dao.QueryResultDao;
import org.justin.hibernateTest.entity.tdmac.QueryResult;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableAutoConfiguration
public class TdMacController {
	@Resource
	QueryResultDao queryResultDao;
	
	@GetMapping("/td/query")
	@ResponseBody
	public QueryResult getQueryResult(String sn){
		return queryResultDao.findResultBySysserialno(sn);
		
	}
}
