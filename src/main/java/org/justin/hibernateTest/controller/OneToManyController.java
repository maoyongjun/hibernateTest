package org.justin.hibernateTest.controller;

import java.util.Date;
import java.util.List;
import java.util.Set;

import javax.annotation.Resource;

import org.justin.hibernateTest.dao.RoleDao;
import org.justin.hibernateTest.dao.SystemUserDao;
import org.justin.hibernateTest.entity.systemuser.Permission;
import org.justin.hibernateTest.entity.systemuser.Role;
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
public class OneToManyController {
	@Resource
	RoleDao roleDao;
	@Resource
	SystemUserDao systemUserDao;
	
	@GetMapping("/role/saveRole")
	@ResponseBody
	public Role saveRole(String roleName){
		Role role = new Role();
		role.setRoleName(roleName);
		role.setLastEditDt(new Date());
		return roleDao.save(role);
	}
	
	@GetMapping("/user/saveRole")
	@ResponseBody
	public SystemUser saveUserRole(Long userId,Long roleId){
		Role role = roleDao.findOne(roleId);
		SystemUser user =  systemUserDao.findOne(userId);
		user.getRoles().add(role);
		user.setLastEditDt(new Date());
		return systemUserDao.save(user);
	}
	
	@GetMapping("/user/addRole")
	@ResponseBody
	public SystemUser saveUserRole(Long userId,String roleName){
		Role role = new Role();
		role.setRoleName(roleName);
		SystemUser user =  systemUserDao.findOne(userId);
		user.getRoles().add(role);
		user.setLastEditDt(new Date());
		user.getUsername();
		return systemUserDao.save(user);
	}
	
	@GetMapping("/user/findUserRoleByUserName")
	@ResponseBody
	public List<SystemUser> findSystemUserAndRole(String userName){
		return  systemUserDao.findUserAndRoleByUserName(userName);
	}
	
}
