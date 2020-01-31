package com.benjamintanone.springdatajpademojava.repositories.fragments;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.domain.Specification;

import javax.persistence.EntityManager;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import java.util.stream.Stream;

import static org.hibernate.jpa.QueryHints.HINT_FETCH_SIZE;

public class StreamableJpaSpecificationRepositoryImpl<T> implements StreamableJpaSpecificationRepository<T> {
    @Autowired
    private EntityManager entityManager;

    @Override
    public Stream<T> stream(Specification<T> specification, Class<T> clazz) {
        CriteriaBuilder criteriaBuilder = entityManager.getCriteriaBuilder();
        CriteriaQuery<T> criteriaQuery = criteriaBuilder.createQuery(clazz);
        Root<T> root = criteriaQuery.from(clazz);
        criteriaQuery.select(root);
        // do some sanity checks for your pleasure
        if (specification != null) {
            criteriaQuery.where(specification.toPredicate(root, criteriaQuery, criteriaBuilder));
        }
        return entityManager.createQuery(criteriaQuery)
                .setHint(HINT_FETCH_SIZE, "1") // depends on your DB implementation; MySQL expects "" + Integer.MIN_VALUE
                .getResultStream();
    }
}
