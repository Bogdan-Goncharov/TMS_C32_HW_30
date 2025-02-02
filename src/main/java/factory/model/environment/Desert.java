package factory.model.environment;

import factory.util.Environment;

public class Desert implements Environment {
    @Override
    public void showDescription() {
        System.out.println("Desert: A hot and dry place with sand dunes and scarce vegetation.");
    }
}
