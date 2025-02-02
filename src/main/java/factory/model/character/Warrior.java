package factory.model.character;

import factory.util.Character;

public class Warrior implements Character {
    @Override
    public void showInfo() {
        System.out.println("Warrior: Strong and brave, excels in close combat.");
    }
}
