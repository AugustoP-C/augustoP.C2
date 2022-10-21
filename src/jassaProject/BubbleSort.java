package jassaProject;

import java.util.Arrays;
import java.util.Scanner;

public class BubbleSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Quanto numero vc quer digitar?");
        int[] nums = new int[sc.nextInt()];
            for (int c1 = 0; c1 < nums.length; c1++) {
                System.out.printf("digite o %d° numero \n", c1 + 1);
                int nx = sc.nextInt();
                nums[c1] = nx;
            }
        Arrays.sort(nums);
            for (int con: nums) {
                System.out.println(con);
        }
    }
}
