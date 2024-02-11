import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Stream_limit {


    public static void main(String[] args) {

         /*
        In Java streams, the limit operation is used to reduce the size of a stream to a specified number of elements.
        It is often used in combination with other stream operations to limit the
        processing or output to a certain quantity. Here's a simple example:
         */
        List<String> names = Arrays.asList("John", "Alice", "Bob", "John", "Alice");

        List<String> uniqueNames = names.stream()
                .distinct()
                .collect(Collectors.toList());


        //only keep the first two element from 3 element
        List<String> limitNamesList = names.stream().limit(2).collect(Collectors.toList());

        System.out.println("limitNamesList = " + limitNamesList);
    }
}
