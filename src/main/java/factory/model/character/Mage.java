package factory.model.character;

import factory.util.Character;

public class Mage implements Character {
    @Override
    public void showInfo() {
        System.out.println("Mage: Uses powerful spells and magic.");
    }
}
