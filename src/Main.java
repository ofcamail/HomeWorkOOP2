import transport.Car;
import transport.Car.Key;
import transport.Car.Insurance;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Car myCar = new Car("Opel", "Astra", 2011, "Germany", "Red", 1.6,
                "Automatic transmission", "Hatchback", "Р955МВ58RUS", 5, false);

        Key myCarKey = new Key(true, false);

        Insurance insurance = new Insurance(LocalDate.of(2023, 12,8), 13500, "675432189");


        System.out.println(myCar);
        System.out.println(Car.changeRubber(6));
        System.out.println(myCarKey);
        System.out.println(insurance);
        System.out.println(insurance.isExpiredInsurance());
        System.out.println(insurance.correctNumber());
    }
}