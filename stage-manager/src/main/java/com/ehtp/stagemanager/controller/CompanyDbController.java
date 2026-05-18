package com.ehtp.stagemanager.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.ehtp.stagemanager.model.Company;
import com.ehtp.stagemanager.repository.CompanyRepository;

@Controller

public class CompanyDbController {

    @Autowired

    private CompanyRepository companyRepository;

    @GetMapping("/companies-db")

    public String listCompanies(Model model) {

        model.addAttribute("companies", companyRepository.findAll());

        model.addAttribute("company", new Company());

        return "companies-db";

    }

    @PostMapping("/companies-db/save")

    public String saveCompany(@ModelAttribute Company company) {

        companyRepository.save(company);

        return "redirect:/companies-db";

    }

    @GetMapping("/companies-db/delete/{id}")

    public String deleteCompany(@PathVariable Long id) {

        companyRepository.deleteById(id);

        return "redirect:/companies-db";

    }

}