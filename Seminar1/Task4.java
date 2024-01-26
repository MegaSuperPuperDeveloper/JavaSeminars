// Дан массив целых чисел. Верно ли, что массив является симметричным.

import java.util.Scanner;

public class Task4 {

    public static void DoTask(int[] nums, int length) {
        int index = length - 1;
        int times = length / 2;
        if (length % 2 != 0) times += 1;
        int count = 0;
        for (int i = 0; i <= times; i++) {
            if (nums[i] == nums[index - i]) count += 1;
        }
        count -= 1;
        if (count == times) System.out.printf("Yes");
        else System.out.println("No");
    }

    public static int[] PullArray(int length) {
        Scanner scanner = new Scanner(System.in);
        int[] nums = new int[5];
        for (int i = 0; i < length; i++) {
            nums[i] = scanner.nextInt();
        }
        return nums;
    }

    public static void main(String[] args) {
        int length = 5;
        int[] nums = PullArray(length);
        DoTask(nums, length);
    }
}