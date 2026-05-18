package com.ehtp.stagemanager.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.ehtp.stagemanager.model.Internship;
import com.ehtp.stagemanager.repository.InternshipRepository;

@Controller

public class InternshipDbController {

    @Autowired

    private InternshipRepository internshipRepository;

    @GetMapping("/internships-db")

    public String listInternships(Model model) {

        model.addAttribute("internships", internshipRepository.findAll());

        model.addAttribute("internship", new Internship());

        return "internships-db";

    }

    @PostMapping("/internships-db/save")

    public String saveInternship(@ModelAttribute Internship internship) {

        internshipRepository.save(internship);

        return "redirect:/internships-db";

    }

    @GetMapping("/internships-db/delete/{id}")

    public String deleteInternship(@PathVariable Long id) {

        internshipRepository.deleteById(id);

        return "redirect:/internships-db";

    }

}