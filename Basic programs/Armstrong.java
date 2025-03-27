public class Armstrong {

    public static boolean armsornot(int n) {
        int dup = n;
        int count = 0;
        int sum = 0;
        while (n>0) {
            count++;
            n = n/10;
        }
        n = dup;
        while (n>0) {
            int d = n%10;
            sum = sum + (int)Math.pow(d, count);
            n = n/10;
        }
        if (sum == dup) return true;
        return false; 
    }
    public static void main(String[] args) {
        System.out.println(armsornot(1634));
    }
}
