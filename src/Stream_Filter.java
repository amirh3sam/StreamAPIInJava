import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Stream_Filter {


    public static void main(String[] args) {

        System.out.println("------------------Print even number----------------------");

        List<Integer> numbers = new ArrayList<Integer>(Arrays.asList(2,1,23,40,56,100,33));

       // we want to creat new list with only even number

       List<Integer> evenNumbers=  numbers.stream()
                .filter(each -> each % 2 == 0).collect(Collectors.toList());
       // now we can print the new list
        System.out.println(evenNumbers);
        for (Integer each:evenNumbers
            ) {
            System.out.println(each);
        }
        System.out.println("------------filter and Print even number in one line code--------------");

       // if we want to do chain of function we can filter and print each number on one line code

        numbers.stream()
                .filter(each -> each % 2 == 0).forEach(each-> System.out.println(each));

        System.out.println("------------------Print odd number----------------------");
        // Odd numbers also I show another to print all the element that pass through the filter
        //forEach(each-> System.out.println(each)  exact same as forEach(System.out::println)
        numbers.stream()
                .filter(eachNumber -> eachNumber % 2 !=0).forEach(System.out::println);

        System.out.println("------------------numbers between 2 and 40----------------------");

        //NOW want to do multiple filter we looking for numbers between 2 and 40 with stream filter


        numbers.stream()
                .filter(e->e >2 && e<40).forEach(System.out::println);


        numbers.stream()
                .filter(e->e >2 && e<40).forEach(System.out::println);

    }

}
