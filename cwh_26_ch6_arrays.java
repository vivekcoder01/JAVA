public class cwh_26_ch6_arrays {
    public static void main(String[] args) {
        // classroom  of five hundreed  students - you have to store marks of these 500 students
        //you have 2 options
     //   1. create 500 variables
     //   2. use arrays  (recommended)

        //THERE ARE THREE MAIN WAYS TO CREATE AN ARRAY IN JAVA
        //    1. Decleration and memory alllocation
        //     int [] marks = new int[5];
        //    2. Decleration and then memory allocation
//            int [] marks;
//            marks = new int[5];
        //  Initialization
//           marks[0] = 95;
//           marks[1] = 99;
//           marks[2] = 85;
//           marks[3] = 98;
//           marks[4] = 100;
        //  marks[5] = 97; -> throws an error
//        System.out.println(marks[0]);

      //  3.Decleration, memory allocation and initialization topgather
        int [] marks = {95,99,85,98,100};
        System.out.println(marks[4]);
    }
}
