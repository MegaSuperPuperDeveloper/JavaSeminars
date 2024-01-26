// Дана строка. Поменять местами ее половины.

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();
        String first_part = string.substring(0,string.length()/2);
        String second_part = string.substring(string.length()/2, string.length());
        System.out.println(second_part + first_part);
    }
}