package ServicesClasses;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

@Service
public class FirstService {

    @Autowired
    CounterService counterService;

    public void performAction(){

        counterService.count();
    }
}
