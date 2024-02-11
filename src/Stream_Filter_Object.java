import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Car {

    String brand;
    String make;
    int numberOfSit;


    public Car(String brand, String make, int numberOfSit) {
        this.brand = brand;
        this.make = make;
        this.numberOfSit = numberOfSit;

    }

}
    public class Stream_Filter_Object {

        public static void main(String[] args) {


            List<Car> car = new ArrayList<>();
            car.add((new Car("Cororla","Toyota",5)));
            car.add((new Car("X","Tesla",7)));
            car.add((new Car("911","Porsche",4)));

            car.stream()
                    .filter(e->e.numberOfSit>4)
                    .forEach(e-> System.out.println(e.make));

        }
    }
