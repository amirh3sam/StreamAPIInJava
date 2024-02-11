import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Stream_Count_Filter {

    public static void main(String[] args) {


        List<Integer> numsList= new ArrayList<>(Arrays.asList(1,2,33,4,22,65,78,8,8,9,9,0,10));

        long count = numsList.stream().filter(e -> e % 2 == 0).count();

        System.out.println(count);




    }
}
