public class a7_HighestAndLowestInAnArray {
    public static void a7_HighestAndLowestInAnArrayMethod(int[] arrT)
    {
        int length = arrT.length;
        for(int i = 0 ; i <length; i++ )
        {
            for(int j = i+1 ; j<length ; j++)
            {
                int temp = 0 ;
                if(arrT[i]>arrT[j])
                {
                    temp = arrT[i];
                    arrT[i] = arrT[j];
                    arrT[j] = temp;
                }

            }
        }
        System.out.println(arrT[0] + "is the smallest");
        System.out.println(arrT[length-1] + "is the largest");
    }

    public static void main(String[] args) {
        int[] arrT = new int[]{1,10,3,12,4,0,7};
        a7_HighestAndLowestInAnArrayMethod(arrT);
    }
}
