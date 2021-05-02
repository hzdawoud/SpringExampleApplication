package com.hzdawoud.ownspringapp.controller;

import com.hzdawoud.ownspringapp.repository.AuthorRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AuthorController {

    private final AuthorRepository authorRepository;

    public AuthorController(AuthorRepository authorRepository) {
        this.authorRepository = authorRepository;
    }

    @RequestMapping("/authors")
    private String getAuthors(Model model) {

        model.addAttribute("authors", authorRepository.findAll());

        return "authors/list";
    }
}
