package com.zeiterfassung.zeiterfassungssystem.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AdminController {
    @GetMapping("/admin-main")
    public String adminMain(Model model) {

        return "admin-main";

    }
}
