

abstract  class pen{
    abstract void write();
    abstract void refil();
}
class Fountainpen{
    void write(){
        System.out.println("Writing");

    }
    void refil(){
        System.out.println("Refil");
    }
    void changeNib(){
        System.out.println("Changing the nib");
    }
}
class Monkey{
    void jump(){
        System.out.println("Jumping");
    }
    void bite(){
        System.out.println("Bitting");
    }
    interface basicAnimal{
        void eat();
        void sleep();
    }
    class Human1 extends Monkey implements basicAnimal {
        void Speak(){
            System.out.println("Hello mr.");
        }
        @Override
        public void eat(){
            System.out.println("Eating");
        }
        @Override
        public void sleep(){
            System.out.println("Sleeping");
        }
    }

}

public class cwh_60 {
    public static void main(String[] args) {
 // quesstion 1st and 2nd
       Fountainpen fp = new Fountainpen();
       fp.changeNib();

       //question 3
       // Human1 hm = new Human1();

    }
}
