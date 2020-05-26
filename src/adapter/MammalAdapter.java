package adapter;

import factory.Fish;
import factory.Mammal;

public class MammalAdapter implements Mammal {

    private final Fish fish;

    public MammalAdapter(Fish fish){
        this.fish = fish;
    }

    @Override
    public void Suckle() {
        System.out.println("My mom doesn't feed me, but i have some grass here");
    }

    @Override
    public void GiveBirth() {
        System.out.println("I come from an egg");
    }

    @Override
    public String getName() {
        return "fishy the mammal";
    }

    @Override
    public void print() {
        System.out.println("I'm a fish dressed as a mammal");
        fish.print();
    }
}
