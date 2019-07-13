public class Defang {
    public String defangIPaddr(String address) {
        String defang = "";
        for(int i = 0; i<address.length(); i++){
            char c = address.charAt(i);
            if( c == '.') defang = defang + "[.]";
            else defang = defang + c;
        }
        return defang;
    }
}
