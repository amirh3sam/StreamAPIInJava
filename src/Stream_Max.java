import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Stream_Max {

    public static void main(String[] args) {

        List<Integer> numsList = new ArrayList<>(Arrays.asList(1, 2, 33, 4, 22, 65, 78, 8, 8, 9, 9, 0, 10));
        Optional<Integer> max = numsList.stream().max((val1, val2) -> {
            return val1.compareTo(val2);});
        System.out.println("max = " + max.get());
    }
}
