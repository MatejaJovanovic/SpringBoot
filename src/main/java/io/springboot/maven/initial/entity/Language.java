package io.springboot.maven.initial.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="languages")
public class Language {
    @Id
    @GeneratedValue
    private Integer id;
    private String lang;
    private String message;
    @Override
    public String toString(){
        return "Language: "+lang +" Message: "+message;
    }
}
