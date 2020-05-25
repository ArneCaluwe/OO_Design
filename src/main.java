import command.Toilet;
import factory.MammalFactory;
import factory.NemoFactory;
import singleton.BiomeManager;
import template.AlionaSwimStroke;
import template.ArneSwimStroke;

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

        Toilet toilet = new Toilet();
        for (int i = 0; i < 5; i++) {
            toilet.flush();
        }
        toilet.save();

        new AlionaSwimStroke().swim();
        new ArneSwimStroke().swim();
    }
}
