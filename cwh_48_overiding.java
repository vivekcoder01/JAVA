
class A{
    public int vikash (){
        return 5;
    }
    public void method2(){
        System.out.println("I am a method 2 of class A");
    }
}
class B extends A{
    @Override

    public void method2(){
        System.out.println("I am a method 2 of class B");
    }

    public void method3() {
        System.out.println("I am a method 3 of class B");

    }
}



public class cwh_48_overiding {
    public static void main(String[] args) {
        A akash = new A();
        B boy = new B();
        akash.method2();
      boy.method2();

    }
}
