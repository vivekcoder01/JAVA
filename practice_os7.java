
class Cylander1{
 private    int radius;
   private int height;

    public int getRadius(){
        return radius;
    }
    public void setRadius(int r){
        radius=r;
    }
    public int getHeight(){
        return height;
    }
    public void setHeight(int h){
        height = h;
    }
    public float getSurfacearea (){
        return 2*3.14f*radius*height+2*3.14f*radius*radius;
    }
    public float getVolume(){
        return 3.14f*radius*radius*height;
    }
}


public class practice_os7 {
    public static void main(String[] args) {
        Cylander1 ce = new Cylander1();
        ce.setHeight(12);
        ce.setRadius(9);
        System.out.println(ce.getSurfacearea());
        ce.setRadius(7);
        ce.setHeight(5);
        System.out.println(ce.getVolume());

    }
}
