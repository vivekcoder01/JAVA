public class cwh_15_ps3 {
    public static void main(String[] args) {

        // PROBLEM NO 1
        String name = "VIVEK kumar chaurasiya";
        name= name.toLowerCase();
        System.out.println(name);


        //PROBLEM NO 2
        name = name.replace(" ","_");
        System.out.println(name);

        //PROBLEM NO 3
        String letter = "Dear <|name|>  , Thanks a lot";
        letter = letter.replace("<|name|>","vivek");
        System.out.println(letter);

        //PROBLEM NO 4
        String mystring = "This string     contains  double   or triple spaces";
        System.out.println(mystring.indexOf("  "));
        System.out.println(mystring.indexOf("  "));


        //PROBLEM NO 5
        String letter2 = "Dear vivek\n\t , This java course is Nice.\n\t Thanks!";
        System.out.println(letter2);
    }
}
