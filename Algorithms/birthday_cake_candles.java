import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    //HackerRank Birthday Cake Candles Problem
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int candle = 0;
        int tall = 0;
        
        int height[] = new int[n];
        for(int height_i=0; height_i < n; height_i++){
            height[height_i] = in.nextInt();
            if (height[height_i] > tall) {
                candle = 1;
                tall = height[height_i];
            } else if (height[height_i] == tall) {
                candle += 1;
            } else {
                continue;
            }
        }
        
        System.out.println(candle);
    }
}
