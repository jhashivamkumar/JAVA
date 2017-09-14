package com.isaacsuntag.license.repositories;

import org.springframework.data.repository.CrudRepository;

import com.isaacsuntag.license.models.User;

public interface UserRepository extends CrudRepository <User, Long> {

}
