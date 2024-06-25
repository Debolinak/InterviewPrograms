import java.util.Arrays;

public class a11_AddTwoArrays {
    public static int[] sampleArray1 = new int[] { 5, 8, 1, 9, 1, 5, 1 };
    public static int length1 = sampleArray1.length;
    public static int[] sampleArray2 = new int[] { 20, 80, 30, 60, 70, 50, 10};
    public static int length2 = sampleArray2.length;
    public static int length = (length1 + length2);
    public static int counter1 = 0;
    public static int counter2 = length1;
    public static int[] newSampleArray = new int[length];
    public static void main(String[] args) {
        for (int i = 0 ; i < length1 ; i ++ )
        {
            newSampleArray[counter1] = sampleArray1[i];
            counter1++;
        }
        for (int i = 0 ; i < length2 ; i ++ )
        {
            newSampleArray[counter2] = sampleArray2[i];
            counter2++;
        }

        for(int io : newSampleArray )
        {
            System.out.print(" " + io);
        }
    }
}
