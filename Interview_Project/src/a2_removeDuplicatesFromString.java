import java.util.Arrays;

public class a2_removeDuplicatesFromString {
    public static void a2_removeDuplicatesFromStringMethod(String[] reqS)
    {
       // String[] reqSnew = new String[]{};
        int length = reqS.length;
        int index = 0 ;
        int j;
        for(int i = 0 ; i <length; i++)
        {
            for(j = 0 ; j<i; j++)
            {
         if(reqS[i]==reqS[j])
        {
        break;
        }
            }
            if(j == i )
            {
                reqS[index++] = reqS[i];
            }
           // System.out.println(Arrays.toString(reqS));
        }
        System.out.println(Arrays.toString(Arrays.copyOf(reqS, index)));
    }

    public static void main(String[] args) {
        String[] reqSnew = {"D","E","E","B","B","O","L","L","I","N","A"};
        a2_removeDuplicatesFromStringMethod(reqSnew);
    }
}
