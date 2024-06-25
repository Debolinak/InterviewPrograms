public class a6_sumOfAnArray {
    public static void a6_sumOfAnArrayMethod(int [] arrTest)
    {
        int totalSum = 0 ;
        int sumExpected = 5;
        int sumActual = 0;
        int length = arrTest.length;
        for(int i = 0 ; i < length ; i++)
        {
            totalSum = totalSum + arrTest[i];
            for(int j = i+1; j <length ; j++)
            {
                sumActual = (arrTest[i]+ arrTest[j]);
                if(sumActual== sumExpected)
                {
                    System.out.println("The Pairs are  " +arrTest[i] + " , " + arrTest[j] );
                }
            }
        }
        System.out.println(totalSum);
    }

    public static void main(String[] args) {
        int[] arrT = new int[]{1,0,3,2,4,5,7};
        a6_sumOfAnArrayMethod(arrT);
    }
}
