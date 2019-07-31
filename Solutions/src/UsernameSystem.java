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
public class UsernameSystem {
    public static List<String> usernamesSystem(List<String> u) {
        // Write your code here
        List<String> result = new ArrayList<String>();
        Map<String, Integer> dict = new HashMap<String, Integer>();
        for(int i = 0; i < u.size(); i++){
            String current = u.get(i);
            if(dict.containsKey(current)){
                int count = dict.get(current);
                String input = Integer.toString(count);
                String next = current + input;
                result.add(next);
                count++;
                dict.put(current, count);
            }
            else{
                dict.put(current, 1);
                result.add(current);
            }
        }
        return result;
    }
}
