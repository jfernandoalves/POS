package com.example.springbootjpa.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class MessageOfDay {

    @Id
    private Long code;
    private String description;

    public Long getCode() {
        return code;
    }

    public void setCode(Long code) {
        this.code = code;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}