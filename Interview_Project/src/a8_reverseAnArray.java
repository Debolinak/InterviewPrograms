public class a8_reverseAnArray {
    public static void a8_reverseAnArray(int[] arrT)
    {
        int length = arrT.length;
        for(int i = length-1 ; i >=0 ; i--)
        {
            System.out.print(arrT[i] + " ");
        }
    }

    public static void main(String[] args) {
        int[] arrT = new int[]{1,10,3,12,4,0,7};
        a8_reverseAnArray(arrT);
    }
}
