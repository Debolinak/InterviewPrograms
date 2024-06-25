import java.util.Arrays;

public class a3_move0stoLeft {
    public static void a3_move0stoLeftmethod(int[] arrT)
    {
        int length = arrT.length;
        int[] newArr = new int[length];
       // int counter = 0;
        int counter = length;
        //for(int i = 0 ; i < length ; i++)
        for(int i = length-1 ; i >=0;i--)
        {
            if(arrT[i]!= 0)
            {
               // arrT[counter] = arrT[i];
                newArr[counter-1] = arrT[i];
                counter--;
            }
        }
       // System.out.println(Arrays.toString(Arrays.copyOf(arrT,counter)));
        System.out.println(Arrays.toString(newArr));
    }

    public static void main(String[] args) {
        int[] arrtoBePrinted = new int[]{1,0,5,8,8,0,0,3,4,5};
        a3_move0stoLeftmethod(arrtoBePrinted);
    }
}
