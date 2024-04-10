

class Cylander2{
  private   int radius;
   private int height;
    public  Cylander2(){
        radius = 9;
        height = 12;
    }
    public int getRadius(){
        return radius;
    }
    public void setRadius(int r){
        radius = r;
    }
    public int getHeight(){
        return height;
    }
    public void setHeight(int h){
        height= h;
    }
}


public class practice_os8 {
    public static void main(String[] args) {
        Cylander2 ce = new Cylander2();
        System.out.println(ce.getHeight());
        System.out.println(ce.getRadius());



    }
}
