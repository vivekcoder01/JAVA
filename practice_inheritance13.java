
class Rectangle2{

    int length;
    int breath;

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getBreath() {
        return breath;
    }

    public void setBreath(int breath) {
        this.breath = breath;
    }

//    Rectangle2() {
//        System.out.println("I am c constructor");
//        this.length = length;
//        this.breath = breath;
//    }

    public Rectangle2(int length,int breath) {
        System.out.println("I am a ractungular constructor");
     this.length= length;
        this.breath= breath;
    }

    public int area(){
        return length*breath;
    }
}
class Cuboid extends Rectangle2{
    int height;

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public Cuboid(int length,int breath,int height) {
       super(length, breath);
        System.out.println("I am a cuboidal constructor");

       this.height = height;
    }

    public int  surfaceareaofcuboid(){
        return 2*(length*breath + breath*height + height*length);
    }
}


public class practice_inheritance13 {
    public static void main(String[] args) {
      //  Rectangle2 re = new Rectangle2(2,5);
        Cuboid cu = new Cuboid(2,3,4);
        System.out.println(cu.surfaceareaofcuboid());
//        cu.setLength(2);
//        cu.setBreath(3);
//        cu.setHeight(4);
//        System.out.println();



    }
}
