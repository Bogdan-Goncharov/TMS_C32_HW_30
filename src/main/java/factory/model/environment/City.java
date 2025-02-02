package factory.model.environment;

import factory.util.Environment;

public class City implements Environment {
    @Override
    public void showDescription() {
        System.out.println("City: An urban area with buildings, streets, and bustling life.");
    }
}
