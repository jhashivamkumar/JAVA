package com.isaacsuntag.admindash.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.isaacsuntag.admindash.models.Role;
import com.isaacsuntag.admindash.repositories.RoleRepository;

@Service
public class RoleService {
	private RoleRepository roleRepository;
	
	public RoleService(RoleRepository roleRepository)     {
        this.roleRepository = roleRepository;
    }
    public Role findByName(String name) {
        return roleRepository.findByName(name);
    }
}
