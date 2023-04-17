package us.lviv.lgs.sort;

import java.util.Arrays;
import java.util.Collections;

import static java.util.Arrays.sort;


public class Main {
    public static void main(String[] args) {
        Integer [] arr = {8, 161, 12, 5, 843, 34, 1, 722, 44, 28, 0};
        System.out.println(Arrays.toString(arr));

        sort(arr);
        System.out.println(Arrays.toString(arr));

        Arrays.sort(arr, Collections.reverseOrder());
        System.out.println(Arrays.toString(arr));

    }
}
