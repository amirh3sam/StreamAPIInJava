import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Stream_Concat {


    public static void main(String[] args) {

       // This would create a new stream concatenatedStream containing the elements of both stream1 and stream2.


        Stream<String> stream1 = Arrays.asList("Java","Python","JavaScript").stream();
        Stream<String> stream2 = Stream.of("Java", "Stream");

        Stream<String> concatenatedStream = Stream.concat(stream1, stream2);


        //also you can take it back to list

        List<String> listOfConcatStream = concatenatedStream.collect(Collectors.toList());
        System.out.println("listOfConcatStream = " + listOfConcatStream);


    }
}
