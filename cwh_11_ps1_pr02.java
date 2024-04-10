import java.util.Scanner;

public class cwh_11_ps1_pr02 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER FIRST SUBJECT MARKS");
        int firstSubject = sc.nextInt();
        System.out.println("ENTER SECOND SUBJECT MARKS");
        int secondSubject = sc.nextInt();
        System.out.println("ENTER THIRD SUBJECT MARKS");
        int thirdSubject = sc.nextInt();
        System.out.println("ENTER FOURTH SUBJECT MARKS");
        int fourthSubject = sc.nextInt();
        System.out.println("ENTER FIFTH SUBJECT MARKS");
        int fifthSubject = sc.nextInt();
        float percentage;
        float totalmarks = firstSubject+secondSubject+thirdSubject+fourthSubject+fifthSubject;
        percentage = (totalmarks/500)*100;
        System.out.println(percentage +"%");
    }
}
