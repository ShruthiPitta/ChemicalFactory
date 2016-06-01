package factory;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public abstract class Schedulable {
    protected SchedulableType schedulableType ;
    protected Queue<Chemical> chemicalQueue = new LinkedList<>();



    public Schedulable(SchedulableType sType) {
        this.schedulableType = sType;
    }

    public List<Chemical> run() {
        return null;
    }

    public boolean isFree() {
        return false;
    }

    public void addChemicals(List<Chemical> chemicals){
        this.chemicalQueue.addAll(chemicals);
    }
}
