import java.util.ArrayList;
import java.util.Arrays;
import java.util.Set;
import java.util.Vector;
import java.util.function.Function;
import java.util.logging.Filter;

public class Main {
    public static void main(String[] args) {

    }

    public static <T> T[] filter(T[] array, Function<? super T, Boolean> filter) {
        int offset = 0;

        for (int i = 0; i < array.length; i++) {
            if (!filter.apply(array[i])) {
                offset++;
            } else {
                array[i - offset] = array[i];
            }
        }
        return Arrays.copyOf(array, array.length - offset);
    }

}
