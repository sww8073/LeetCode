import java.io.*;
import java.math.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class OrderCheck {
    public static int countStudents(List<Integer> height) {
        // Write your code here
        List<Integer> next = new ArrayList<Integer>(height);
        Collections.sort(next);
        int count = 0;
        for(int i = 0; i < height.size(); i++){
            int hi = height.get(i);
            int nk = next.get(i);
            if(hi != nk) count++;
        }
        return count;
    }
}
