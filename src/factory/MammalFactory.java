package factory;

public class MammalFactory {

    public Mammal createMammal(String mammal){
        switch (mammal){
            case "dolphin":
                return new Dolphin();
            case "whale":
                return new Whale();
            default:
                throw new IllegalArgumentException();
        }
    }
}
