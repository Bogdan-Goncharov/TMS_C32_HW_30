package factory.model.character;


import factory.util.Character;

public class CharacterFactory {
    public static Character createCharacter(String type) {
        switch (type.toLowerCase()) {
            case "mage":
                return new Mage();
            case "warrior":
                return new Warrior();
            case "archer":
                return new Archer();
            default:
                throw new IllegalArgumentException("Unknown character type.");
        }
    }
}

