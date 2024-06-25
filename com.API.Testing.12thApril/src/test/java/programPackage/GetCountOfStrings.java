package programPackage;

import java.util.HashMap;
import java.util.Map;

public class GetCountOfStrings {
    public static String sampleStr = "Alice is a girl and BOB is a boy";
    public static int length = sampleStr.length();

    public static void getCountOfStringsMethod(String string) {
        String[] newStr = string.split(" ");
        Map<String, Integer> cntrMap = new HashMap<>();
        for (String str : newStr) {
            Integer integer = cntrMap.get(str);
            if (integer == null) {
                cntrMap.put(str, 1);
            }
            else {
                cntrMap.put(str, integer+1);
            }
        }
        System.out.println(cntrMap);
    }

    public static void main(String[] args) {
        getCountOfStringsMethod(sampleStr);
    }
}
