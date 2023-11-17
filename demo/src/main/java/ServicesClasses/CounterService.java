package ServicesClasses;

import org.springframework.stereotype.Service;

@Service
public class CounterService {
    private int count = 0; 

    public int getCount(){
        return count;
    }

    public void count(){

        count++;
    }
}
