package com.ehtp.stagemanager.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ehtp.stagemanager.model.Company;

public interface CompanyRepository extends JpaRepository<Company, Long> {

}