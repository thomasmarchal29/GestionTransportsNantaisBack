package com.inti.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.inti.entities.Role;
import com.inti.services.interfaces.IRoleService;

@RestController
public class RoleController {

	@Autowired
	IRoleService roleService;
	
	@GetMapping(value = "/role")
	public List<Role> findAll(){
		return roleService.findAll();
	}
	@GetMapping(value = "role/{idRole}")
	public Role findOne(@PathVariable("idRole") Long idRole) {
		return roleService.findById(idRole);
	}
	@PostMapping(value = "role")
	public void saveRole(@RequestBody Role role) {
		roleService.save(role);
	}
	@PutMapping(value = "/role/{id}")
	public void update(@PathVariable("id") Long idRole, @RequestBody Role role) {
		Role r = roleService.findById(idRole);
		r.setRoleApplication(role.getRoleApplication());
		roleService.save(r);
	}
	@DeleteMapping(value = "/role/{id}")
	public void deleteById(@PathVariable("id") Long idRole) {
		roleService.deleteById(idRole);
	}
}
