package io.springboot.maven.initial.repository;

import io.springboot.maven.initial.entity.Language;
import org.springframework.data.repository.CrudRepository;
public interface LanguageRepository extends CrudRepository<Language,Integer>{

}
