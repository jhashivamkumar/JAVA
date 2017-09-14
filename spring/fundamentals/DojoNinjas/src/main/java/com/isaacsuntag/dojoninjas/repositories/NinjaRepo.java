package com.isaacsuntag.dojoninjas.repositories;

import org.springframework.data.repository.CrudRepository;

import com.isaacsuntag.dojoninjas.models.Ninja;

public interface NinjaRepo extends CrudRepository <Ninja, Long> {

}
