package factory;

public class Whale implements Mammal {
    @Override
    public void Suckle() {
        System.out.println("I provide milk to my youngs, my milk contains alot of fat");
    }

    @Override
    public void GiveBirth() {
        System.out.println("No eggs to be found here, i also help my young grow up");
    }

    @Override
    public String getName() {
        return "whale";
    }

    @Override
    public void print() {
        System.out.println("Hey, I'm a whale, i have previously saved humans from sharks");
    }
}
