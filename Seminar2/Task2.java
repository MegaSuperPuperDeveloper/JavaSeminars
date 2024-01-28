// Дан массив целых чисел. Найти количество пар соседних элементов,
// где первый элемент вдвое больше второго.

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        int count = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Enter the length: ");
        int n = scanner.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = scanner.nextInt();
        }
        for (int i = 0; i < n - 1; i++) {
            if (nums[i] == nums[i+1] * 2) count++;
        }
        System.out.println("count = " + count);

    }
}