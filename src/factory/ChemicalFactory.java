package factory;

import java.util.ArrayList;
import java.util.List;

public class ChemicalFactory {
    List<Chemical> processedList = new ArrayList<>();
    private Schedulable grinder = new Machine(SchedulableType.GRINDER);
    private Schedulable mixer = new Machine(SchedulableType.MIXER);
    private Schedulable reactor = new Machine(SchedulableType.REACTOR);
    private Schedulable cooler = new Process(SchedulableType.COOLER);
    private Schedulable packager = new Machine(SchedulableType.PACKAGER);
    int counter = 0;

    public int processingTime(List<Chemical> chemicalsList) {
        grinder.addChemicals(chemicalsList);
        while (processedList.size() < chemicalsList.size()) {

            List<Chemical> grindedChemical = grinder.run();
            List<Chemical> mixedChemicals = mixer.run();
            List<Chemical> reactedChemicals = reactor.run();
            List<Chemical> cooledChemicals = cooler.run();
            List<Chemical> packagedChemicals = packager.run();

            if (packagedChemicals.size()!=0)
                this.processedList.addAll(packagedChemicals);

            mixer.addChemicals(grindedChemical);
            reactor.addChemicals(mixedChemicals);
            cooler.addChemicals(reactedChemicals);
            packager.addChemicals(cooledChemicals);

            counter++;

        }
        return counter;
    }
}
