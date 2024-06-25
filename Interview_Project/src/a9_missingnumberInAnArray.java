public class a9_missingnumberInAnArray {
    public static int sum = 0;
    public static int actualSum = 0 ;
    public static void a9_missingnumberInAnArray(int[] arrT)
    {
        int length = arrT.length;
       // int sum = 0;
        actualSum = ((length + 1) * (length + 2))/2;
        for(int i = 0 ; i<length; i++)
        {
            sum = sum + arrT[i];
        }
        System.out.println("The actual sum is" + actualSum);
        System.out.println("The expected sum is" + sum);
    }

    public static void main(String[] args) {
        int[] arrTest = new int[]{1,2,4,5,6};
        a9_missingnumberInAnArray(arrTest);
        int missingNumber = (actualSum - sum);
        System.out.println("Missing Number is " + missingNumber);
    }
}
