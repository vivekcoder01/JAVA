public class cwh_27_ch6_arrays {
    public static void main(String[] args) {
      //  int  [] marks = {99,95,97,85,100};
//        float [] marks = {99.3f,95.5f,97.7f,85.25f,95.9f};
//
//        System.out.println(marks.length);
//        System.out.println(marks[2]);
//     String [] students = {"Chaurasiya" ,"Mishra"," Singh","Alam"};
//        System.out.println(students.length);
//        System.out.println(students[0]);

        int [] marks = {98,95,97,96,89};
//Display the array(Naive way)
        System.out.println("printing using naive method");
        System.out.println(marks[0]);
        System.out.println(marks[1]);
        System.out.println(marks[2]);
        System.out.println(marks[3]);
        System.out.println(marks[4]);


        //Displaying the Array (for loop)
        System.out.println("printing using for loop");
        for (int i=0; i<marks.length; i++){
            System.out.println(marks[i]);
        }

 //quick quiz   :Displaying the Array in reverse order (for loop)
        System.out.println("printing using for loop for reverse order");
        for (int i=marks.length-1; i>=0; i--){
            System.out.println(marks[i]);
        }
//quick quiz   :Displaying the Array (for-each  loop)
        System.out.println("printing using for-each loop ");
        for (int element: marks){
            System.out.println(element);
        }


    }
}
