package com.inti.services.interfaces;

import java.util.List;

import com.inti.entities.Role;

public interface IRoleService {

	public List<Role> findAll();
	public Role findById(Long idRole);
	public void save(Role role);
	public void deleteById(Long idRole);
}
