package com.isaacsuntag.license.repositories;

import org.springframework.data.repository.CrudRepository;

import com.isaacsuntag.license.models.License;

public interface LicenseRepository extends CrudRepository <License, Long> {

	License getLicenseByUserId(Long id);

}
