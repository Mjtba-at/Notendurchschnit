package edu.fra.uas1.nd.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class NotenController {

    @RequestMapping(value="hello", method=RequestMethod.GET)

    @ResponseBody
    public String getGelloworld() {
        return "<h1> this is your Spring boot</h1>";
    }
    


    
}
