import java.util.HashSet;
import java.util.Set;

public class Stream_AnyMatch {



    /*
    the anyMatch method is used to check if any elements in the stream match a given condition, returning a boolean result.
     */

    public static void main(String[] args) {

        Set<String> products = new HashSet<String>();

        products.add("Hard Drive");
        products.add("Thumb Drive");
        products.add("Flash Drive");
        products.add("Keyboard");
        products.add("Mother Board");
        products.add("CD-ROM");

        boolean anyMatchDrive = products.stream().anyMatch(e -> {
            return e.endsWith("Drive");
        });
        System.out.println("anyMatchDrive = " + anyMatchDrive);

    }
}
