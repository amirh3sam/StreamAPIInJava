import java.util.HashSet;
import java.util.Set;

public class Stream_AllMatch {
/*
 method is used to check if all elements in the stream satisfy a given condition, returning a boolean result.

 */
    public static void main(String[] args) {

        Set<String> products = new HashSet<String>();

        products.add("Hard Drive");
        products.add("Thumb Drive");
        products.add("Flash Drive");
        products.add("Keyboard");
        products.add("Mother Board");
        products.add("CD-ROM");

        boolean allMatchDrive = products.stream().allMatch(e -> {
            return e.endsWith("Drive");
        });
        System.out.println("allMatchDrive = " + allMatchDrive);

    }



}
