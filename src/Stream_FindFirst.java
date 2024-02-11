import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Stream_FindFirst {


    /*
    findFirst, it is used to retrieve the first element of the stream, returning an Optional that may or may not contain the first element.
     */
    public static void main(String[] args) {


        List<String> stringList = Arrays.asList("A", "B", "C", "1", "2", "3");

        Optional<String> firstElement = stringList.stream().findFirst();

        System.out.println(firstElement.get());

    }
}