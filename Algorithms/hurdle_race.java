import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    //HackerRank Hurdle Race Problem
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int drink = 0;
        int[] height = new int[n];
        for(int height_i=0; height_i < n; height_i++){
            height[height_i] = in.nextInt();
            if (height[height_i] > k) {
                drink += height[height_i] - k;
                k = height[height_i];
            } else {
                continue;
            }
        }
        System.out.println(drink);
        
    }
}
