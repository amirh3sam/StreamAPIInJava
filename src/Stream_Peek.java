import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Stream_Peek {

    public static void main(String[] args) {

        /*
        In Java's Stream API, the peek method is used to perform an action on each element of the stream without modifying the elements. It returns a new stream that is identical to the original stream but allows you to perform a non-interfering action on each element as elements flow through the stream pipeline.

Here's an example demonstrating the use of peek:
         */
        // Creating a stream of integers
        Stream<Integer> numbers = Arrays.stream(new Integer[]{1, 2, 3, 4, 5});

        // Using peek to print each element without modifying the stream
        numbers
                .peek(e -> System.out.println("Original element: " + e))
                .map(e -> e * 2) // Some other stream operation (in this case, map)
                .forEach(System.out::println);


        List<Integer> nums = new ArrayList<Integer>(Arrays.asList(2,1,23,40,56,100,33));

        //so peak here print us a result inside the filter and then we get result as Collector List
        List<Integer> collectNums = nums.stream().filter(e -> e % 2 == 0).peek(e -> System.out.println(e)).collect(Collectors.toList());

        System.out.println("collectNums = " + collectNums);



    }
    }

