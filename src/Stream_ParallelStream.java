import java.util.List;
import java.util.stream.Stream;
import java.util.*;

public class Stream_ParallelStream {


    public static void main(String[] args) {





        /*
        In Java, the parallelStream method is used on a collection or a stream to obtain a parallel stream. It allows operations on the stream to be performed concurrently, leveraging multiple threads for improved performance on multi-core processors. For example:
         */

        List<String> list = Arrays.asList("apple", "orange", "banana", "grape");

// Sequential Stream
        Stream<String> sequentialStream = list.stream();

// Parallel Stream
        Stream<String> parallelStream = list.parallelStream();
/*
The parallelStream method is particularly useful for computationally intensive tasks or operations that can be parallelized to take advantage of parallel processing capabilities.
 */




    }
}
