
class Phone{
    public void ramesh(){
        System.out.println("good morning");
    }
    public void on (){
        System.out.println("Turning on phone....");
    }
}
class Smartphone extends Phone{
    public void suresh(){
        System.out.println("Apka swagat hai");
    }
    public void on (){
        System.out.println("Turning on smartphone....");
    }
}


public class cwh_49 {
    public static void main(String[] args) {

//       Phone P = new Phone();     // allowed
//        Smartphone Sm = new Smartphone();   allowed
//       P.ramesh();


//Smartphone obj2 = new Phone();      // this is not allowed
        Phone obj = new Smartphone();        // yes it allowed
        obj.on();
        obj.ramesh();


    }
}
