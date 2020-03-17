import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int array[] = new int[200];
        for (int i = 0; i < 200; i++) {
            int a = (int) (Math.random() * 200 - 100);
            array[i] = a;
        }
        int array2[] = new int[200];

        int x = 0;
        for (int i = 0; i < 200; i++) {
            if (array[i] > 0) {
                array2[x] = array[i];
                x++;
            }
        }
        System.out.println("всего чисел положительных = " + x);
        System.out.println(Arrays.toString(array2));

        int sum = 0;
        int sum2 = 0;
        for (int i = 0; i < 200; i++) {
            if (i % 2 == 0) {
                sum = sum + array[i];
            } else {
                sum2 = sum2 + array[i];
            }
        }
        System.out.println("Сумма четных = " + sum);
        System.out.println("Сумма нечетных = " + sum2);
        System.out.println("Расзность = " + (sum - sum2));


        for (int i = 0; i < 200; i++) {
            if (array[i] > 0) {
                System.out.println("NO");
                System.out.println(i + " " + array[i]);
                break; //а брейк точно завершает цикл в действительности и как он влияет на другие цыклы там функции?
            }
            if (i == 199) {
                System.out.println("Yes you god damn lucky man");
            }
        }

        int hh = -100;
        for (int i = 0; i < 200; i++) {
            if (hh > array[i]) {
                System.out.println("NOPE");
                break;
            } else {
                hh = array[i];
            }
            if (i == 199) {
                System.out.println("Yes you god damn lucky man");
            }
        }


        System.out.println(Arrays.toString(array));
        boolean needIteration = true;
        while (needIteration) {
            needIteration = false;
            for (int i = 1; i < array.length; i++) {
                if (array[i] < array[i - 1]) {
                    array[i] = array[i] + array[i - 1];
                    array[i - 1] = array[i] - array[i - 1];
                    array[i] = array[i] - array[i - 1];
                    needIteration = true;
                }
            }
        }
        System.out.println(Arrays.toString(array));

    }
}
