
class Sphare{
    int radius;

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }
    public double surfacearea(){
       return 4*3.14*radius*radius;
    }
    public double volumeofsurface(){
   return 4/3*3.14*radius*radius*radius;
    }
}

public class practice_os9 {
    public static void main(String[] args) {
        Sphare sp = new Sphare();
        sp.setRadius(12);
        System.out.println(sp.surfacearea());
        sp.setRadius(12);
        System.out.println(sp.volumeofsurface());

    }
}
