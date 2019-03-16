package MapFunc;

import sun.jvm.hotspot.oops.Array;

import java.util.ArrayList;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * Create a function called `map` that takes an ArrayList and a `Function<T,R>` object,
 * and returns an ArrayList with all of the elements of the first after the function is applied to them.
 */
public class MapFunc {

    public static <T, R> ArrayList<R> map(ArrayList<T> list, Function<T,R> function) {
        return (ArrayList<R>) list.stream()
                .map(function)
                .collect(Collectors.toList());
    }

}
