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

public class Anagrams {
    public static List<String> funWithAnagrams(List<String> s) {
        // Write your code here
        List<String> result = new ArrayList<String>();
        for(int i = 0; i < s.size(); i++){
            String current = s.get(i);
            if(result.size() > 0){
                boolean anagram = false;
                for(int x = 0; x < result.size(); x++){
                    boolean anagramC = true;
                    String r = result.get(x);
                    char[] curr = current.toCharArray();
                    char[] curr2 = r.toCharArray();
                    int c1 = current.length();
                    int c2 = r.length();
                    if( c1 != c2){
                        continue;
                    }
                    Arrays.sort(curr);
                    Arrays.sort(curr2);
                    for( int z = 0; z < c1; z++){
                        if( curr[z] != curr2[z]){
                            anagramC = false;
                            break;
                        }
                    }
                    if(!anagramC) continue;
                    else{
                        anagram = true;
                        break;
                    }

                }
                if(!anagram) result.add(current);
            }
            else{
                result.add(current);
            }
        }
        Collections.sort(result);
        return result;
    }
}
