package dev.lpa;

public class Fish extends Animal{
    public Fish(String type, String size, double weight) {
        super(type, size, weight);
    }

    @Override
    public void move(String speed) {
        if(speed == "slow") {
            System.out.println(getExplicitType() + " moves " + speed);
        }
        else{
            System.out.println(getExplicitType()+ " moves " + speed);

        }

    }

    @Override
    public void makeNoise() {
        if(type == "Goldfish") {
            System.out.println("Swish..!!");
        }
        else{
            System.out.println("Swooshh & splash!!");
        }

    }
}
