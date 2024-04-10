import java.util.Random;
import java.util.Scanner;

class Game1{
    public void Game1function (int ComputerInput,int UserInput ,int i){
        if (ComputerInput>UserInput){
            System.out.println("Enter high number pressed");
        } else if (ComputerInput<UserInput) {
            System.out.println("Enter low number pressed");
        }
        else {
            System.out.println("you gesss the number " +i);
        }

    }
}


public class practice_os5 {
    public static void main(String[] args) {

        Game1 ge = new Game1();
        Random random = new Random();
        Scanner userInputscanner = new Scanner(System.in);
        int ComputerInput = random.nextInt(50);
        System.out.println(ComputerInput);
        int userInputLoop;
        int i = 0;
        do{
            System.out.println("Enter the number");
            int userInput = userInputscanner.nextInt();
            userInputLoop = userInput;
            ge.Game1function(ComputerInput , userInput, i);
            i++;
        }
        while (ComputerInput!=userInputLoop);

    }
}
