/**
2) Найти пересечение двух множеств
Пример:
set1= [1,2,3,4]
set2= [3,5,6,7]
Вывод в консоль: [3]
 **/

import java.util.Arrays;
import java.util.Set;
import java.util.HashSet;

public class Task2 {
    public static void main(String[] args) {
        Set<Integer> nums1 = new HashSet<>(Set.of(1,2,3,4));
        Set<Integer> nums2 = new HashSet<>(Set.of(3,5,6,7));
        Set<Integer> res = new HashSet<>(nums1);
        System.out.println("nums1 = " + nums1);
        System.out.println("nums2 = " + nums2);
        res.retainAll(nums2);
        System.out.println(res);
    }

}