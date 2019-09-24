package com.inti.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.inti.entities.Role;
import com.inti.repositories.RoleRepository;
import com.inti.services.interfaces.IRoleService;

@Service
public class RoleService implements IRoleService {

	@Autowired
	RoleRepository roleRepository;
	
	@Override
	public List<Role> findAll() {
		return roleRepository.findAll();
	}

	@Override
	public Role findById(Long idRole) {
		return roleRepository.findById(idRole).orElse(null);
	}

	@Override
	public void save(Role role) {
		roleRepository.save(role);
		
	}

	@Override
	public void deleteById(Long idRole) {
		roleRepository.deleteById(idRole);
		
	}

}
