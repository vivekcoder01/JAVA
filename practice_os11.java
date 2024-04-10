
class Animal{
   public String cat;

    public  void Animal(String cat) {
        System.out.println("I am a constructor");
        this.cat = cat;
    }

    public String getCat() {
        return cat;
    }

    public void setCat(String cat) {
        System.out.println("King of forrest");
        this.cat = cat;
    }
}
class Dog extends Animal{
  public String dog;

    public String getDog() {
        return dog;
    }

    public void setDog(String dog) {
        System.out.println("Very fast runner");
        this.dog = dog;
    }
}


public class practice_os11 {
    public static void main(String[] args) {
        Animal A = new Animal();
        A.setCat("Tiger");
        System.out.println(A.getCat());
        Dog D = new Dog();
        D.setDog("Hourse");
        System.out.println(D.getDog());


    }
}
