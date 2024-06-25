package programPackage;

public class GetTheLongestString {
    public static String[] sampleString = {"DEBOLINA","DEBOL","DEBO","DEBOLINAKONAR","DEK"};
    public static int length = sampleString.length;
    public static void getTheLongestStringMethod(String[] sampleStr)
    {
        String longest = "" ;
        for(String str : sampleStr)
        {
            if(str.length()>longest.length())
            {
                longest = str;
            }
        }
        System.out.println(longest);
    }

    public static void main(String[] args) {
        getTheLongestStringMethod(sampleString);

    }



}
