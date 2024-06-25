import java.util.Arrays;

public class a4_move1stoLeft {
    public static void a4_move1stoLeftMethod(int[] arrT)
    {
    int length = arrT.length;
    int[] newArr = new int[length];
    int index = length-1;
    for(int i = 0; i<length-1 ; i++)
    {
        if(arrT[i]!= 1)
        {
            newArr[index] = arrT[i];
            index--;
        }

    }
       // System.out.println(Arrays.toString(newArr));
        for(int i = 0; i <length ; i++)
        {
            if(newArr[i] == 0)
            {
                newArr[i] = 1;
            }
        }
        System.out.println(Arrays.toString(newArr));
    }

    public static void main(String[] args) {
        int[] arrtest = new int[]{5,4,1,3,1,1,6,7,1,1};
        a4_move1stoLeftMethod(arrtest);

    }
}
