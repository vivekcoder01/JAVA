import java.util.Random;
import java.util.Scanner;

public class prctice_03 {
    public static void main(String[] args) {

        // 0 for rock
       // 1 for paper
        //2 for scisor


        Scanner sc = new Scanner(System.in);
        System.out.println("0 for Rock , 1 For paper , 2 For Scisor");
int userInput = sc.nextInt();
        Random random = new Random();
        int computerInput = random.nextInt();
        if (userInput == computerInput) {
            System.out.println("Draw");
        }
            else if (userInput == 0 && computerInput == 2 || userInput == 1 && computerInput == 0 || userInput == 2 && computerInput == 1 ){

        }
        System.out.println("you won");

    }
}
