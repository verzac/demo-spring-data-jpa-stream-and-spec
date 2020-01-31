package com.benjamintanone.springdatajpademojava.specifications;

import com.benjamintanone.springdatajpademojava.domain.Customer;
import org.springframework.data.jpa.domain.Specification;

public abstract class CustomerSpecification {
    // sample specifications
    public static Specification<Customer> hasName(final String name) {
        if (name == null) {
            return null;
        }
        // SELECT ... FROM Customer c WHERE c.name LIKE %name%;
        return (root, query, criteriaBuilder) -> criteriaBuilder.like(root.get("name"), String.format("%%%s%%", name));
    }
}
