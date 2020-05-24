package builder;

import composite.Biome;

public abstract class BiomeBuilder {

    public abstract Biome getBiome();

    public abstract void createNewLandscape();

    public abstract void addBottomElements();
    public abstract void addNatureElements();
    public abstract void addNaturalOrnaments();
    public abstract void addTreasures();
}
