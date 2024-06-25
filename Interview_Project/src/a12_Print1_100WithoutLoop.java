public class a12_Print1_100WithoutLoop {
    public static void a12_Print1_100WithoutLoop(int n) {
        if (n > 0) {
            System.out.println(n + " ");
            a12_Print1_100WithoutLoop(n-1);
        }
    }
    public static void main(String[] args) {
        int n = 10;
        a12_Print1_100WithoutLoop(n);
    }
}
