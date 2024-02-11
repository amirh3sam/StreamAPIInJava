import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Stream_Min {


    public static void main(String[] args) {

/*

In Java streams, the min operation is used to find the minimum element of a stream based on a specified comparator or natural ordering.
It returns an Optional containing the minimum element, or an empty Optional if the stream is empty. Here's an example:
 */
        List<Integer> numsList = new ArrayList<>(Arrays.asList(1, 2, 33, 4, 22, 65, 78, 8, 8, 9, 9, 0, 10));
/*
((val1, val2) -> { return val1.compareTo(val2); }): : This is a lambda expression representing a comparator. It compares two
elements (val1 and val2) using their natural ordering by invoking the compareTo method. It returns a negative integer,
zero, or a positive integer if the first element is less than, equal to, or greater than the second element, respectively.
 */


        Optional<Integer> min = numsList.stream().min((val1, val2) -> {
            return val1.compareTo(val2);});
/*
The min operation returns an Optional containing the minimum element of the stream, or an empty Optional if the stream is empty. Note that the code snippet
 doesn't consume or utilize the result of the min operation, so it may not have a visible effect in its current form.
 */
        System.out.println("min = " + min.get());
    }
}