import java.util.Scanner;

public class Patterns {

    public static void square(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void triangle(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    
    public static void triangle2(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
    
    public static void triangle3(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i);
            }
            System.out.println();
        }
    }
    
    public static void triangleReverse(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = n; j >= i; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void triangleReverse2(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 1; j <= n-i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }

    public static void pyramid(int n) {
        for (int i = 0; i < n; i++) {
            //for space 
            for (int j = 0; j < n-i-1; j++) {
                System.out.print(" ");
            }
            //for star
            for (int j = 0; j < 2*i+1; j++) {
                System.out.print("*");
            }
            //for space
            for (int j = 0; j < n-i-1; j++) {
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    public static void pyramidReverse(int n) {
        for (int i = 0; i < n; i++) {
            //for space 
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            //for star
            for (int j = 0; j < 2*n - (2*i+1); j++) {
                System.out.print("*");
            }
            //for space
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            System.out.println();
        }
    }
    
    public static void halfDiamond(int n) {
        for (int i = 1; i <= 2*n-1; i++) {
            int stars = i;
            if (i > n) { stars = 2*n-i; }
            for (int j = 1; j <= stars; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void binaryTriangle(int n) {
        int start = 1;
        for (int i = 1; i <= n; i++) {
            if (i%2 == 0) start = 0;
            else start = 1;
            for (int j = 1; j <= i; j++) {
                System.out.print(start);
                start = 1 - start;
            }
            System.out.println();
        }
    }
    
    public static void numberCrown(int n) {
        for (int i = 1; i <= n; i++) {
        //number
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
        //space
            for (int j = 0; j < 2*(n-i); j++) {
                System.out.print(" ");
            }
        //number
            for (int j = i; j >= 1; j--) {
                System.out.print(j); 
            } 
            System.out.println();
        }
    }
    
    public static void increasingNumTriangle(int n) {
        int count = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(count+ " ");
                count++;
            }
            System.out.println();
        }
    }
    
    public static void increasingLetterTriangle(int n) {
        for (int i = 0; i < n; i++) {
            for (char ch = 'A'; ch <= 'A'+i; ch++) {
                System.out.print(ch);
            }
            System.out.println();
        }
    }
    
    public static void reverseLetterTriangle(int n) {
        for (int i = 0; i < n; i++) {
            for (char ch = 'A'; ch < 'A'+(n-i); ch++) {
                System.out.print(ch);
            }
            System.out.println();
        }
    }

    public static void alphaRampTriangle(int n) {
        char ch = 'A';
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(ch);
            }
            ch++;
            System.out.println();
        }
    }

    public static void alphaHillTriangle(int n) {
        for (int i = 1; i <= n; i++) {
            char ch = 'A';
            //space
            for (int j = 1; j <= n-i; j++) {
                System.out.print(" ");
            }
            //star
            for (int j = 1; j <= 2*i-1; j++) {
                System.out.print(ch);
                if(j < i) ch++;
                if(j >= i) ch--;
            }
            //space
            for (int j = 1; j <= n-i; j++) {
                System.out.print(" ");
            }
            System.out.println();
        }
    }
    
    public static void alphaTriangle(int n) {
        for (int i = 1; i <= n; i++) {
            char ch = (char) ('A'+ n-i);
            for (int j = 1; j <= i; j++) {
                System.out.print(ch);
                ch++;
            }
            System.out.println();
        }
    }

    public static void symmetricVoid(int n) {
        //1st half
        for (int i = 1; i <= n; i++) {
            //star
            for (int j = n; j >= i; j--) {
                System.out.print("*");
            }
            //space
            for (int j = 1; j <= 2*i-2; j++) {
                System.out.print(" ");
            }
            //star
            for (int j = n; j >= i; j--) {
                System.out.print("*");
            }
            System.out.println();
        }

        //2nd half
        for (int i = 1; i <= n; i++) {
            //stars
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            //space
            for (int j = 1; j <= 2*(n-i); j++) {
                System.out.print(" ");
            }
            //stars
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    
    public static void symmetricButterfly(int n) {
        for (int i = 1; i <= 2*n-1; i++) {
            int stars = i;
            if(i > n) stars = 2*n-i;
            //star
            for (int j = 1; j <= stars; j++) {
                System.out.print("*");
            }

            int spaces = 2*(n-i);
            if(i > n) spaces = 2*(i-n);
            //space
            for (int j = 1; j <= spaces; j++) {
                System.out.print(" ");
            }

            //star
            for (int j = 1; j <= stars; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    
    public static void hollowRectangle(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n ; j++) {
                if (i==1 || i==n || j==1 || j==n) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    
    public static void theNumber(int n) {

        for (int i = 0; i < 2*n-1; i++) {
            for (int j = 0; j < 2*n-1 ; j++) {
                int top = i;
                int bottom = 2*n - i;
                int left = j;
                int right = 2*n - j;
                int num = n - Math.min(Math.min(top, bottom),Math.min(left, right));
                System.out.print(num);
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        // square(5);
        // triangle(5);
        // triangle2(5);
        // triangle3(5);
        // triangleReverse(5);
        // triangleReverse2(5);
        // pyramid(5);
        // pyramidReverse(5);
        // pyramid(5); pyramidReverse(5);
        // halfDiamond(5);
        // binaryTriangle(5);
        // numberCrown(5);
        // increasingNumTriangle(5);
        // increasingLetterTriangle(5);
        // reverseLetterTriangle(5);
        // alphaRampTriangle(5);
        // alphaHillTriangle(5);
        // alphaTriangle(10);
        // symmetricVoid(5);
        // symmetricButterfly(5);
        // hollowRectangle(5);
        // theNumber(4);

    }
    
}