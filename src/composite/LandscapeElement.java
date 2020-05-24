package composite;

import java.util.Iterator;

public abstract class LandscapeElement {

    public String getName(){
        throw new UnsupportedOperationException();
    }

    public String getDescription(){
        throw new UnsupportedOperationException();
    }

    public LandscapeElement getElement(int index){
        throw new UnsupportedOperationException();
    }

    public void addElement(LandscapeElement feature){
        throw new UnsupportedOperationException();
    }

    public void removeElement(int index){
        throw new UnsupportedOperationException();
    }

    public abstract void print();

    public abstract Iterator<LandscapeElement> getIterator();


}
