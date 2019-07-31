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

public class OddNumbers {
    static List<Integer> oddNumbers(int l, int r) {
        List<Integer> result = new ArrayList<Integer>();
        boolean even = false;
        if( l % 2 == 0) even = true;
        if(even){
            int next = l + 1;
            while(next <= r){
                result.add(next);
                next = next + 2;
            }
        }
        else{
            while(l <= r){
                result.add(l);
                l = l + 2;
            }
        }
        return result;

    }
}
