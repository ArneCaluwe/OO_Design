package singleton;

import composite.LandscapeElement;
import builder.BiomeDirector;
import builder.OceanBuilder;

import java.util.ArrayList;
import java.util.List;

public class BiomeManager {
    private static BiomeManager biomeManager;
    private List<LandscapeElement> landscapeElements;

    private BiomeManager(){
        landscapeElements = new ArrayList<>();
    }

    public static BiomeManager getInstance(){
        if(biomeManager == null)
           biomeManager = new BiomeManager();
        return biomeManager;
    }

    public void generate(){
        BiomeDirector director = new BiomeDirector(new OceanBuilder("Atlantic ocean"));
        director.buildBiome();
        landscapeElements.add(director.getBiome());
    }

    public void display(int index){
        System.out.println(landscapeElements.get(index).getDescription());
    }
}
