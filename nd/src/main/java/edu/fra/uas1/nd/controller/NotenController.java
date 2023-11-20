package edu.fra.uas1.nd.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMethod;

import edu.fra.uas1.nd.notenService.NotenService;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class NotenController {

    @Autowired
    private NotenService notenService;

    @GetMapping("/")
    public String zeigeNotenFormular() {
        return "notenFormular";
    }

    @RequestMapping(value = "/durchschnitt", method = RequestMethod.POST)

    public String notenDurchschnitt(@RequestParam int[] noten, Model model) {
        double durchschnitt = notenService.berechnenDurchschnitt(noten);
    model.addAttribute("durchschnitt", durchschnitt);
        return "notenFormular.html";
    }
    
}
