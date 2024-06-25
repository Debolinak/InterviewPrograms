import java.util.ArrayList;
import java.util.List;

public class checkPalindrome101 {
    public static String sampleString = "forgeeksskeegfor";
    public static int length = sampleString.length();
    public static void isPalindromeMethod(String input)
    {
        String output = "";
       // int count = 0;
        for(int i = input.length()-1; i >=0 ; i--)
        {
            output = output + input.charAt(i);
        }
        if(input.equals(output))
        {
            System.out.println(input + " is a palindrome");
        }
    }
    public static void substringOfStringMethod(String sampleStr)
    {
        for(int i = 0 ; i <sampleStr.length() ; i++)
        {
            for(int j = i+1 ; j <=sampleStr.length()-1; j++)
            {
                String substr = sampleStr.substring(i, j);
                if(substr.length()>=3)
                {
                    isPalindromeMethod(substr);
                  //  List<String> stringList = new ArrayList<String>();
                   // stringList.add(substr);
                }
            }
        }
    }
    public static void main(String[] args) {
        // isPalindromeMethod("madam");
        substringOfStringMethod(sampleString);

    }
}


