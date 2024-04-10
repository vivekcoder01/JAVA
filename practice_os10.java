

class Rectangle4{
    int length;
    int breath;
    public Rectangle4(int l, int b){
        length = l;
        breath = b;
    }

    public int getBreath() {
        return breath;
    }

    public void setBreath(int breath) {
     this.breath = breath;
   }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
       this.length = length;
   }
}


public class practice_os10 {
    public static void main(String[] args) {
        Rectangle4 re = new Rectangle4(5,6);
        System.out.println(re.getLength());
        System.out.println(re.getBreath());
    }
}
