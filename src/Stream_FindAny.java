import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Stream_FindAny {



    /*
    the findAny method is used to retrieve an arbitrary element from the stream, returning an Optional that may or may not contain the found element.
     */
    public static void main(String[] args) {

        List<String> stringList = Arrays.asList("A","B","C","1","2","3");

        Optional<String> anyElement = stringList.stream().findAny();
//get() here if for retrieve the actual element instead get Optional value
        //if I do not use get() gonna give me the value inside the [ ]
        System.out.println(anyElement.get());

        //and if my list do not have any element gonna return me noSuchElementException


    }
}
