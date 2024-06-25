package programPackage;

import com.google.gson.internal.bind.util.ISO8601Utils;

import java.util.Arrays;

//Input: nums = [0,0,1,1,1,2,2,3,3,4]
//Output: 5, nums = [0,1,2,3,4,_,_,_,_,_]
public class RemoveDuplicatesFromSortedArray {
    public static int duplicates = 0;
    public static int removeDuplicateElements(int arr[], int n){
        if (n==0 || n==1){
            return n;
        }
        int j = 0;//for next element
        for (int i=0; i < n-1; i++){
            if (arr[i] != arr[i+1]){
                arr[j++] = arr[i];
            }
            else {
                duplicates++;
            }
        }
        arr[j++] = arr[n-1];
        return j;
    }

    public static void main (String[] args) {
        int arr[] = {0,0,1,1,1,2,2,3,3,4};
        int length = arr.length;
        length = removeDuplicateElements(arr, length);
        //printing array elements
        for (int i=0; i<length; i++)
            System.out.print(arr[i]+" ");
        System.out.println("the count of duplicates are"+ duplicates);
    }

}
