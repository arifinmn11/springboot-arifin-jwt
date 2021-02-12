package com.arifinmn.projectapi.repositories;

import com.arifinmn.projectapi.entities.CustomerServices;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerServiceRepository extends JpaRepository<CustomerServices, Integer> {
}
