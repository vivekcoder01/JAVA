
class Mymainemployee{
 private  int id;
   private String name;
  public Mymainemployee(){    // constoructors;
     id = 45;
      name = "Vivek chaurasiya";
  }
   public Mymainemployee(String myName,int Myid ) {
       id = Myid;
       name = myName;
   }
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


public class cwh_42_ch9_construtors {
    public static void main(String[] args) {

    //    Mymainemployee ep = new Mymainemployee("code with herry" ,24);
        Mymainemployee ep = new Mymainemployee();
//  ep.setId(2);
// ep.setName("code with herry");
    System.out.println(ep.getId());
    System.out.println(ep.getName());

    }
}
