public class cwh_12_ps2_pr_02 {
    public static void main(String[] args) {
        char grade = 'a';
        //encripting the grade

        grade = (char) (grade + 8);
        System.out.println(grade);

        //decrypting the grade
        grade = (char)(grade-8);
        System.out.println(grade);
    }
}
