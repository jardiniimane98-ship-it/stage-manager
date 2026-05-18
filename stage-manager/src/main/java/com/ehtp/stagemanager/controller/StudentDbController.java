package com.ehtp.stagemanager.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.ehtp.stagemanager.model.Student;
import com.ehtp.stagemanager.repository.StudentRepository;

@Controller

public class StudentDbController {

    private final StudentRepository studentRepository;

    public StudentDbController(StudentRepository studentRepository) {

        this.studentRepository = studentRepository;

    }

    @GetMapping("/students-db")

    public String studentsDb(Model model,

                             @RequestParam(required = false) String keyword){

        List<Student> students;

        if(keyword != null && !keyword.isEmpty()){

            students = studentRepository

                    .findByNomContainingIgnoreCaseOrEmailContainingIgnoreCaseOrFiliereContainingIgnoreCase(

                            keyword,

                            keyword,

                            keyword

                    );

        }else{

            students = studentRepository.findAll();

        }

        model.addAttribute("students", students);

        model.addAttribute("student", new Student());

        model.addAttribute("keyword", keyword);

        return "students-db";

    }

    @PostMapping("/students-db/save")

    public String saveStudent(@ModelAttribute Student student){

        studentRepository.save(student);

        return "redirect:/students-db";

    }

    @GetMapping("/students-db/delete/{id}")

    public String deleteStudent(@PathVariable Long id){

        studentRepository.deleteById(id);

        return "redirect:/students-db";

    }

    @GetMapping("/students-db/edit/{id}")

    public String editStudent(@PathVariable Long id, Model model){

        Student student = studentRepository.findById(id).orElse(null);

        model.addAttribute("student", student);

        model.addAttribute("students", studentRepository.findAll());

        return "students-db";

    }

}