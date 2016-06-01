package factory;

import java.util.Map;

public class Chemical {
    private Map<SchedulableType,Integer> recipe;

    public Chemical(Map recipe) {
        this.recipe = recipe;
    }



    public int decrementTimeLeft(SchedulableType schedulableType) {
        recipe.put(schedulableType,recipe.get(schedulableType)-1);
        return recipe.get(schedulableType);
    }
}
