import java.util.ArrayList;

public class Alldivisors {

    public static void print(int n) {
        ArrayList<Integer> divisors = new ArrayList<>();
        for (int i = 1; i <= Math.sqrt(n); i++) {
            if (n%i == 0) {
                divisors.add(i);
                if(i != n/i) divisors.add(n/i);
            }
        }
        divisors.sort(null);
        System.out.println(divisors);
    }
    public static void main(String[] args) {
        print(36);
    }
}
