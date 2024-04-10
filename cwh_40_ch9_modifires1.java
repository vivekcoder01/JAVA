class Myemployee{
    private int id;
  private String name;
  public int getId(){
      return id;
  }
  public void setId(int i){
      id = i;
  }
  public String getName(){
      return name;
  }
  public void setName(String n){
      name = n;
  }
}
public class cwh_40_ch9_modifires1 {
    public static void main(String[] args) {
        Myemployee ganesh = new Myemployee();
    //    ganesh.id = 250;
    //    ganesh.name = "ganesh bhagat "; --> because of private add

        ganesh.setName("Ganesh bhagat");
        System.out.println(ganesh.getName());
        ganesh.setId(250);
        System.out.println(ganesh.getId());



    }
}
