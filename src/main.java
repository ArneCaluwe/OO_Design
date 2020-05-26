import adapter.MammalAdapter;
import command.Toilet;
import factory.Mammal;
import factory.MammalFactory;
import factory.NemoFactory;
import factory.Shark;
import proxy.App;
import proxy.WaterApplication;
import singleton.BiomeManager;
import template.AlionaSwimStroke;
import template.ArneSwimStroke;

import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class main {

    public static void main(String[] args) {
       new Runner().run();
    }
}



class Runner{
    public void run() {
        BiomeManager manager = BiomeManager.getInstance();
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

        Mammal fish = new MammalAdapter(new Shark());
        fish.print();
    }
    public void RegisterRemote(){

        try {
            Registry registry = LocateRegistry.createRegistry(1099);
            App app = new WaterApplication();
            registry.rebind("app", app);
        } catch (RemoteException e) {
            e.printStackTrace();
        }
    }

}
