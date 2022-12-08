import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Task1();
        Task2();
        Task3();
        Task4();
        Task5();
        Task6();
        Task7();
        Task8();


    }

    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100000) + 100000;
        }
        return arr;
    }

    public static void Task1() {
        System.out.println("Задача 1");
        int[] newMassiv = new int[3];
        newMassiv[0] = 1;
        newMassiv[1] = 2;
        newMassiv[2] = 3;
        System.out.print(Arrays.toString(newMassiv));

    }

    public static void Task2() {
        System.out.println("");
        System.out.println("Задача 2");
        double[] newMassiv2 = {1.57, 7.654, 9.986, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        System.out.print(Arrays.toString(newMassiv2));
        System.out.println("");
        {
        }
        int[] newMassiv3 = {10, 114, 12, 123, 14, 53, 16, 422, 18, 19, 20, 21};
        System.out.print(Arrays.toString(newMassiv3));
    }

    public static void Task3() {
        System.out.println("");
        System.out.println("Задача 3");
        int[] newMassiv4 = {1, 2, 3};
        for (int i = newMassiv4.length - 1; i >= 0; i--) {
            System.out.print(newMassiv4[i] + ", ");
            if (i == newMassiv4.length) ;
            System.out.print(newMassiv4[i]);
        }
        System.out.println("");
        double[] newMassiv5 = {1.57, 7.654, 9.986, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        for (int i = newMassiv5.length - 1; i >= 0; i--) {
            System.out.print(newMassiv5[i] + ", ");
            if (i == newMassiv5.length) ;
            System.out.print(newMassiv5[i]);
        }
        System.out.println("");
        int[] newMassiv6 = {10, 114, 12, 123, 14, 53, 16, 422, 18, 19, 20, 21};
        for (int i = newMassiv5.length - 1; i >= 0; i--) {
            System.out.print(newMassiv6[i] + ", ");
            if (i == newMassiv6.length) ;
            System.out.print(newMassiv6[i]);
        }
    }

    public static void Task4() {
        System.out.println("");
        System.out.println("Задача 4");
        int[] newMassiv7 = {1, 2, 3};
        for (int i = 0; i < newMassiv7.length; i++) {
            if (newMassiv7[i] % 2 != 0)
                System.out.println(newMassiv7[i] + 1);
        }
    }

    public static void Task5() {
        System.out.println("Задача 5");
        int[] arr = generateRandomArray();
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > sum)
                sum += arr[i];
        }
        System.out.println("Сумма трат за месяц составила: " + sum);
    }

    public static void Task6() {
        System.out.println("Задача 6");
        int[] arr = generateRandomArray();
        int maxSum = arr[0];
        int minSum = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > maxSum) {
                maxSum = arr[i];
            }
            if (arr[i] < minSum) {
                minSum = arr[i];
            }
        }
        System.out.println("Минимальная сумма трат за день составила " + minSum + " рублей. " + "Максимальная сумма трат за день составила: " + maxSum + " рублей.");
    }

    public static void Task7() {
        System.out.println("Задача 7");
        int[] arr = generateRandomArray();
        int sum = 0;
        int daysInMonth = 30;
        for (int index = 0; index < arr.length; index++) {
            sum = sum + arr[index];
        }
        int averageAmount = sum / daysInMonth;
        System.out.println("Средняя сумма трат за месяц составила " + averageAmount);

    }

    public static void Task8() {
        System.out.println("Задача 8");
        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length - 1; i >= 0; i--) {
            System.out.print(reverseFullName[i]);
        }
    }
}
