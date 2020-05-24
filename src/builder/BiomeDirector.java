package builder;

import composite.Biome;

public class BiomeDirector {
    private BiomeBuilder builder;
    public BiomeDirector(BiomeBuilder builder){
        this.builder = builder;
    }

    public void buildBiome(){
        builder.createNewLandscape();
        builder.addBottomElements();
        builder.addNaturalOrnaments();
        builder.addNatureElements();
        builder.addTreasures();
    }

    public Biome getBiome(){
        return builder.getBiome();
    }
}
