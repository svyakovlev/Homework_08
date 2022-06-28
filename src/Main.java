import java.text.DecimalFormat;

public class Main {

    public static String printYear (int year) {
        int yearDevide4 = year % 4;         //Является високосным
        int yearDevide100 = year % 100;     //Не является високосным, исключение х400
        int yearDevide400 = year % 400;     //Является високосным

        if (yearDevide100 == 0 && yearDevide400 != 0) {
            return year + " - не високосный год";
        }
        else if (yearDevide400 == 0 || yearDevide4 == 0) {
            return year + " - високосный год";
        }
        else {
            return year + " - не високосный год";
        }
    }

    public static String printVersion (int clientOS, int clientDeviceYear) {
        if (clientOS == 0) {
            if (clientDeviceYear < 2015) {
                return "Установите облегченую версию приложения для iOS по ссылке";
            } else {
                return "Установите версию приложения для iOS по ссылке";
            }
        }

        if (clientOS == 1) {
            if (clientDeviceYear < 2015) {
                return "Установите облегченую версию приложения для Android по ссылке";
            } else {
                return "Установите версию приложения для Android по ссылке";
            }
        }
        else {
            return "Ошибка ввода данных";
        }
    }

    public static void deliveryDay(int distance) { //Расчет времени доставки
        int day = (distance + 19) / 40 + 1;
        System.out.println(day);
    }

    public static int[] generateRandomArray() { //Генератор массива
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }

    public static double averageSumm (int[] array) { //Расчет среднего значения
        int summInteger = 0;
        for (int i = 0; i < array.length; i++) {
            summInteger = summInteger + array[i];
        }
        double middleSumm = (double) summInteger / array.length;
        return middleSumm;
    }

    public static String formatSumm() { //Форматирование
        double summ = averageSumm(generateRandomArray());
        DecimalFormat decimalFormat = new DecimalFormat("#.##");
        String average = decimalFormat.format(summ);
        return average;
    }

    public static void main(String[] args) {
// Задача №1
        int currentYear = 2022;
        System.out.println(printYear(currentYear));

// адача №2
        int os = 0;
        int year = 2017;
        System.out.println(printVersion(os, year));

// Задача №3
        int deliveryDistance = 95;
        System.out.print("Потребуется дней: ");
        deliveryDay(deliveryDistance);

// Дополнительное задание
        System.out.println("Средняя сумма трат за месяц составила " + formatSumm() + " рублей");

    }
}