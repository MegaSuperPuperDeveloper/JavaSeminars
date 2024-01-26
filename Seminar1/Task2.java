// Дана последовательность N целых чисел. Найти количество положительных чисел, после которых
// следует отрицательное число.

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int a = scanner.nextInt();
        int count = 0;
        for (int i = 1; i < n; i++) {
            int b = scanner.nextInt();
            if (b < 0 && a > 0) {
                count++;
            }
            a = b;
        }
        System.out.println(count);
    }
}
