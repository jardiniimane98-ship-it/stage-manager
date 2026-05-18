package com.ehtp.stagemanager.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ehtp.stagemanager.model.Student;

public interface StudentRepository extends JpaRepository<Student, Long> {

    List<Student> findByNomContainingIgnoreCaseOrEmailContainingIgnoreCaseOrFiliereContainingIgnoreCase(

            String nom,

            String email,

            String filiere

    );

}