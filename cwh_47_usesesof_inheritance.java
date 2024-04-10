
class  Ekclass{
    int a;

    public int getA() {
        return a;
    }

    public Ekclass(int a) {
        this.a = a;
    }
}
class Doclass extends Ekclass{

    public Doclass(int a) {
        super(a);
        System.out.println("I am constructor");
    }
}


public class cwh_47_usesesof_inheritance {
    public static void main(String[] args) {
        Ekclass e = new Ekclass(25);
        Doclass d = new Doclass(21);
        System.out.println(e.getA());
        System.out.println(e.getA());

    }
}
