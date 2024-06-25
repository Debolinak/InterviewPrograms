package programPackage;

//Input: strs = ["flower","flow","flight"]
//Output: "fl"
public class LongestAndSmallestWord {
    public static String[] inputString = new String[]{"flower","flow","flight"};
    public static int length = inputString.length;
    public static void LongestCommenPrefixMethod(String[] inputStr)
    {
        String smallestWord = "";
        String longestWord = "";
        for(int i = 0; i < length-1; i++)
        {
            if(inputString[i].length() < inputString[i+1].length())
            {
                smallestWord = inputString[i];
            }

        }
        for(String str : inputString)
        {
            if(str.length()> (longestWord).length())
            {
                longestWord = str;
            }
        }
        System.out.println("Smallest word is " + smallestWord);
        System.out.println("Longest word is " + longestWord);

    }

    public static void main(String[] args) {
        LongestCommenPrefixMethod(inputString);
    }
}
