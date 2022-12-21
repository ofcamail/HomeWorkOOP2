import transport.Car;
import transport.Car.Key;
import transport.Car.Insurance;
import transport.Bus;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Car myCar = new Car("Opel", "Astra", 2011, "Germany", "Red", 210,
                1.6, "Automatic", "Hatchback", "Р955МВ58RUS", 5, true);

        Key myCarKey = new Key(true, false);

        Insurance insurance = new Insurance(LocalDate.of(2023, 12,8), 13500, "675432189");

        Bus mercedec = new Bus ("Mercedes-Benz", " O 350 RHD", 2017, "Турция", "Белый", 110);
        Bus maz = new Bus ("МАЗ", "215", 2016, "Белорусь", "Серый", 120);
        Bus man = new Bus ("MAN", "Lion’s City L.", 1996, "Польша", "Белый", 110);

        System.out.println(myCar);
        System.out.println ("Установка зимней резины:" + Car.changeRubber(2));
        System.out.println(myCarKey);
        System.out.println(insurance);
        System.out.println(insurance.isExpiredInsurance());
        System.out.println(insurance.correctNumber());
        System.out.println(mercedec);
        System.out.println(maz);
        System.out.println(man);

    }
}