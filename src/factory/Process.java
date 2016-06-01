package factory;

import java.util.ArrayList;
import java.util.List;

public class Process extends Schedulable {
    public Process(SchedulableType sType) {
        super(sType);
    }

    @Override
    public List<Chemical> run() {

        ArrayList<Chemical> processedChemicals = new ArrayList<>();
        for(Chemical chemical:chemicalQueue) {
            int timeLeft = chemical.decrementTimeLeft(schedulableType);
            if (timeLeft == 0) {
                processedChemicals.add(this.chemicalQueue.poll());
            }
        }
        return processedChemicals;
    }

    @Override
    public boolean isFree() {
        return true;
    }

}
