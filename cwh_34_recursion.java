public class cwh_34_recursion {
    // factorial(n) = n * n-1...1
    // factorial(5) = 5*4*3*2*1 = 120;
    // factorial(n) = n * factorial(n-1)
    //factorial (0) = 1
    static int factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            int product = 1;
            for (int i = 1; i <= n; i++) {
                product *= i;
            }
            return product;
        }

    }

    public static void main(String[] args) {
        int x = 6;
        System.out.println("The value of factorial x is : " + factorial(x));
        System.out.println("The value of factorial x is : " + factorial(x));

        // febonachi series
        
    }
}