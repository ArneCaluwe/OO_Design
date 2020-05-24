package iterator;

import composite.LandscapeElement;

import java.util.Iterator;

public class NullIterator implements Iterator<LandscapeElement> {
    @Override
    public boolean hasNext() {
        return false;
    }

    @Override
    public LandscapeElement next() {
        return null;
    }
}
