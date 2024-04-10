
 abstract class Parants{
    public Parants(){
        System.out.println(" I am a constructor");
    }

    public void  Sayhello(){
        System.out.println("Hello");
    }
   abstract public void greet();
    abstract public void greet2();


 }
    class Child extends Parants{
    @Override
public void greet(){
    System.out.println("Good morning");
}
@Override
    public void greet2(){
        System.out.println("Good after noon");
    }
}
 abstract class  Child1 extends Parants{
    public void akash(){
        System.out.println("I am fine");
    }
}


public class cwh_53_ch11 {
    public static void main(String[] args) {
          //  Parants p = new Parants();   -- Due to abstract class this will not run
      Child ch = new Child();
      // Child1 ch1 = new Child1();      -- Due to abstract class this will not run
    }
}
