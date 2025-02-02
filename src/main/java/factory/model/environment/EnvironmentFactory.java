package factory.model.environment;

import factory.util.Environment;

public class EnvironmentFactory {
    public static Environment createEnvironment(String type) {
        switch (type.toLowerCase()) {
            case "desert":
                return new Desert();
            case "forest":
                return new Forest();
            case "city":
                return new City();
            default:
                throw new IllegalArgumentException("Unknown environment type.");
        }
    }
}
