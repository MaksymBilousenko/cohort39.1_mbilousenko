package Lesson41;

import java.awt.*;

public class Main01 {
    public static void main(String[] args) {
        int[] arr = new int[50];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
        }
        long start = System.nanoTime();
        String res = "[ ";
        for (int i = 0; i < arr.length; i++) {
            res += arr[i];
            if (i + 1 != arr.length) {
                res += ", ";
            }
        }
        res += " ]";
        System.out.println(res);
        long end = System.nanoTime();
        System.out.println((end - start) / 1000);

        StringBuilder sb = new StringBuilder("[ ");

        for (int i = 0; i < arr.length; i++) {
            sb.append(arr[i]);
            if (i + 1 != arr.length) {
                sb.append(", ");
            }
        }
        sb.append(" ]");

        long end2 = System.nanoTime();
        System.out.println((end2 - end) / 1000);
    }
}
