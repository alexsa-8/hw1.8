import java.util.Scanner;
public class Main {
    public static void printText() {
        System.out.print("Введите интерисующий вас год:");
    }
    public static void recordYear(int year) {
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println(year + " - високосный год");

        } else {
            System.out.println(year + " - не високосный год");
        }
    }
    public static void printOS(){
        System.out.println("Введите каким телефоном вы пользуетесь:");
        System.out.println("если iOS - 0");
        System.out.println("если Android - 1");
    }
    public static void printYear(){
        System.out.println("Введите год выпуска вашего телефона: ");
    }
    public static void installOption(int clientOS, int clientDeviceYear, int yearOfRelease ){
        if (clientOS == 0 && clientDeviceYear < yearOfRelease) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (clientOS == 0 && clientDeviceYear >= yearOfRelease) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientOS == 1 && clientDeviceYear < yearOfRelease) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else if (clientOS == 1 && clientDeviceYear >= yearOfRelease) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else {
            System.out.println("Ошибка");
        }
    }
    public static void printDistance() {
        System.out.print("Дистанция до клиента:");
    }
    public static void installTime(int e, int deliveryDistance){
        //e=1+(deliveryDistance/40);
        if (deliveryDistance<=20){
            System.out.print("Потребуется дней: 1");
        }
        else if ((deliveryDistance-20)%40==0){
            System.out.println("Потребуется дней: "+e);
        }else if ((deliveryDistance-20)%40!=0){
            System.out.println("Потребуется дней: "+(e+1));
        }
    }
    static int[] arr = generateRandomArray();

    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }
    //public static void calculatesAverage(){}
    public static void main(String[] args) {
            //Задание 1
            System.out.println("\nЗадание 1");
            Scanner input = new Scanner(System.in);
            printText();
            int year = input.nextInt();
            recordYear(year);
            // Задание 2
            System.out.println("\nЗадание 2");
            int clientOS, clientDeviceYear, yearOfRelease = 2015;
            printOS();
            clientOS = input.nextInt();
            printYear();
            clientDeviceYear = input.nextInt();
            installOption(clientOS, clientDeviceYear, yearOfRelease);
        {
            // Задание 3
            System.out.println("\nЗадание 3");
            int deliveryDistance, e;
            printDistance();
            deliveryDistance = input.nextInt();
            e = 1 + ((deliveryDistance - 20) / 40);
            installTime(e, deliveryDistance);
        }
        {
            // Задание 6
            System.out.println("\nЗадание 6");

            double sum=0;
            System.out.println(sum);
            for (int element : arr) {
                sum += element;
            }
            System.out.println("Сумма трат за месяц составила " + sum + " рублей");
            double average;
            average = sum / arr.length;
            System.out.println("Средняя сумма трат за месяц составила " + average + " рублей");
        }
    }

}