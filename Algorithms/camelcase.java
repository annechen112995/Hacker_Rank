import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

	//HackerRank CamelCase Problem
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        int words = 1;
        int i;
        for (i = 0; i < s.length(); i++) {
            if (Character.isUpperCase(s.charAt(i))) {
                words++;
            } else {
                continue;
            }
        }
        System.out.println(words);
    }
}
