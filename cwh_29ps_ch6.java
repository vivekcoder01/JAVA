public class cwh_29ps_ch6 {
    public static void main(String[] args) {

        //PRACTICE PROBLEM ONE (1)
//        float [] marks = {95.8f, 99.9f, 97.5f, 96.4f,97.9f};
//        float sum = 0;
//        for(float element:marks){
//            sum = sum + element;
//        }
//        System.out.println("The value of sum is " + sum);

        //    PRACTICE PROBLEM TWO(2)
//        float [] marks = {95.8f, 99.9f, 97.5f, 96.4f,97.9f};
//        float num = 95.80f;
//        boolean isInArray = false;
//        for(float element:marks){
//            if (num == element){
//                isInArray = true;
//                break;
//            }
//        }
//        if (isInArray){
//            System.out.println("The value is present in the array");
//        }
//        else{
//            System.out.println("The value is not present in the array");
//        }

        // PRACTICE PROBLEM THREE(3)
//        float [] marks = {95.8f, 99.9f, 97.5f, 96.4f,97.9f};
//        float sum = 0;
//        for(float element:marks){
//            sum = sum + element;
//        }
//        System.out.println("The value of average marks is " + sum/marks.length);

        // PRACTICE PROBLEM FOUR(4)
//        int[][] mat1 = {{1, 2, 3},
//                {4, 5, 6}};
//        int[][] mat2 = {{2, 6, 13},
//                {3, 7, 1}};
//        int[][] result = {{0, 0, 0},
//                {0, 0, 0}};
//
//        for (int i = 0; i < mat1.length; i++) {// ROW NUMBERS OF TIME
//            for (int j = 0; j < mat1[i].length; j++) {// COLUMN NUMBER OF TIME
//                System.out.format("Setting value for i=%d and j=%d,\n", i, j);
//                result[i][j] = mat1[i][j] + mat2[i][j];
//            }
//        }
//        // printing the element of a 2-D Array
//        for (int i = 0; i < mat1.length; i++) {// ROW NUMBERS OF TIME
//            for (int j = 0; j < mat1[i].length; j++) {// COLUMN NUMBER OF TIME
//                System.out.print(result[i][j] + " ");
//                result[i][j] = mat1[i][j] + mat2[i][j];
//
//            }
//            System.out.println(""); // print a new line
//        }

        //PRACTICE PROBLEM (5)
//        int [] arr = {1,2,3,4,5,6,66};
//        int l = arr.length;
//        int n = Math.floorDiv(l,2);
//        int temp;
//        for (int i=0; i<n; i++){
//            temp = arr[i];
//            arr[i] = arr[l-i-1];
//            arr[l-i-1] = temp;
//        }
//        for (int element:arr){
//            System.out.print(element + " ");
//        }

        //PRACTICE PROBLEM  SIX(6)
//        int [] arr = {1,21,3,2100,5 ,455,34,67};
//        int max = 0;
//        for (int e: arr){
//            if(e>max){
//                max = e;
//            }
//        }
//        System.out.println("The value of the maximum element in this array is :" + max);


        //PRACTICE PROBLEM EIGHT (8)
        boolean isSorted = true;
        int[] arr = {1,2,3,4, 5, 6,34, 67,455};
        for (int i = 0; i < arr.length-1; i++) {
            if (arr[i] > arr[i + 1]) {
                isSorted = false;
                break;

            }
        }
        if (isSorted){
            System.out.println("The Array is sorted");
        }
        else {
            System.out.println("The program is not sorted");
        }
    }
}