import java.util.Random;
import java.util.Scanner;

class Game2 {
    public int number;
    public int inputNumber;
    public int noofGuesses = 0;

    public int getNoofGuesses() {
        return noofGuesses;
    }

    public void setNoofGuesses(int noofGuesses) {
        this.noofGuesses = noofGuesses;
    }

    Game2() {
        Random rand = new Random();
        number = rand.nextInt(100);
        System.out.println(number);
    }

    void takeUserInput() {
        System.out.println("Guesses the number");
        Scanner sc = new Scanner(System.in);
        inputNumber = sc.nextInt();
         }
         boolean iscorrectnumber(){
             noofGuesses++;
        if (inputNumber == number) {

            System.out.format("Yes you gussed it right , It was %d \n you guessed in %d attampts ", number, noofGuesses);
            return true;
        }
        else if (inputNumber<number) {  //less then
            System.out.println("too low");
        }
        else if (inputNumber>number) {   //grater then
            System.out.println("too high");
        }
        return false;
    }
    }

    public class cwh_50 {
        public static void main(String[] args) {

            Game2 g = new Game2();

            boolean b = false;
                    while(!b){
                        g.takeUserInput();
                        b = g.iscorrectnumber();
                    }
        }
    }
