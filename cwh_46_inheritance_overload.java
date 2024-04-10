
class Base1{
    public Base1() {
        System.out.println("I am a constructor");
    }
    Base1(int x){
        System.out.println("I am a overloading constructor with value of as x:" +x);
    }
}
class Drived1 extends Base1{
    public Drived1() {
    super(0);
        System.out.println("I am a derived class constructor");
    }
    Drived1 (int x ,int y){
     super(x);
        System.out.println("I am a overloading constructor with value of as y: " +y);
    }
}
class Childofdrives extends Drived1{
    public Childofdrives(){
        System.out.println("I am a chaildofdrives of constructor");
    }
    Childofdrives(int x, int y, int z){
        super(x,y);
        System.out.println("I am a overloading constructor with the value of as z :" +z);
    }
}

public class cwh_46_inheritance_overload {
    public static void main(String[] args) {

      //  Base1 b = new Base1();
     //   Drived1 d = new Drived1();
    //  Drived1 d = new Drived1(2,3);
        Childofdrives ds = new Childofdrives(4,5,8);
    }
}
