
class Employee4{
 private  int id;
   private String name;
   private int salary;
   public Employee4(){
       id = 455;
       name = "Employeee akash";
       salary = 30000;

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
   public int getSalary(){
       return salary;
   }
   public void setSalary(int s){
       salary = s;
   }
}


public class practice_os4 {
    public static void main(String[] args) {
        Employee4 e = new Employee4();
        System.out.println(e.getId());
        System.out.println(e.getName());
        System.out.println(e.getSalary());

    }
}
