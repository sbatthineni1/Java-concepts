package dev.lpa;

public class Dog extends Animal{
    public Dog(String type, String size, double weight) {
        super(type, size, weight);
    }

    @Override
    public void move(String speed) {
        System.out.println(getExplicitType()+" moves " + speed);

    }

    @Override
    public void makeNoise() {
        System.out.println("Woof Woof!!!");
    }

}
