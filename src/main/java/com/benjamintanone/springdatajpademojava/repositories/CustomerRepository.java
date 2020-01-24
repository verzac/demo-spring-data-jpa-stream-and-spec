package com.benjamintanone.springdatajpademojava.repositories;

import com.benjamintanone.springdatajpademojava.domain.Customer;
import com.benjamintanone.springdatajpademojava.repositories.fragments.StreamableJpaSpecificationRepository;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.stream.Stream;

@Repository
public interface CustomerRepository extends CrudRepository<Customer, Long>, StreamableJpaSpecificationRepository<Customer> {
    // https://docs.spring.io/spring-data/jpa/docs/current/reference/html/#repositories.query-streaming
    @Query("select c from Customer c")
    Stream<Customer> streamQueryAnnotation();

    @Query("select c from Customer c")
    Stream<Customer> streamWithPageable(Pageable pageable);
}
