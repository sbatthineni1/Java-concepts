package dev.lpa;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Dog husky = new Dog("Husky", "Huge", 34);
//        husky.move("fast");
//        husky.makeNoise();
//        doAnimalStuff(husky);
        ArrayList<Animal> animals = new ArrayList<>();
        animals.add(husky);
        animals.add(new Dog("German Shepard", " Big", 120));
        animals.add(new Fish("Goldfish", "small", 5));
        animals.add(new Fish("Barrcuda", "Big", 30));

        for (Animal animal : animals) {
            doAnimalStuff(animal);
        }
    }

    private static void doAnimalStuff(Animal animal) {
        animal.makeNoise();
        animal.move("slow");
    }
}

