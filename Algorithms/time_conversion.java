import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    //Given a time in 24-hour AM/PM format, convert it to military (-hour) time.
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String time = in.next();
        String ampm = time.substring(Math.max(time.length() - 2, 0));
        String hours = time.substring(0, 2);
        String rest = time.substring(2, 8);
        int hour = Integer.parseInt(hours);
        int i;
        
        if (ampm.equals("AM")) {
            if (hour == 12) {
                System.out.println("00" + rest);
            } else {
                System.out.println(hours + rest);
            }
        } else {
            if (hour == 12) {
                String newtime = hour + rest;
                System.out.println(newtime);
            } else {
                String newtime = Integer.toString(hour + 12) + rest;
                System.out.println(newtime);
            }
        }
    }
}
