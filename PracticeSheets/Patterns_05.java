package PracticeSheets;
public class Patterns_05 {

    static void hollowPattern(int n, int m){
        for(int i = 1; i<=n; i++){
            for(int j = 1; j<=m; j++){
                if(i == 1 || i == n || j == 1 || j == m){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    static void invertedPyramid(int n){
        for(int i = 1; i<=n; i++){
            for(int j = n-1; j>=i; j--){
                System.out.print(" ");
            }
            for(int j = 1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void invertedPyramidNumbers(int n){
        for(int i = n; i>0; i--){
            for(int j = 1; j<=i; j++){
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    static void triangle_01(int n){
        // for(int i = 1; i<=n; i++){
        //     int start = (i%2 == 0) ? 0 : 1;
        //     for(int j = 1; j<=i; j++){
        //         System.out.print(start + " ");
        //         start = (start == 0) ? 1 : 0;
        //     }
        //     System.out.println();
        // }
        for(int i = 1; i<=n; i++){
            for(int j = 1; j<=i; j++){
                if((i+j)%2 == 0){
                    System.out.print("1");
                }else{
                    System.out.print("0");
                }
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    static void floydTriangle(int n){
        int start = 1;

        for(int i = 1; i<=n; i++){
            for(int j = 1; j<=i; j++){
                System.out.print((start++) + " ");
            }
            System.out.println();
        }
        
    }

    static void butterfly(int n){
        for(int i = 0; i<n; i++){
            for(int j = 0; j<=i; j++){
                System.out.print("*");
            }
            for(int j = 0; j<2*(n-i-1); j++){
                System.out.print(" ");
            }
            for(int j = 0; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i = n-1; i>=0; i--){
            for(int j = 0; j<=i; j++){
                System.out.print("*");
            }
            for(int j = 0; j<2*(n-i-1); j++){
                System.out.print(" ");
            }
            for(int j = 0; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void solid_rhombus(int n){
        for(int i = 1; i<=n; i++){
            for(int j = n; j>i; j--){
                System.out.print(" ");
            }
            for(int j = 1; j<=n; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void hollow_rhombus(int n){
        for(int i = 1; i<=n; i++){
            for(int j = n; j>i; j--){
                System.out.print(" ");
            }
            for(int j = 1; j<=n; j++){
                if(i == 1 || j == 1 || i == n || j == n){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    static void diamond(int n){
        for(int i = 0; i<n; i++){
            for(int j = 1; j<(n-i); j++){
                System.out.print(" ");
            }
            for(int j = 1; j<= (2*i + 1); j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i = n-1; i>=0; i--){
            for(int j = 1; j<(n-i); j++){
                System.out.print(" ");
            }
            for(int j = 1; j<= (2*i + 1); j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
//   1
//  2 2
// 3 3 3
//4 4 4 4 
    static void numberPyramid(int n){
        for(int i = 1; i<=n; i++){
            for(int j = 1; j<=(n-i); j++){
                System.out.print(" ");
            }
            for(int j = 1; j<=i; j++){
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }


    static void numberPalindrome(int n){
        for(int i = 1; i<=n; i++){
            for(int j = 1; j<=(n-i); j++){
                System.out.print(" ");
            }
            for(int j = i; j>=1; j--){
                System.out.print(j );
            }
            for(int j = 2; j<=i; j++){
                System.out.print(j );
            }
            System.out.println();
        }
    }

    static void pattern1(int n){
        for(int i = 0; i<n; i++){
            for(int j = 0; j<=i; j++){
                System.out.print("*");
            }
            for(int j = 0; j<(n-i-1)*2; j++){
                System.out.print(" ");
            }
            for(int j = 0; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        
    }

    static void rhombus(int n){
        for(int i = 0; i<n; i++){
            for(int j = n-1; j > i; j--){
                System.out.print(" ");
            }
            System.out.print("*");
            for(int j = 0; j<2*i-1; j++){
                System.out.print(" ");
            }
            if(i != 0) System.out.println("*");
            else System.out.println();
        }
        for(int i = n-2; i>=0; i--){
            for(int j = n-1; j > i; j--){
                System.out.print(" ");
            }
            System.out.print("*");
            for(int j = 0; j<2*i-1; j++){
                System.out.print(" ");
            }
            if(i != 0) System.out.println("*");
            else System.out.println();
        }
    }


    static void numberRhombus(int n){
        for(int i = 1; i<=n; i++){
            for(int j = i; j<n; j++){
                System.out.print(" ");
            }
            for(int j = 1; j<=i; j++){
                System.out.print(j);
            }
            for(int j = i -1; j>=1;j--){
                System.out.print(j);
            }
            System.out.println();
        }
        for(int i = n-1; i>0;i--){
            for(int j = i; j<n; j++){
                System.out.print(" ");
            }
            for(int j = 1; j<=i; j++){
                System.out.print(j);
            }
            for(int j = i -1; j>=1;j--){
                System.out.print(j);
            }
            System.out.println();
        }
    }


    public static void main(String[] args) {
       hollowPattern(5, 6);
       System.out.println();

       invertedPyramidNumbers(5);
       System.out.println();

       floydTriangle(5);
       System.out.println();

       triangle_01(5);
       System.out.println();

       invertedPyramid(5);
       System.out.println();

        butterfly(6);
        System.out.println();

        solid_rhombus(5);
        System.out.println();

        hollow_rhombus(5);
        System.out.println();

        diamond(4);
        System.out.println();

        numberPyramid(5);
        System.out.println();

        numberPalindrome(5);
        System.out.println();

        pattern1(4);
        System.out.println();

        rhombus(4);
        System.out.println();

        numberRhombus(4);
        System.out.println();

    }
}
