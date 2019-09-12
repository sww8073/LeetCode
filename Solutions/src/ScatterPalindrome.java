import java.io.*;
import java.util.ArrayList;
import java.util.List;

//NOT COMPLETE
public class ScatterPalindrome {
    public static List<Integer> scatterPalindrome(List<String> strToEvaluate) {
        // Write your code here
        List<Integer> next = new ArrayList<Integer>();
        for (String s : strToEvaluate) {
            int n = s.length();
            int subCount = 0;
            for (int center = 0; center < 2 * n - 1; center++) {
                int left = center / 2;
                int right = left + center % 2;
                while (left > 0 && right < n && s.charAt(left) == s.charAt(right)) {
                    subCount++;
                    left--;
                    right++;
                }
            }
            next.add(subCount);
        }
        return next;
    }
}
