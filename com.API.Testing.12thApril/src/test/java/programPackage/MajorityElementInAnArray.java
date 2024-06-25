package programPackage;

import java.util.HashMap;
import java.util.Map;

public class MajorityElementInAnArray {
    public static void main(String[] args)
{
    int[] arr = new int[]{3,2,3};
    Map<Integer, Integer> cntrMap = new HashMap<>();
    for(int i =0 ; i < arr.length - 1 ; i++)
    {
        Integer integer = arr[i];
        if(integer==null)
        {
            cntrMap.put(i,1);
        }
        else {
            cntrMap.put(i,integer+1);
        }
        System.out.println(cntrMap);

    }
}
}

