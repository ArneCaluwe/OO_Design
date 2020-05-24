package factory;

public class NemoFactory extends FishFactory {
    @Override
    public Fish createFish() {
        return new ClownFish();
    }
}
