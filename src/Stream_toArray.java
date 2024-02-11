import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class Stream_toArray {


    public static void main(String[] args) {
/*
In Java streams, the toArray operation is used to convert the elements of a stream into an array.
 The method returns an array containing the elements of the stream.
 */

        List<String> stringList = Arrays.asList("A","B","C","1","2","3");

        Object arr[] = stringList.stream().toArray();
        System.out.println("arr.length = " + arr.length);


    }
}
