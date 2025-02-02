package factory.model.environment;

import factory.util.Environment;

public class Forest implements Environment {
    @Override
    public void showDescription() {
        System.out.println("Forest: A dense area with tall trees and abundant wildlife.");
    }
}
