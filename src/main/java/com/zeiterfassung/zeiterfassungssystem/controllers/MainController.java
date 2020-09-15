package com.zeiterfassung.zeiterfassungssystem.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class MainController {

    @GetMapping("/")
    public String home(Model model) {
        model.addAttribute("title", "Hauptfenster");
        return "home";
    }

    @GetMapping("/urlaub")
    public String urlaub(Model model) {
        model.addAttribute("title", "Urlaubsfenster");
        return "urlaub";
    }

    @GetMapping("/abwesenheit")
    public String abwesenheit(Model model) {
        model.addAttribute("title", "Abwesenheitsfenster");
        return "abwesenheit";
    }

    @GetMapping("/eigene")
    public String eigene(Model model) {
        model.addAttribute("title", "Eigene Infos");
        return "eigene";
    }

}
