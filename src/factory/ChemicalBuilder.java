package factory;

import java.util.HashMap;
import java.util.Map;

public class ChemicalBuilder {


    public static Chemical createChemicalX() {
        Map recipeX = new HashMap();
        recipeX.put(SchedulableType.GRINDER,3);
        recipeX.put(SchedulableType.MIXER,3);
        recipeX.put(SchedulableType.REACTOR,1);
        recipeX.put(SchedulableType.COOLER,2);
        recipeX.put(SchedulableType.PACKAGER,1);
        return new Chemical(recipeX);
    }
  public static Chemical createChemicalY() {
      Map recipeY = new HashMap();
      recipeY.put(SchedulableType.GRINDER,1);
      recipeY.put(SchedulableType.MIXER,1);
      recipeY.put(SchedulableType.REACTOR,2);
      recipeY.put(SchedulableType.COOLER,2);
      recipeY.put(SchedulableType.PACKAGER,1);
      return new Chemical(recipeY);
    }
  public static Chemical createChemicalZ() {
     Map recipeZ = new HashMap();
      recipeZ.put(SchedulableType.GRINDER,3);
      recipeZ.put(SchedulableType.MIXER,3);
      recipeZ.put(SchedulableType.REACTOR,3);
      recipeZ.put(SchedulableType.COOLER,1);
      recipeZ.put(SchedulableType.PACKAGER,1);
      return new Chemical(recipeZ);

    }

}
