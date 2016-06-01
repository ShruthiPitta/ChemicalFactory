package factory;

import java.util.ArrayList;
import java.util.List;

import static java.util.Arrays.asList;

public class Machine extends Schedulable {

    @Override
    public List<Chemical> run() {
        Chemical currentChemical = this.chemicalQueue.peek();
        if(currentChemical==null)
            return new ArrayList<>();
        int timeLeft = currentChemical.decrementTimeLeft(schedulableType);
        if(timeLeft==0){
           return asList(this.chemicalQueue.poll());
        }
        return new ArrayList<>();
    }

    public Machine(SchedulableType sType) {
        super(sType);
    }


    @Override
    public boolean isFree() {
        return chemicalQueue.isEmpty();
    }
}
