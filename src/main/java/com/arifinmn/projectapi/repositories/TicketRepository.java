package com.arifinmn.projectapi.repositories;

import com.arifinmn.projectapi.entities.Status;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TicketRepository extends JpaRepository<Status, Integer> {
}
