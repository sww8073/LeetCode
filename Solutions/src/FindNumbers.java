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

public class FindNumbers {
    static String findNumber(List<Integer> arr, int k) {
        for(int i = 0; i < arr.size(); i++){
            if(arr.get(i) == k){
                return "YES";
            }
        }
        return "NO";
    }
}
