package programPackage;

//ransom_string = "Today is April 10"

//magazine_string = "10 is one of the numbers and days in the April Month. Today"

import java.util.HashMap;
import java.util.Map;

public class RansomNote {
public static String string1 = "Today is April 10";
public static String string2 = "10 is one of the numbers and days in the April Month. Today";
public static boolean ransomNoteMethod(String str1, String str2)
{
    Map<Character,Integer> cntrMap1 = putStringInMap(str1);
    Map<Character,Integer> cntrMap2 = putStringInMap(str2);

    for(Character c : str1.toCharArray()){
        if(cntrMap2.get(c) < cntrMap1.get(c)) {
            return false;
        }
    }
return true;
}
public static Map<Character,Integer> putStringInMap(String strToBeKeptInMap)
{
   // String[] splittedStrArr = strToBeKeptInMap.split(" ");
    Map<Character,Integer> cntrMap = new HashMap<>();
    for(Character c :strToBeKeptInMap.toCharArray() )
    {
        if(cntrMap.get(c) == null) {
            cntrMap.put(c, 1);
        }
        else
        {
            cntrMap.put(c, cntrMap.get(c) + 1);
        }
    }
    System.out.println(cntrMap);
    return cntrMap;

}
public static void main(String[] args) {
    System.out.println(ransomNoteMethod(string1,string2));
}
}
