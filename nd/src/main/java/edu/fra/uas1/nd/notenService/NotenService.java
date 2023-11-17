package edu.fra.uas1.nd.notenService;

import org.springframework.stereotype.Service;
import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Service
public class NotenService {
    private static final Logger LOGGER = LoggerFactory.getLogger(NotenService.class);

    private int[] noten;

   // @PostConstruct
    // public void initializeData() {
        // Hier können Sie die Dateninitialisierung implementieren
       // noten = new int[]{80, 75, 90, 85, 70};
        //LOGGER.info("Daten wurden initialisiert: " + noten);
    //}

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
    // methode mit @postConstruct zur Datenintiatlisierung wird vorm Anwendungsbeginn abgerufen. 
    @PostConstruct
    public void initializeData(){
        
        LOGGER.info("daten wurde initiliziert" + noten);
    }
     // methode um daten zu löschen mit hilfe von @PreDestroy
     @PreDestroy
     public void deleteData(){

        LOGGER.info("daten werden hier gelöscht: "+ noten);
     }
}