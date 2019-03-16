package Pair;

/**
 * You need to store two values of type `E`, set them in a constructor, and have the following methods,
 * getFirst
 * getSecond
 * min -> returns the minimum of the pair
 * max -> returns the maximum of the pair
 */
public class Pair<E> {

    E element1;
    E element2;

    public Pair(E element1, E element2) {
        this.element1 = element1;
        this.element2 = element2;
    }

    public E getFirst() {
        return element1;
    }

    public E getSecond() {
        return element2;
    }

    public E min() {
        if(element1.toString().compareTo(element2.toString()) == -1){
            return element1;
        } else if(element1.toString().compareTo(element2.toString()) == 1){
            return element2;
        }
        return null;
    }

    public E max() {
        if(element1.toString().compareTo(element2.toString()) == 1){
            return element1;
        } else if(element1.toString().compareTo(element2.toString()) == -1){
            return element2;
        }
        return null;

    }

}
