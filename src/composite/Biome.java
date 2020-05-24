package composite;

import iterator.BiomeIterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Biome extends LandscapeElement{
    private List<LandscapeElement> landscapeElements;
    private String name, description;

    public Biome(String name, String description){
        landscapeElements = new ArrayList<>();
        this.name = name;
        this.description = description;
    }

    @Override
    public LandscapeElement getElement(int index) {
        return landscapeElements.get(index);
    }

    @Override
    public void addElement(LandscapeElement feature) {
        landscapeElements.add(feature);
    }

    @Override
    public void removeElement(int index) {
        landscapeElements.remove(index);
    }

    @Override
    public void print() {
        System.out.println(name);
        System.out.println("__" + description);
    }

    @Override
    public Iterator<LandscapeElement> getIterator() {
        return new BiomeIterator(landscapeElements.iterator());
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getDescription() {
        getIterator().forEachRemaining(LandscapeElement::print);
        return description;
    }
}
