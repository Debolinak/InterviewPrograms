package programPackage;

public class Validpalindrome {
    public static String sampleString = "aabaa";
    public static String newString = "";
    public static int length = sampleString.length();

    public static boolean validPalindromeMethod(String input) {
        int left = 0;
        int right = length - 1;
        //char leftChar = sampleString.charAt(left);
        // rightChar = sampleString.charAt(right);
        while (right >= left) {

            if (!Character.isAlphabetic(sampleString.charAt(left))) {
                left++;
            }
            else if (!Character.isAlphabetic(sampleString.charAt(right))) {
                right--;
            }
            else if (Character.toLowerCase(sampleString.charAt(left)) == Character.toLowerCase(sampleString.charAt(right))) {
                left++;
                right--;
            }
            else{
                return false;
            }
        }

return true;
    }


    public static void main(String[] args) {
       // System.out.println(Character.isAlphabetic(','));
        System.out.println(validPalindromeMethod(sampleString));

    }
}



