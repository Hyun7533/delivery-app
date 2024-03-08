package com.delivery.delivery.join;

import jakarta.persistence.criteria.Join;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JoinRepository extends JpaRepository<JoinEntity, Long> {

}
