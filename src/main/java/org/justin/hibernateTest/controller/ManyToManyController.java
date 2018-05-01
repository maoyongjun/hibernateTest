package org.justin.hibernateTest.controller;

import java.util.Date;
import java.util.List;
import java.util.Set;

import javax.annotation.Resource;

import org.justin.hibernateTest.dao.SystemUserDao;
import org.justin.hibernateTest.entity.systemuser.Permission;
import org.justin.hibernateTest.entity.systemuser.SystemUser;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
/**
* @author:myz
* @version 1.0 
* 创建时间：2018年4月29日 上午8:42:36
*/
@RestController
@EnableAutoConfiguration
public class ManyToManyController {
	@Resource
	org.justin.hibernateTest.dao.PermissionDao PermissionDao;
	@Resource
	SystemUserDao systemUserDao;
	
	@GetMapping("/user/saveuserP")
	@ResponseBody
	public SystemUser saveUserPermission(Long userid,Long permissionId){
		SystemUser user = systemUserDao.findOne(userid);
		Permission p = PermissionDao.getOne(permissionId);
		Set<Permission> set =  user.getPermissions();
		set.add(p);
		systemUserDao.save(user);
		user.setLastEditDt(new Date());
		user.setLastEditer("saveuserP");
		return user;
	}
	@GetMapping("/user/saveusernewP")
	@ResponseBody
	public SystemUser saveUsernewPermission(Long userid,String permissionName){
		SystemUser user = systemUserDao.findOne(userid);
		Permission p = new Permission();
		p.setPermissionName(permissionName);
		user.getPermissions().add(p);
		user.setLastEditDt(new Date());
		user.setLastEditer("saveuserP");
		return systemUserDao.save(user);
	}
	
	@GetMapping("/user/saveP")
	@ResponseBody
	public Permission savePermission(String permissionName){
		Permission p = new Permission();
		p.setPermissionName(permissionName);
		return PermissionDao.save(p);
	}
	
	@GetMapping("/user/findUserByP")
	@ResponseBody
	public List<SystemUser> findUserByPermission(String permissionName){
		
		return systemUserDao.findUserByPermissionName(permissionName);
	}
	@GetMapping("/user/findPermissionbyUsername")
	@ResponseBody
	public List<Permission> findPermissionbyUsername(String username){
		
		return PermissionDao.findPermissionCustomerByUsername(username);
	}
}
