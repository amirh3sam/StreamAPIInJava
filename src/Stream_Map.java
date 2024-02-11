import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Stream_Map {


    public static void main(String[] args) {


        //In Java streams, the map operation transforms each element of the stream using a provided function, producing
        // a new stream of the transformed elements.


        List<String> names = new ArrayList<String>(Arrays.asList("amir", "amirhesam", "hesam", "david"));

        // so in this task we keep first letter uppercase and rest lower case with stream.map
        List<String> upperCaseName = names.stream()
                .map(e -> e.substring(0, 1).toUpperCase() + e.substring(1).toLowerCase()).collect(Collectors.toList());
        System.out.println(upperCaseName);



    }

}
