package transport;

public class Bus extends Transport {

    public Bus(String brand, String model, int releaseYear, String country, String colour, int maxSpeed) {

        super(brand, model, releaseYear, country, colour, maxSpeed);
    }

    @Override
    public String toString() {
        return
                " Марка автомобиля: " + brand + "\n" +
                        " Модель: " + model + "\n" +
                        " Цвет: " + colour + "\n" +
                        " Год выпуска: " + year + "\n" +
                        " Страна сборки: " + country + "\n" +
                        " Максимальная скорость (в км/ч): " + maxSpeed + "\n";
    }
}
