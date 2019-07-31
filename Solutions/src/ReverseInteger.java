public class ReverseInteger {
    public int reverse(int x) {
        int rev = 0;
        boolean negative = false;
        if(x < 0){
            negative = true;
            x = -x;
        }

        while(x > 0){
            rev = (rev * 10) + (x % 10);
            x = x / 10;
        }
        if(rev > Math.pow(2,31) - 1){
            return 0;
        }
        if(negative) rev = -rev;
        return rev;
    }
}
