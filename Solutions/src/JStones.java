public class JStones {
    public int numJewelsInStones(String J, String S) {
        int counter = 0;
        for(int i = 0; i<J.length(); i++){
            char one = J.charAt(i);
            for(int s = 0; s<S.length(); s++){
                char two = S.charAt(s);
                if(one == two) counter++;
            }
        }
        return counter;
    }
}
