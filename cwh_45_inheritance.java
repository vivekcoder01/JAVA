class Base {
  public   int x;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        System.out.println("I am a base and setting x now");
        this.x = x;
    }

    public void Base() {
        System.out.println("I am a constructor");//Consturctors
        int x;
    }
}
   class Drived extends Base{
      public   int y;

       public int getY() {
           return y;
       }

       public void setY(int y) {
           System.out.println("I am a base and setting y now");
           this.y = y;
       }
   }

public class cwh_45_inheritance {
    public static void main(String[] args) {
        Base b = new Base();         //creating a object of Base class
        Drived d = new Drived();    // creating a object of Drived class
        b.setX(45);
        System.out.println(b.getX());
        d.setY(21);
        System.out.println(d.getY());

    }
}
