public class Prime {

    public static boolean primeornot(int n) {
        int count = 0;
        for (int i = 1; i <= n; i++) {
            if (n%i == 0) {
                count++;
            }
        }
        if (count == 2) return true;
        return false;
    }
    public static void main(String[] args) {
        System.out.println(primeornot(53));
    }
}
