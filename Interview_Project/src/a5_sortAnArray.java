import java.util.Arrays;

public class a5_sortAnArray {
    public static void a5_sortAnArrayMethod(int[] testArr)
    {
    int length = testArr.length;
    for(int i = 0 ; i <length ; i++) {
        for (int j = i + 1; j < length ; j++) {
            int temp = 0;
            if(testArr[i]>testArr[j])
            {
                temp = testArr[i];
                testArr[i] = testArr[j];
                testArr[j] = temp;
            }

        }

    }
        System.out.println(Arrays.toString(testArr));
    }

    public static void main(String[] args) {
        int[] arrT = new int[]{5,4,1,3,1,1,6,7,1,1};
        a5_sortAnArrayMethod(arrT);
    }
}
