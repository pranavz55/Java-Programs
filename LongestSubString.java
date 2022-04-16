public class LongestSubString {
    public static void main(String[] args) {
        String str ="fqbcd";
        for(int i=str.length();i>=0;i--){
            String s1 = subStringFunc(str,i);
            if( s1!=null){
                System.out.println(s1);
                break;
            }
        }
    }
    private static String subStringFunc(String str, int size) {
        int l = str.length()-size;
        for(int i=0;i<=l;i++){
            String tp = str.substring(i,i+size);
            if(checkPallindrome(tp))
                return tp;
        }
        return null;
    }
    private static boolean checkPallindrome(String str) {
        StringBuffer sf = new StringBuffer(str);
        return str.equalsIgnoreCase(sf.reverse().toString());
    }
}
