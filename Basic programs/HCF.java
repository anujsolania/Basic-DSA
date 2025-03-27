public class HCF {
    public static void hcf(int n1,int n2) {
        int GCD = 1;
        int max = Math.max(n1, n2);
        int min = Math.min(n1, n2);
        for (int i = 1; i <= min; i++) { 
            if (min%i == 0 && max%i == 0) {
                GCD = i;
            }
        }
        System.out.println("GCD is "+GCD);
    }

    public static void euclidean(int a,int b) {
        while (a!=0 && b != 0) {
            if (a>b) a = a%b;
            else b = b%a;
        }
        if (a == 0) System.out.println("GCD is "+ b);
        else System.out.println("GCD is "+ a);
    }

    public static void main(String[] args) {
        // hcf(20,24); //O(n)

        euclidean(48, 24);
    }
}
