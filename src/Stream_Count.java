import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Stream_Count {


    public static void main(String[] args) {


/*

In Java streams, the count operation is used to obtain the count of elements in a stream. It returns a long value
 representing the number of elements in the stream. Here's an example:
 */


        List<String> names = Arrays.asList("John", "Alice", "Bob", "John", "Alice");

        List<String> uniqueNames = names.stream()
                .distinct()
                .collect(Collectors.toList());

        long count = uniqueNames.stream().distinct().count();

        System.out.println(count);
    }

}

