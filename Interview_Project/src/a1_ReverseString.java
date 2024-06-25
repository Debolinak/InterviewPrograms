public class a1_ReverseString {
    public static void main(String[] args) {
        String[] name = {"D","E","B","O","L","I","N","A"};
        int length = name.length;
        for(String s : name)
        {
            System.out.print(name[length-1]);
            length--;
        }
    }
}
