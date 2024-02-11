import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Stream_Skip {

    public static void main(String[] args) {

        /*
        skip method is used to skip a specified number of elements from the beginning of a stream. It returns a new stream that consists of the remaining elements after skipping the specified number.
         */


        // Creating a stream of integers
        Stream<Integer> numbers = Arrays.stream(new Integer[]{1, 2, 3, 4, 5});

        // Skipping the first two elements
        Stream<Integer> skippedStream = numbers.skip(2);

        // Displaying the elements of the resulting stream
        skippedStream.forEach(System.out::println);

        /*
        In this example, the skip(2) method is used to skip the first two elements of the stream. The resulting stream, skippedStream, contains the elements 3, 4, and 5.
         */


//another example

        List<Integer> newListOfNumbers = new ArrayList<Integer>(Arrays.asList(2,1,23,40,56,100,33));

        //if I want to skip first 4 element and just keep " 56,100,33 we can do this:

        List<Integer> skip4thElement = newListOfNumbers.stream().skip(4).collect(Collectors.toList());
        System.out.println("skip4thElement = " + skip4thElement);

    }
    }

