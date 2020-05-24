import factory.MammalFactory;
import factory.NemoFactory;
import singleton.BiomeManager;

public class main {

    public static void main(String[] args) {
        new Runner().run();
    }
}
class Runner{
    public void run(){
        BiomeManager  manager = BiomeManager.getInstance();
        manager.generate();
        manager.display(0);

        new MammalFactory().createMammal("dolphin").print();
        new NemoFactory().createFish().print();
    }
}
