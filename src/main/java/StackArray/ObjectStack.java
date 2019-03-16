package StackArray;

import java.util.Arrays;

/**
 * Expand the ArrayList implementation of stack here to use an Object[] array.  Still implement push, pop, and isEmpty.
 * Remember, you might need to resize the stack in the push method.
 * @param <E>
 */
public class ObjectStack<E> {
    private Object[] elements;
    private int numberOfElements;

    public ObjectStack() {
        this.numberOfElements = 0;
        this.elements = new Object[numberOfElements];
    }

    public void push(E e) {
        elements = Arrays.copyOf(elements, numberOfElements + 1);
        numberOfElements++;
        elements[numberOfElements - 1] = e;
    }

    public Object pop() {
        Object lastElement = elements[numberOfElements - 1];
        elements = Arrays.copyOf(elements, numberOfElements - 1);
        numberOfElements--;
        return lastElement;
    }

    public boolean isEmpty() {
        return elements.length == 0;
    }



}
