import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Stream_Distinct {


    public static void main(String[] args) {


// In Java streams, the distinct operation is used to eliminate duplicate elements from a stream.
// It ensures that only unique elements are included in the resulting stream. Here's a brief example:

        List<String> names = Arrays.asList("John", "Alice", "Bob", "John", "Alice");

        List<String> uniqueNames = names.stream()
                .distinct()
                .collect(Collectors.toList());

        System.out.println(uniqueNames);
    }



    }
