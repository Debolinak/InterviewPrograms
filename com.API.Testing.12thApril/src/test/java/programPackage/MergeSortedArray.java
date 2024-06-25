package programPackage;

import com.google.gson.internal.bind.util.ISO8601Utils;

import java.util.ArrayList;
import java.util.Arrays;

public class MergeSortedArray {
    public static int[] sampleArray1 = new int[]{1,2,3,0,0,0};
    public static int[] sampleArray2 = new int[]{2,5,6};
    public static int length1 = sampleArray1.length;
    public static int length2= sampleArray2.length;
    public static int length3 = length1 + length2;
    public static int[] sampleArray3 = new int[length3];
    public static ArrayList<Integer> arrList = new ArrayList();
    public static void mergeSortedArrayMethod(int[] sampleArr1, int[] sampleArr2)
    {   int count = 0;
        int count2 = 0;
        for(int i = 0 ; i <length3; i ++)
        {
            if(i<=length1-1 ) {
                sampleArray3[i] = sampleArr1[i];
                count2++;
            }
            else
            {
                sampleArray3[i] = sampleArr2[count];
                count++;
            }
        }
        Arrays.sort(sampleArray3);
        for(int i = 0 ; i <length3; i ++)
        {
            if(sampleArray3[i]!=0)
            {
                arrList.add(sampleArray3[i]);
            }

        }
        System.out.println(arrList);

    }

    public static void main(String[] args) {
        mergeSortedArrayMethod(sampleArray1, sampleArray2);
    }
}
