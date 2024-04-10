interface Bicycle{
    void speedbreak(int decrement);
    void speedup(int increment);
//    default  void morespeed(){
//        System.out.println("more Speed");
//    }
}
interface Horon{
    void bowlohoronfast();
    void bowlohoronslow();
}
class Avoncycle implements Bicycle ,Horon{
    public void speedbreak(int decrement){
        System.out.println("Appliying break");
    }
    public void speedup(int increment){
        System.out.println("Appliying speedup");
    }
    public void bowlohoronfast(){
        System.out.println("na na na na re na re na re");
    }
    public void bowlohoronslow(){
        System.out.println("peee peep peeee");
    }
}


public class cwh_55 {
    public static void main(String[] args) {
    Avoncycle av = new Avoncycle();
    av.speedbreak(2);
    av.bowlohoronfast();
    av.bowlohoronslow();
 //   av.morespeed();


    }
}
