interface Mysmartphone{
    void snapchat();
    void call();
   default void recordvideo(){
       System.out.println("recording video");
   }
}
class Wifi {
    public void getnetwork() {
        System.out.println("network speed");
    }

    public String wifinetwork(String network) {
        System.out.println("Network");
        return network;
    }
}
class Mycellphone extends Wifi implements Mysmartphone{
    public void snapchat(){
        System.out.println("good feachers in snapchat");
    }
    public void call(){
        System.out.println("Riceved..." );
    }
//    public void recordvideo(){
//        System.out.println("Record 4k video");
//    }
}

public class practice_14 {
    public static void main(String[] args) {
        Mycellphone mc = new Mycellphone();
        mc.call();
        mc.snapchat();
        mc.getnetwork();
        mc.recordvideo();


    }
}
