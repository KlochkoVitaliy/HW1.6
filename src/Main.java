import java.util.Arrays;

public class Main {

    int[] arr = generateRandomArray();

    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }

    public static void main(String[] args) {

        //System.out.println(Arrays.toString(generateRandomArray()));

        //Task 1
        System.out.println("Задание № 1");

        int myArray[] = generateRandomArray();
        int sum = 0;
        for (int i = 0; i < myArray.length; i++) {
            sum = sum + myArray[i];
        }

        System.out.println("Сумма трат за месяц составила " + sum + " рублей");
        System.out.println();

        //Task 2
        System.out.println("Задание № 2");

        int[] spending = generateRandomArray();
        int max = spending[0];
        int min = spending[0];
        for (int j : spending) {
            if (j > max)
                max = j;
            if(j<min)
                min=j;
        }
        System.out.println(" Максимальная сумма трат за день составила " + max + " рублей ");
        System.out.println(" Минимальная сумма трат за день составила " + min + " рублей ");

        //Task 3
        System.out.println();
        System.out.println("Задание № 3");

        double average = 0;
        int summ = 0;
        for (int k = 0; k < myArray.length; k++) {
            summ = summ + myArray[k];
            average = summ / 30;
        }
        System.out.println("Средняя сумма трат за месяц составила " + average + " рублей");

        //Task 4
        System.out.println();
        System.out.println("Задание № 4");

        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        char[] fullName = new char[reverseFullName.length];
        for (char i = 0; i < reverseFullName.length; i++) {
            fullName[reverseFullName.length - 1 - i] = reverseFullName[i];
        }
        reverseFullName = fullName;
        System.out.println(reverseFullName);

    }
}

