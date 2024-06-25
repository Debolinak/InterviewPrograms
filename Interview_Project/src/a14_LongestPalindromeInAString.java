import java.util.ArrayList;
import java.util.List;

public class a14_LongestPalindromeInAString {
    public static List<String> stringList;
    public static void toFinfAllThesubstri(String strT) {
        int length = strT.length();
        for (int i = 0; i < length; i++) {
            for (int j = i + 1; j < length - 1; j++) {
                String substr = strT.substring(i, j);
                if (substr.length() >= 3) {
                    toTestifPalindrome(substr);


                }
            }

        }
    }
    public static void toTestifPalindrome(String strT)
    {
        int length = strT.length();
        String revStr = "";
        for(int i = length-1; i >0 ; i--)
        {
            revStr = revStr + strT.charAt(i);
        }
        if(strT.equals (revStr))
        {
            System.out.println("The palindrome string is " + revStr);
        }
    }
    public static void main(String[] args) {
        String inputstring = "forgeeksskeegfor";
        // output String is geeksskeeg
        toFinfAllThesubstri(inputstring);



    }
}
