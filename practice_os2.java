

class Rectangle1{
   private int length;
  private int breath;

public int getLength(){
    return length;
}
    public void setLength(int l){
        length = l;
    }
    public int getBreath(){
    return breath;
    }
    public void setBreath(int b) {
        breath = b;
    }
    public int Area(){
    return length*breath;
    }
}


public class practice_os2 {
    public static void main(String[] args) {

        Rectangle1 re = new Rectangle1();
      //  re.length = 12;
      //  re.breath = 2; --> not run due to the private

        re.setLength(6);
        re.setBreath(4);
        System.out.println(re.Area());

    }
}
