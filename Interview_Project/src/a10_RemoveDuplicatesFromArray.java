import java.util.Arrays;

public class a10_RemoveDuplicatesFromArray {
    public static void a10_RemoveDuplicatesFromArrayMethod(int [] arrT) {
        int length = arrT.length;
        int index = 0;
        int j ;
        for (int i = 0; i < length; i++) {
            for ( j = 0; j < i; j++) {
                if (arrT[i] == arrT[j]) {
                    break;
                }
                }
                if (i == j) {
                    arrT[index++] = arrT[i];
                }
            }
            System.out.println(Arrays.toString(Arrays.copyOf(arrT, index)));
        }



    public static void main(String[] args) {
        int[] newArr = new int[]{2,2,2,5,6,2,4,6,4};
        a10_RemoveDuplicatesFromArrayMethod(newArr);

    }
}
