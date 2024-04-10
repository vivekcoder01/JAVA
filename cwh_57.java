
interface MyCamera1{
    void takeselfi();
    void recordvideo();
//    private void greet(){        //   ---> THIS METHOD ARE NOT DIRECTLY USED
//        System.out.println("good morning");
//    }
   default void record4kvideo(){
     //  greet();
        System.out.println("Record 4k video by Mycamera1");
    }
}
interface Wifi1{
    String [] getNetwork();
    void ConnectToNetwork(String Network);
}
class Mycellphone1{
    void callNumber(int phonenumber){
        System.out.println("Calling" + phonenumber);
    }
    void Pickcall(){
        System.out.println("Connecting..");
    }
}
class Mysmartphone1 extends Mycellphone1 implements MyCamera1,Wifi1{
    public void takeselfi(){
        System.out.println("Taking selfi");

    }
    public void recordvideo(){
        System.out.println("Taking snap");
    }
    public String[] getNetwork(){
        System.out.println("Getting list of network");
        String [] Networklist = {"Riya5g","mangri4g","aayushi5g","anjali6g "};
        return Networklist;
    }
    public void ConnectToNetwork(String Network){
        System.out.println("Connecting to"+ Network);
    }
//    public void record4kvideo(){
//        System.out.println("Rccord 4kvideo by snap");
//    }
}



public class cwh_57 {
    public static void main(String[] args) {
        Mysmartphone1 ms = new Mysmartphone1();
        String [] ar = ms.getNetwork();
        for ( String item : ar)
        {
            System.out.println(item);
        }
        ms.record4kvideo();
    }
}
