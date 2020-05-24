package composite;


import java.util.Iterator;
import iterator.NullIterator;

public class Feature extends LandscapeElement {

    private String name, description;

    public Feature(String name, String description){
        this.name = name;
        this.description = description;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public void print() {
        System.out.println(name);
        System.out.println("__"+ description);
    }

    @Override
    public Iterator<LandscapeElement> getIterator() {
        return new NullIterator();
    }
}
