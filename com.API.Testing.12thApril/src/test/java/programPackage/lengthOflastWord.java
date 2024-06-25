package programPackage;
//Input: s = "Hello World"
//Output: 5
//Explanation: The last word is "World" with length 5.
public class lengthOflastWord {
    public static String inputString = "Hello World";
    public static int length = 0;
    public static void lengthOflastWordMethod(String inputStr)
    {
        String[] strArr = inputString.split(" ");
        length = strArr.length;
        String lastword = strArr[length-1];
        int lengthOfLastWord = lastword.length();
        System.out.println("The length of last String is " + lengthOfLastWord);
        System.out.println("The last word is " + lastword);
    }

    public static void main(String[] args) {
        lengthOflastWordMethod(inputString);

    }
}
