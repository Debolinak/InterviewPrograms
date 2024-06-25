import java.util.Map;
import java.util.HashMap;

public class a16_CountOfDuplicatesInAString {
    public static String sampleString = "DDEBOOOOOOLINNAA";
    public static int length = sampleString.length();

    public static void a16_CountOfDuplicatesInAStringMethod(String newStr)
    {
        Map<Character , Integer> cntrMap = new HashMap<>();
        for(Character c : sampleString.toCharArray()) {
            cntrMap.put(c,cntrMap.getOrDefault(c, 0)+1);
        }
        System.out.println(cntrMap);

    }


    public static void main(String[] args) {
        a16_CountOfDuplicatesInAStringMethod(sampleString);
    }
    }


