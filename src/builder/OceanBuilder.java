package builder;

import composite.Biome;
import composite.Feature;

public class OceanBuilder extends BiomeBuilder {
    private Biome biome;
    private String name;

    public OceanBuilder(String name){
        this.name = name;
    }
    @Override
    public Biome getBiome() {
        return biome;
    }

    @Override
    public void createNewLandscape() {
        biome = new Biome(name, "Endless depths are waiting to be discovered .But don't drown!");
    }

    @Override
    public void addBottomElements() {
        biome.addElement(new Feature("Shell", "There's so many of them, and they're so shiny!"));
        biome.addElement(new Feature("rock", "This one's sharp, be carefull"));
    }

    @Override
    public void addNatureElements() {
        biome.addElement(new Feature("Eal", "It slitters, and shocks. Auwtsh"));
        biome.addElement(new Feature("Shark", "Shaaaaarks"));
    }

    @Override
    public void addNaturalOrnaments() {
        Biome crevice =new Biome("Crevice", "Would you venture in, and risk everything");
        biome.addElement(crevice);
        crevice.addElement(new Feature("ancient shrine", "What does that do here"));
    }

    @Override
    public void addTreasures() {
        biome.addElement(new Feature("Pirates Treasure", "Marked by a cross, they said!"));
    }
}
