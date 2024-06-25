public class a17_ReverseStringwithWords {

    public static String samplestring = "My name is Debolina";
    public static void a17_ReverseStringwithWordsMethod(String sampleStr)
    {
        String[] individualString = sampleStr.split(" ");
        int length = individualString.length;
        for(String s : individualString)
        {
            reverseAString(s);
        }
    }
    public static void reverseAString(String sampleStr)
    {
        String revString = "";
     int length = sampleStr.length();
     for(int i =length-1; i>=0 ; i--)
     {
         revString = revString + sampleStr.charAt(i);

     }
        System.out.print(revString + " ");
    }

    public static void main(String[] args) {
        a17_ReverseStringwithWordsMethod(samplestring);
    }
}
