package Pair;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 * In here you must make firstLast, which will return a pair of the first element in the array list and the last
 * element in the arraylist.
 * You must also make a min method that returns the smallest item in the array list
 * A max method that returns the largest item in the arraylist
 * And a minmax method that returns a pair containing the largest and smallest items from the array list
 */
public class Arrays {



    public static <E> Pair<E> firstLast(ArrayList<E> a) {

        E first = a.get(0);
        E second = a.get(a.size() - 1);

        return new Pair(first, second);
    }

    public static <T> T min (ArrayList<T> list){
        Comparator<T> comparator = (T item1, T item2)->item1.toString().compareTo(item2.toString());
        list.sort(comparator);

        return list.get(0);
    }

    public static <E> E max (ArrayList<E> list){
        Comparator<E> comparator = (E item1, E item2)->item1.toString().compareTo(item2.toString());
        list.sort(comparator);
        return list.get(list.size() - 1);
    }

    public static <E> Pair<E> minMax (ArrayList<E> list){

        return new Pair(min(list), max(list));

    }



}
