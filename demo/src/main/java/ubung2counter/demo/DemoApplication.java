package ubung2counter.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import ServicesClasses.CounterService;
import ServicesClasses.FirstService;
import ServicesClasses.SecondService;
import ServicesClasses.ThirdService;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

@SpringBootApplication
public class DemoApplication {
	private static final Logger log = LoggerFactory.getLogger(DemoApplication.class);

	@Autowired
    private FirstService firstService;

    @Autowired
    private SecondService secondService;

    @Autowired
    private ThirdService thirdService;

    @Autowired
    private CounterService counterService;

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);

		// Zugriff auf den Kontext und Ausführung nach dem Start
        DemoApplication app = new DemoApplication();
        app.run();
	}
	public void run() {
        // Aufrufe, um den Zähler zu inkrementieren
        firstService.performAction();
        secondService.performAction();
        thirdService.performAction();

        // Beobachtung des Zählerwerts
        log.info("Counter Value: {}", counterService.getCount());
    }
}
