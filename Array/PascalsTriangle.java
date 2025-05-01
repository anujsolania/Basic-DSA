
package Array;

class PascalsTriangle {

    public static int BrutenCr(int n, int r) {
        int res = 1;
        for (int i = 0; i < r; i++) {
            res = res * (n-i);
            res = res / (i+1); 
        }
        return res;
    }
    public static void OptimalnCr(int n) {
        int ans = 1;
        System.out.print(ans+ " ");
        for (int i = 1; i < n; i++) {
            ans = ans * (n-i);
            ans = ans / i; 
            System.out.print(ans+ " ");
        }
    }
    public static void main(String[] args) {
        // int r = 5;
        // int c = 3;

        //r,cth position
        // int ans = BrutenCr(r-1,c-1);
        // System.out.println(ans);

        // int n = 5;
        //nth row -BRUTE
        // for (int col = 1; col <= n; col++) {
        //     int ans = BrutenCr(n-1,col-1);
        //     System.out.println(ans);
        // }

        int n =6;
        //nth row - OPtimal
        OptimalnCr(n);
    }
    
}