package factory.model.character;

import factory.util.Character;

public class Archer implements Character {
    @Override
    public void showInfo() {
        System.out.println("Archer: Skilled with the bow and arrows, attacks from distance.");
    }
}
