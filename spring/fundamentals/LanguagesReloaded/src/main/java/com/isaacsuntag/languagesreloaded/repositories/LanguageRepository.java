package com.isaacsuntag.languagesreloaded.repositories;

import org.springframework.data.repository.CrudRepository;

import com.isaacsuntag.languagesreloaded.models.Language;

public interface LanguageRepository extends CrudRepository<Language, Long> {

}
