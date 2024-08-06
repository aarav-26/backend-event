package com.project.event.repository;

import com.project.event.model.Events;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EventsRepo extends JpaRepository<Events, Long> {
    // Custom query methods (if needed)
}