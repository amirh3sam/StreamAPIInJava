import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Stream_FlatMap {


    public static void main(String[] args) {


        // so for map we can do some operation on element and return as list like this:
        List<Integer> num = new ArrayList<Integer>(Arrays.asList(1, 2, 4));

        List<Integer> num2 = num.stream().map(e-> e+2).collect(Collectors.toList());
        System.out.println(num2);


        //on FlatMap on the other hand you see we have 3 different list and want to add all in one list

        List<Integer> num3 = new ArrayList<Integer>(Arrays.asList(1, 2, 3));
        List<Integer> num4 = new ArrayList<Integer>(Arrays.asList(4, 5, 6));
        List<Integer> num5 = new ArrayList<Integer>(Arrays.asList(7, 8, 9));

        List<List<Integer>> allNums = Arrays.asList(num3, num4, num5);
        //in this code first we add our list into stream then with flatMap take one bye one of streams and add it to new list
        List<Integer> allNumsInOneList = allNums.stream().flatMap(e -> e.stream()).collect(Collectors.toList());
        System.out.println(allNumsInOneList);

        //even we can do more operation on each list like this:
        List<Integer> allNumsInOneListWithOperation = allNums.stream().flatMap(e -> e.stream()).map(k->k+5).collect(Collectors.toList());
        System.out.println(allNumsInOneListWithOperation);
    }
}
