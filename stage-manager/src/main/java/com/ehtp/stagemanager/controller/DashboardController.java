package com.ehtp.stagemanager.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.ehtp.stagemanager.repository.CompanyRepository;
import com.ehtp.stagemanager.repository.InternshipRepository;
import com.ehtp.stagemanager.repository.StudentRepository;

@Controller

public class DashboardController {

    private final StudentRepository studentRepository;

    private final CompanyRepository companyRepository;

    private final InternshipRepository internshipRepository;

    public DashboardController(StudentRepository studentRepository,

                               CompanyRepository companyRepository,

                               InternshipRepository internshipRepository) {

        this.studentRepository = studentRepository;

        this.companyRepository = companyRepository;

        this.internshipRepository = internshipRepository;

    }

    @GetMapping("/dashboard")

    public String dashboard(Model model) {

        model.addAttribute("studentsCount",

                studentRepository.count());

        model.addAttribute("companiesCount",

                companyRepository.count());

        model.addAttribute("internshipsCount",

                internshipRepository.count());

        model.addAttribute("internships",

                internshipRepository.findAll());

        return "dashboard";

    }

}