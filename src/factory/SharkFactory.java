package factory;

public class SharkFactory extends FishFactory {
    @Override
    public Fish createFish() {
        return new Shark();
    }
}
