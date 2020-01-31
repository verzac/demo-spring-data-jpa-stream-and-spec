package com.benjamintanone.springdatajpademojava.repositories.fragments;

import org.springframework.data.jpa.domain.Specification;

import java.util.stream.Stream;

/**
 * What is this, you ask? This is called a "fragment". It allows you to extend the functionality of your repository
 * classes WITHOUT actually implementing your repository. All you have to do is have your @Repository extend this
 * fragment interface and BAM, Spring magically clobbers the Impl of this interface into your repository class.
 * Remember, the "Impl" postfix on the implementation class is what Spring will look for!
 * For more detail, please see
 * https://docs.spring.io/spring-data/data-commons/docs/current/reference/html/#repositories.single-repository-behavior
 * @param <T> the type of the entity object, similar to the T of the {@code <T, ID>} type params in CrudRepository.
 */
public interface StreamableJpaSpecificationRepository<T> {
    /**
     * must be used in a @Transaction
     * @param specification nullable; specification used by the query
     * @param clazz the class of the domain object {@link T}, necessary because we need the class info in the Impl
     * @return
     */
    Stream<T> stream(Specification<T> specification, Class<T> clazz);
}
