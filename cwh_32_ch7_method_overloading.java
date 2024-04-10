public class cwh_32_ch7_method_overloading {
    static void foo(){
        System.out.println("Good morning Sakshi ji");
    }
    static void foo(int a) {
        System.out.println("Good morning " + a + "Sakshi ji");
    }    static void change(int a){
        a = 98;
    }
    static void change2(int [] arr){
        arr[0] = 98;
    }
    static void telljoke() {
        System.out.println("I invented a new world!\n" + "plagiarism!");
    }

    public static void main(String[] args) {
          //  telljoke();
//        int [] marks = {52,543, 7, 89, 98, 94};
        // case 1 : changing the integer
//        int x = 45;
//        change(x);
//        System.out.println("The value of x after running change is : " + x);

        // case 2 : changing the Array
//        int [] marks = {52,543, 7, 89, 98, 94};
//
//        change2(marks);
//        System.out.println("The value of x after running change is : " + marks[0]);

        // METHODS OVERLOADING
        foo();
        foo(200);
        foo( 300);
        }
}
