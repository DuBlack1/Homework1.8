import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        checkYear(1900);
        checkWhichVersionToOffer(2015, 1);
        calculateDeliveryTime(95);
    }

    public static void checkYear(int year) {
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println("Год является высокосным");
        } else {
            System.out.println("Год не является высокосным");
        }
    }

    public static void checkWhichVersionToOffer(int clientDeviceYear, int clientOS) {
        int currentYear = LocalDate.now().getYear();
        if (clientOS == 1 && clientDeviceYear == currentYear) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else if (clientOS == 1 && clientDeviceYear < currentYear) {
            System.out.println("Установите облегчённую версию приложения для Android по ссылке");
        } else if (clientOS == 0 && clientDeviceYear == currentYear) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else {
            System.out.println("Установите облегчённую версию приложения для iOS по ссылке");
        }
    }

    public static void calculateDeliveryTime(int deliveryDistance) {
        int deliveryDay;
        if (deliveryDistance <= 20) {
            deliveryDay = 1;
        } else {
            deliveryDay = (int) (Math.ceil(deliveryDistance / 40) + 1);
        }
        System.out.println("Потребуется дней: " + deliveryDay);
    }
}