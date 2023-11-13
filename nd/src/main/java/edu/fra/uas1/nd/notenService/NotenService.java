package edu.fra.uas1.nd.notenService;

import org.springframework.stereotype.Service;

@Service
public class NotenService {

    // Methode zur Brechnung der Durchschnitt mit hilfe einer if schleife
    public double berechnenDurchschnitt(int[] noten){
        if (noten == null || noten.length == 0) {
            return 0;
        }

        double sum = 0;

        for (int note : noten) {

            sum += note;
        }
        return sum / noten.length;
    }
    
}