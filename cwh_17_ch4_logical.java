public class cwh_17_ch4_logical {
    public static void main(String[] args) {
        // LOGICAL AND
        boolean a = true;
        boolean b = true;
        boolean c = true;
        if(a && b && c){
            System.out.println("yes");
        }
        else{
            System.out.println("no");
        }
//LOGICAL OR
        boolean d = false;
        boolean e = true;
        if(d|| e){
            System.out.println("yes");
        }
        else {
            System.out.println("no");
        }

       // LOGICAL NOT
       boolean f = true;
        boolean g = false;
        System.out.println("Not(f) is ");
        System.out.println(!f);
        System.out.println("Not(g) is");
        System.out.println(!g);


    }
}
