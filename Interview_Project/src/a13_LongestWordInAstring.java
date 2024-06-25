public class a13_LongestWordInAstring {
    public static String longest = "";
    public static int longestlengthstr = 0;
    public static void a13_LongestWordInAstringMethod(String[] strP)
    {
        longestlengthstr = strP[0].length();
        longest = strP[0];
        int length = strP.length;
        for(int i = 0 ; i < length ; i++)
        {
            if(longestlengthstr<(strP[i].length()) & i<length)
            {
                longestlengthstr = (strP[i].length());
                longest = strP[i];
            }
        }
        System.out.println(longest);
    }
    public static void main(String[] args) {
        String [] teststring = {"Candidate1", "candid", "Debolina"};
        a13_LongestWordInAstringMethod(teststring);
    }
}
