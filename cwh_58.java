interface SampleInterface{
    void meth1();
    void meth2();
}
 interface ChildsimpleInterface extends SampleInterface{
    void meth3();
    void meth4();
}
class Mysimpleclass implements ChildsimpleInterface{
  public void meth3(){
        System.out.println("meth 3");
    }

    @Override
    public void meth4() {
        System.out.println("meth 4");
    }
    public void meth1(){
        System.out.println("meth 1");
    }
    public void meth2(){
        System.out.println("meth 2");
    }
}




public class cwh_58 {
    public static void main(String[] args) {
    Mysimpleclass ms = new Mysimpleclass();
    ms.meth1();
    ms.meth2();
    ms.meth3();
    ms.meth4();

    }
}
