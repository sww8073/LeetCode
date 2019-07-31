import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

public class HolesNumber {
    public static int countHoles(int num) {
        // Write your code here
        int holes = 0;
        Map<Integer, Integer> dict = new HashMap<Integer, Integer>();
        dict.put(0,1);
        dict.put(1,0);
        dict.put(2,0);
        dict.put(3,0);
        dict.put(4,1);
        dict.put(5,0);
        dict.put(6,1);
        dict.put(7,0);
        dict.put(8,2);
        dict.put(9,1);
        String number = Integer.toString(num);
        for(int i = 0; i < number.length() ; i++){
            char c = number.charAt(i);
            int a = Character.getNumericValue(c);
            holes = holes + dict.get(a);
        }
        return holes;

    }
}
