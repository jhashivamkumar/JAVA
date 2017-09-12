package com.isaacsuntag.languagesreloaded.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.isaacsuntag.languagesreloaded.models.Language;
import com.isaacsuntag.languagesreloaded.repositories.LanguageRepository;

@Service
public class LanguageService {
	private LanguageRepository languageRepository;

    public LanguageService(LanguageRepository languageRepository){
        this.languageRepository = languageRepository;
    }
    
    public List<Language> allLangs() {
        return (List<Language>) languageRepository.findAll();
    }
    
    public void addLang(Language lang) {
    		languageRepository.save(lang);
    }
    
    public Language findLangById(Long id) {
    		return languageRepository.findOne(id);
    }
    
    public void updateLang(Language lang) {
    		languageRepository.save(lang);
    }
    
    public void deleteLang(Long id) {
    		languageRepository.delete(id);
    }
}
