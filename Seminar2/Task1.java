// Дана последовательность из N целых чисел. Найти сумму чисел, оканчивающихся на 5, перед которыми идет четное число.

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        int sum = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of sequence: ");
        int n = scanner.nextInt();
        System.out.println("Enter the sequence: ");
        int a = scanner.nextInt();

        for (int i = 0; i < n - 1; i++) {
            int current = scanner.nextInt();
            if (a % 2 == 0 && current % 10 == 5) {
                sum += current;
            }
            a = current;
        }
        System.out.println(sum);
    }
}