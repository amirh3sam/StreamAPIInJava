import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Stream_Reduce {


    public static void main(String[] args) {
/*
In Java streams, the reduce operation is a powerful and flexible operation that can be used to combine the elements of a stream
into a single result. The reduce operation takes a binary operator (a BinaryOperator<T>) and combines the elements
of the stream according to that operator. It returns an Optional because if the stream is empty, there might be no result.
 */


        //   Optional<Integer> sum = numbers.stream()
        //                .reduce((x, y) -> x + y);

        /*
        .reduce((x, y) -> x + y): Uses the reduce operation with a lambda expression to add elements of the stream together.
         The lambda expression (x, y) -> x + y represents the addition operation.
         */
        List<String> stringList = Arrays.asList("A","B","C","1","2","3");

        Optional<String> reduce = stringList.stream().reduce((value, combinedValue) -> {
            return combinedValue + value;
        });
        System.out.println("reduce.get() = " + reduce.get());

        //another example:

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

// Using reduce to find the sum
        int sum = numbers.stream().reduce(0, (a, b) -> a + b);

        System.out.println("Sum: " + sum);

        //also you can find max or min with reduce too
        List<Integer> newNumbers = Arrays.asList(10, 5, 8, 20, 15);

        // Using reduce to find the maximum element
        Integer maxNumber = newNumbers.stream().reduce(Integer.MIN_VALUE, Integer::max);

        System.out.println("Maximum newNumbers: " + maxNumber);

        List<Integer> anotherNumbers = Arrays.asList(10, 5, 8, 20, 15);

        // Using reduce to find the minimum element
        Integer minNumber = anotherNumbers.stream().reduce(Integer.MAX_VALUE, Integer::min);

        System.out.println("Minimum anotherNumbers: " + minNumber);

        //more example
        List<String> newStringList = Arrays.asList("Java","Python","C++","C#","JavaScript","ScriptType");
//this identity is for we can add something to whole string now we choose not to add anything
      String afterReduce=  newStringList.stream().reduce("",(x,y)->x+ " " +y );
        System.out.println("afterReduce = "+afterReduce);
        //more example
        List<Integer> reducerNums = Arrays.asList(1,2,3,4,5,6);
//this identity is for we can add something to whole int so sum of 1+2+3+4+5+6 =21 and we add 3 =>24
        int afterReducenums=  reducerNums.stream().reduce(3,(x,y)->x+y );
        System.out.println("afterReduce = "+afterReducenums);
    }
    }


