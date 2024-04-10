
class Circle2{
    int radius;
    Circle2(){
        System.out.println("I am a constructor");
        return;
    }
    Circle2(int r){
        System.out.println("I am a circle parametarised constructor");
        this.radius = r;
    }
            public double area(){
        return Math.PI*this.radius*this.radius;
            }
}
class Cylinder2 extends Circle2{

    int height;

    public Cylinder2(int r, int height) {
        super(r);
        System.out.println("I am a cylinder peramitrised constructor");
        this.height = height;
    }

    public double volume(){
        return Math.PI*this.radius*this.radius*this.height;
    }
}


public class practice_inharitance12 {
    public static void main(String[] args) {
//        Circle2 ce = new Circle2(12);
//       System.out.println(ce.area());
        Cylinder2 cy = new Cylinder2(5,6);
        System.out.println(cy.volume());

    }
}
