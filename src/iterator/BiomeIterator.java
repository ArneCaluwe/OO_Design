package iterator;

import composite.Biome;
import composite.LandscapeElement;

import java.util.Iterator;
import java.util.Stack;

public class BiomeIterator implements Iterator<LandscapeElement> {
    Stack<Iterator<LandscapeElement>> stack;

    public BiomeIterator(Iterator<LandscapeElement> iterator){
        stack = new Stack<>();
        stack.push(iterator);
    }
    @Override
    public boolean hasNext() {
        if(stack.isEmpty())
            return false;
        Iterator<LandscapeElement> iterator = stack.peek();
        if(!iterator.hasNext()) {
            stack.pop();
            return hasNext();
        }
        return true;

    }

    @Override
    public LandscapeElement next() {
        if (hasNext()) {
            Iterator<LandscapeElement> iterator = stack.peek();
            LandscapeElement element = iterator.next();
            if (element instanceof Biome) {
                stack.push(element.getIterator());
            }
            return element;
        } else {
            return null;
        }
    }
}
