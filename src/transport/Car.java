package transport;

import java.time.LocalDate;
public class Car extends Transport {

    private double engineVolume;
    private String transmission;
    private final String bodyType;
    private String registrationNumber;
    private final int seetsNumber;
    private boolean isWInterSeason;


    public Car (String brand, String model, int year, String country, String colour, int maxSpeed, double engineVolume,
                String transmission, String bodyType, String registrationNumber, int seetsNumber, Boolean isWinterSeason) {

        super(brand, model, year, country, colour, maxSpeed);


        if (engineVolume <= 0) {
            this.engineVolume = 1.5;
        } else {
            this.engineVolume = engineVolume;
        }
        if (bodyType == null || bodyType.isBlank() || bodyType.isEmpty()) {
            this.bodyType = "default";
        } else {
            this.bodyType = bodyType;
        }
        if (seetsNumber <= 0) {
            this.seetsNumber = 6;
        } else {
            this.seetsNumber = seetsNumber;
        }
        if (transmission == null || transmission.isBlank() || transmission.isEmpty()) {
            this.transmission = "default";
        } else {
            this.transmission = transmission;
        }
        if (registrationNumber == null || registrationNumber.isBlank() || registrationNumber.isEmpty()) {
            this.registrationNumber = "О000ОО_58RUS";
        } else {
            this.registrationNumber = registrationNumber.toUpperCase();
        }
        this.isWInterSeason = true;
    }

    public boolean isWInterSeason() {
        return isWInterSeason;
    }

    public void setWInterSeason(boolean WInterSeason) {
        isWInterSeason = WInterSeason;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public double getEngineVolume() {
        return engineVolume;
    }


    public int getYear() {
        return year;
    }

    public String getCountry() {
        return country;
    }

    public String getTransmission() {
        return transmission;
    }

    public String getBodyType() {
        return bodyType;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public int getSeetsNumber() {
        return seetsNumber;
    }

    public void setEngineVolume(double engineVolume) {
        this.engineVolume = engineVolume;
    }

    public void setTransmission(String transmission) {
        this.transmission = transmission;
    }

    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }


    @Override
    public String toString() {
        return
                " Марка автомобиля: " + brand + "\n" +
                        " Модель: " + model + "\n" +
                        " Цвет: " + colour + "\n" +
                        " Год выпуска: " + year + "\n" +
                        " Страна сборки: " + country + "\n" +
                        " Объем двигателя: " + engineVolume + " л." + "\n" +
                        " Коробка передач: " + transmission + "\n" +
                        " Тип кузова: " + bodyType + "\n" +
                        " Регистрационный номер: " + registrationNumber + "\n" +
                        " Посадочных мест: " + seetsNumber + "\n" +
                        " Резина(сезон зима): " + isWInterSeason + "\n" +
                        " Максимальная скорость (в км/ч): " + maxSpeed + "\n";

    }


    public static class Key {
        private final boolean remoteEngineStart;
        private final boolean keylessAccess;

        public Key(Boolean remoteEngineStart, Boolean keylessAccess) {
            if (remoteEngineStart == null) {
                remoteEngineStart = false;
            }
            this.remoteEngineStart = remoteEngineStart;

            if (keylessAccess == null) {
                keylessAccess = false;
            }
            this.keylessAccess = keylessAccess;
        }

        public boolean isRemoteEngineStart() {
            return remoteEngineStart;
        }

        public boolean isKeylessAccess() {
            return keylessAccess;
        }

        @Override
        public String toString() {
            return "Удаленный запуск двигателя - " + remoteEngineStart + "\n" +
                    "Бесключевой доступ - " + keylessAccess;
        }

    }


    public static class Insurance {
        private final LocalDate insuranceValidityPeriod;
        private final int insurancePrice;
        private final String insuranceNumber;

        public String isExpiredInsurance() {
            if (LocalDate.now().isAfter(insuranceValidityPeriod) || LocalDate.now().isEqual(insuranceValidityPeriod)) {
                return "Страховка скоро закончится, оформите новую или продлите текущую";
            }
            return "Страховка действует до " + insuranceValidityPeriod;
        }

        public String correctNumber() {
            if (insuranceNumber.length() != 9) {
                return "Номер страховки некорректный!";
            }
            return "Номер страховки корректный - " + insuranceNumber;
        }

        public Insurance(LocalDate insuranceValidityPeriod, int insurancePrice, String insuranceNumber) {


            if (insuranceValidityPeriod == null) {
                this.insuranceValidityPeriod = LocalDate.of(2012, 12, 12);
            } else {
                this.insuranceValidityPeriod = insuranceValidityPeriod;
            }


            if (insurancePrice <= 0) {
                this.insurancePrice = 9000;
            } else {
                this.insurancePrice = insurancePrice;
            }


            if (insuranceNumber == null || insuranceNumber.isEmpty() || insuranceNumber.isBlank()) {
                this.insuranceNumber = "default";
            } else {
                this.insuranceNumber = insuranceNumber;
            }
        }

        public LocalDate getInsuranceValidityPeriod() {
            return insuranceValidityPeriod;
        }

        public int getInsurancePrice() {
            return insurancePrice;
        }

        public String getInsuranceNumber() {
            return insuranceNumber;
        }

        @Override
        public String toString() {
            return "Номер страховки - " + insuranceNumber +
                    ", стоимость страховки - " + insurancePrice + " руб. " +
                    " страховка действительна до - " + insuranceValidityPeriod;
        }

    }

    public static boolean changeRubber(int currentMonthNumber) {
        if (currentMonthNumber < 4 || currentMonthNumber >= 10) {
            return true;
        } else {
            return false;
        }
    }
}