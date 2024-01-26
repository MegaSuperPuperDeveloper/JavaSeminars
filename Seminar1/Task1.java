// Input: n = 234
// Output: 15
// Explanation:
// Product of digits = 2 * 3 * 4 = 24
// Sum of digits = 2 + 3 + 4 = 9
// Result = 24 - 9 = 15

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int res = Complete(num);
        System.out.println(res);
    }

    /**
     * @apiNote Возвращение
     * @param n
     * @return произведение минус сумма
     */
    private static int Complete(int n) { // Функция выполняет условия задачи.
        int sum = 0;
        int multiply = 1;
        while (n != 0) {
            sum += n % 10;
            multiply *= n % 10;
            n /= 10;
        }
        return multiply - sum;
    }

}