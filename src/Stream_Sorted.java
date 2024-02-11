import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Stream_Sorted {

    public static void main(String[] args) {


        /*
         is used to return a new stream with elements sorted in their natural order or based on a provided comparator.

         */
        // if we want to sort it in asc order :
        List<Integer> numList = Arrays.asList(5,2,3,4,5,1,10,9,12);
        List  sorted = numList.stream().sorted().collect(Collectors.toList());
        System.out.println("Sorted in Asc order : " + sorted);

        // if we want to sort it in desc order :

        List  sortedInReverseOrder = numList.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        System.out.println("sortedInReverseOrder = " + sortedInReverseOrder);
    }
}
