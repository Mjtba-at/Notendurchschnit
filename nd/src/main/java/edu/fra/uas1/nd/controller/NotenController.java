package edu.fra.uas1.nd.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import edu.fra.uas1.nd.notenService.NotenService;

import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class NotenController {

    @Autowired
    private NotenService notenService;
   

    @RequestMapping(value = "/durchschnitt", method = RequestMethod.GET)
    @ResponseBody
    public double notenDurchschnitt(int[] noten) {
        return notenService.berechnenDurchschnitt(noten);
    }
    // Test-Endpunkt nur für Testzwecke
   // @RequestMapping(value = "/test/durchschnitt", method = RequestMethod.GET)
  //  @ResponseBody
   // public double testNotenDurchschnitt() {
        // Testdaten hier zuweisen
    //    int[] testNoten = {80, 75, 90, 85};
      //  return notenService.berechnenDurchschnitt(testNoten);
    //}
}
