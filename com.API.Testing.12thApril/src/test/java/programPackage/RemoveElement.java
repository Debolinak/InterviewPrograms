package programPackage;

import java.util.ArrayList;
import java.util.Arrays;

//Input: nums = [0,1,2,2,3,0,4,2], val = 2
//Output: 5, nums = [0,1,4,0,3,_,_,_]
public class RemoveElement {
    public static int[] inputArray = new int[]{0,1,2,2,3,0,4,2};
    public static int length = inputArray.length;
   // public static int[] inputArray2= new int[length];
   public static ArrayList<Integer> cntrList = new ArrayList<>();
    public static int value = 2;
    public static int count = 0;
    public static void removeElementMethod(int[] inputArr, int val)
    {

        for(int i = 0; i < length; i++)
        {
            if(inputArr[i] != val)
            {
                cntrList.add(inputArr[i]) ;

            }
            else
            {
                count++;
            }
        }
        System.out.println("The total values are::" + cntrList.size());
        for(int i = 0 ; i < count; i++)
        {
            cntrList.add(95);
        }
        System.out.println(cntrList);

    }
    public static void main(String[] args) {
        removeElementMethod(inputArray, value);
    }

}
