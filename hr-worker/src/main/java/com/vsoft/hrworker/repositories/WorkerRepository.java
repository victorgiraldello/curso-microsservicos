package com.vsoft.hrworker.repositories;

import com.vsoft.hrworker.entities.Worker;
import org.springframework.data.jpa.repository.JpaRepository;


public interface WorkerRepository extends JpaRepository<Worker, Long> {

}