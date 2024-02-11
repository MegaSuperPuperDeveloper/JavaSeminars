//1) Дан массив чисел, посчитать процент уникальных чисел.
// *процент уникальных чисел = количество уникальных чисел * 100 / общее количество чисел в массиве.

import java.util.HashSet;
import java.util.Arrays;
import java.util.Set;
import java.util.ArrayList;
import java.util.List;

public class Task1 {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>(Arrays.asList(
                1,1,1,1
        ));
        System.out.println(Procent(nums) + "%");
    }

    public static double Procent(List<Integer> nums) {
        Set<Integer> setNums = new HashSet<>(nums);
        return setNums.size() * 100 / nums.size();
    }

}