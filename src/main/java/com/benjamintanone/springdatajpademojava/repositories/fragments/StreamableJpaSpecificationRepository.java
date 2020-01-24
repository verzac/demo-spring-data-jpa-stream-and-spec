package com.benjamintanone.springdatajpademojava.repositories.fragments;

import org.springframework.data.jpa.domain.Specification;

import java.util.stream.Stream;

public interface StreamableJpaSpecificationRepository<T> {
    Stream<T> stream(Specification<T> specification, Class<T> clazz);
}
