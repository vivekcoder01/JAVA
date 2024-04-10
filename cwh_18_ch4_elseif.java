import java.util.Scanner;

public class cwh_18_ch4_elseif {
    public static void main(String[] args) {
        /*
        int age;
        System.out.println("Enter your age");
        Scanner sc = new Scanner(System.in);
        age = sc.nextInt();
        if(age>60){
            System.out.println("you are retired");
        } else if(age>23){
            System.out.println("you are elejible for jab ");
        }
        else if (age>18){
            System.out.println("you are adult");
        }
         else{
            System.out.println("you will enjoy");
        }
        System.out.println(age);
*/
/*
        int age;
        System.out.println("enter your age");
        Scanner sc = new Scanner(System.in);
        age = sc.nextInt();
        switch(age) {
            case 18:
                System.out.println("you are going to became an adult");
                break;
            case 23:
                System.out.println("you are elegiable for a jab");
                break;
            case 60:
                System.out.println("your age is retired");
                break;
            default:
                System.out.println("enjoy your life");
                break;
        }
*/

      char var = 'r';
      switch(var){
          case 'r':
          System.out.println("you are an adult");
          break;
          case 'a':
              System.out.println("you are eligablie for a jab");
              break;
          case 'b':
              System.out.println("you are retired");
              break;
          case 'c':
              System.out.println("enjoy your life");
              break;
      }


    }
}
