import java.util.Scanner;

public class cwh_19_4 {
    public static void main(String[] args) {
        //QUESTION 1
     //   int a=11;
      //  if (a==11)
     //   {
     //       System.out.println("I AM 11");
    //    }
     //   else{
     //       System.out.println("I AM NOT 11");
      //  }

        //QUESTION 2
    //     byte m1,m2,m3;
      //  Scanner sc = new Scanner(System.in);
//        System.out.println("Enter your marks in physics");
//
//        m1 = sc.nextByte();
 //       System.out.println("Enter your marks in chemistry");
 //       m2 = sc.nextByte();
 //       System.out.println("Enter your marks inmathematics");
 //       m3 = sc.nextByte();

//        float avg = (m1+m2+m3)/3.0f;
 //       if(avg >=40 && m1>=33 && m2>=33 && m3>=33){
 //           System.out.println("conguratulations you have been promated");
 //       }
 //       else{
 //           System.out.println("sorry  you have been not promoted! please try again");
 //       }

        // QUESTION 3RD

//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter your income in lakhs per annum");
//        float tax = 0;
//        float income = sc.nextFloat();
//        if(income<2.5){
//            tax = tax + 0;
//        }
//        else if(income >2.5 &&income <=5 ){
//            tax = tax + 0.05f * (income-2.5f);
//
//        }
//        else if(income >5 && income<=10.0f){
//            tax = tax + 0.05f * (5.0f-2.5f);
//            tax = tax + 0.02f * (income-5f);
//        }
//        else if (income <10){
//            tax = tax + 0.05f * (5.0f-2.5f);
//            tax = tax + 0.2f * (10.0f-5f);
//            tax = tax + 0.3f * (income-10.0f);
//        }
//        System.out.println("The total tax paid by employee is :  " + tax);
//

  // QUESTION NUMBWE 04
//   Scanner sc = new Scanner(System.in);
//  int day = sc.nextInt();
//  switch(day){
//      case 1-> System.out.println("Monday");
//      case 2-> System.out.println("Tuesday");
//      case 3-> System.out.println("Wednessday");
//      case 4-> System.out.println("Thursday");
//      case 5-> System.out.println("Friday ");
//      case 6-> System.out.println("Saterday");
//      case 7-> System.out.println("Sunday");

//  }


        //QUESTION 6;
        Scanner sc = new Scanner(System.in);
        String website = sc.nextLine();
        if(website.endsWith(".org")){
            System.out.println("This is an organizational website");
        }
        else if (website.endsWith(".com")){
            System.out.println("This is a commercial website");
        } else if (website.endsWith(".in")) {
            System.out.println("This is a indian website");
        }

    }


}
