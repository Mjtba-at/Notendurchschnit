package ServicesClasses;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SecondService {

    @Autowired
    private CounterService counterService;

    public void performAction(){

        counterService.count();
    }
    
}
