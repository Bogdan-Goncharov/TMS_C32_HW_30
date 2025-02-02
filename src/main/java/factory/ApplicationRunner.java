package factory;

import factory.model.character.CharacterFactory;
import factory.model.environment.EnvironmentFactory;
import factory.util.Character;
import factory.util.Environment;

public class ApplicationRunner {
        public static void main(String[] args) {
            Character character = CharacterFactory.createCharacter("mage");
            Environment environment = EnvironmentFactory.createEnvironment("desert");

            character.showInfo();
            environment.showDescription();

            System.out.println(character.getClass().getSimpleName() + " is in " + environment.getClass().getSimpleName());
        }
    }


