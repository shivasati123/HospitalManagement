package com.hospital.demo.managehospital.repositories;

import com.hospital.demo.managehospital.model.Patient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository

public interface UserRepository extends JpaRepository<Patient,Integer> {
}
