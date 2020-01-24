package com.benjamintanone.springdatajpademojava.domain;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Data
public class Customer {
    @Id
    private Long id;
    private String name;
}
