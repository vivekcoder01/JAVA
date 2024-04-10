
class Circle1{
 private float radius;
  public float getRadius(){
      return 2*3.14f*radius;
  }
  public void setRadius(float r){
      radius = r;
  }
}

public class practice_os1 {
    public static void main(String[] args) {

        Circle1 ce = new Circle1();
       // ce.radius = 32012f;
        ce.setRadius(3);
        System.out.println(ce.getRadius());
    }
}
