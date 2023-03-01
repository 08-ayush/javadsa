package aayushdsa.java;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class twopointer_approch_2 {
    public static void main(String[] args) {
        ArrayList<Integer> height = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 9; i++) {
            height.add(sc.nextInt());

        }
        // System.out.println(height);
        int area_water = storewater(height);
        System.out.println(area_water);

    }

    public static int storewater(ArrayList<Integer> height) {
        int max_water = 0;
        int lp = 0;
        int rp = height.size() - 1;
        while (lp < rp) {
//            calculate water area
            int ht = Math.min(height.get(lp), height.get(rp));
            int width = rp - lp;
            int currwater = ht * width;
            max_water = Math.max(max_water, currwater);
//            update ptr
            if (height.get(lp) < height.get(rp)) {
                lp++;

            } else {
                rp--;
            }

        }
                   return max_water;
    }
}
