package com.demo.project.hrworker.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.demo.project.hrworker.entities.Worker;

public interface WorkerRepository extends JpaRepository<Worker, Long> {

}
