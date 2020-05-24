package factory;

public class Dolphin implements Mammal {

    @Override
    public void Suckle() {
        System.out.println("I provide milk to my youngs");
    }

    @Override
    public void GiveBirth() {
        System.out.println("No eggs to be found here");
    }

    @Override
    public String getName() {
        return "dolphin";
    }

    @Override
    public void print() {
        System.out.println("Hey I'm a dolphin");
    }
}
