package StackArray;

import java.util.Arrays;

/**
 * Expand the ArrayList implementation of stack here to use an E[] array.  Still implement push, pop, and isEmpty.
 * Remember, you might need to resize the stack in the push method.
 * @param <E>
 */
public class GenericStack<E> {
    private E[] elements;
    private int numberOfElements;

    public GenericStack() {
        this.numberOfElements = 0;
        this.elements = (E[]) new Object[numberOfElements];
    }

    public void push(E e) {
        elements = Arrays.copyOf(elements, numberOfElements + 1);
        elements[numberOfElements - 1] = e;
    }

    public E pop() {
        E lastElement = elements[numberOfElements - 1];
        elements = Arrays.copyOf(elements, numberOfElements - 1);
        return lastElement;
    }

    public boolean isEmpty() {
        return elements.length == 0;
    }


}

//    Implement Stack<E> to use an array as a stack. You'll need to potentially grow the array in the push method.
//    Do this first with an E[] array, and then again with an Object[] array. Both should compile without warnings
//    and pass the tests.