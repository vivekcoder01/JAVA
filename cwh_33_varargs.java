public class cwh_33_varargs {
//    static int sum(int a, int b) {
//        return a + b;
//    }
//
//    static int sum(int a, int b, int c) {
//        return a + b + c;
//    }
//    static int sum(int a, int b, int c,int d) {
//        return a + b + c + d;
//    }
    static int sum(int...arr){
     // Avalabilable as   int [] arr;
        int result = 0;
        for (int a : arr){
            result += a;
        }
        return result;
    }
    public static void main(String[] args) {
        System.out.println("Welcome to Varargs tutorial");
         System.out.println("The sum of 4 and 5 is :" + sum());
        System.out.println("The sum of 4,3 and 5 is :" + sum(4, 3, 5));
        System.out.println("The sum of 3,5,6 and 9 is :" + sum(3,5,6,9));
        System.out.println("The sum of 3,4,5,6 and 9 is : " + sum(3,4,5,6,9));

    }
}