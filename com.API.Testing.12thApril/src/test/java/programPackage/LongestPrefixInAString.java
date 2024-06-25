package programPackage;

public class LongestPrefixInAString {
    public static String[] inputString = new String[]{"flows","flower","flight"};
    public static int length = inputString.length;
    public static void LongestCommenPrefixMethod(String[] inputStr)
    {
        String longestPrefix = "";
        String firstWord = inputStr[0];
        int length2 = firstWord.length();
        for(int i =1 ; i< length ; i++)
        {
            for(int j =0 ; j< length2 ; j++)
            {
                if(firstWord.charAt(j) == inputStr[i].charAt(j))
                {
                    longestPrefix  = longestPrefix + firstWord.charAt(j);
                }
                else
                {
                    System.out.println("The longest Prefix is"+ longestPrefix);
                    break;
                }
            }
        }
    }

    private static String longestCommenPrefixMethod(String[] inputArr){
        String pref = inputArr[0];

        int i = pref.length();
        boolean found = true;
        while(i>=0){
            found = true;
            for(String str : inputArr) {

                //"flows","flower","flight"
                if(!str.startsWith(pref)){
                    i--;
                    pref = pref.substring(0,i);
                    found = false;
                    break;
                }
            }
            if(found){
                return pref;
            }
        }
        return "";
    }
    public static void main(String[] args) {
        //LongestCommenPrefixMethod(inputString);
        System.out.println(longestCommenPrefixMethod(inputString));

    }
}
