 class Employee1 {
     int id;
     int salary;
     String name;
     public void printDetails(){
         System.out.println("My id is "+ id);
         System.out.println("and my name is "+ name);
     }
     public int getsalary(){
         return salary;
     }

 }
    public class cwh_38_ch9_custom {
    public static void main(String[] args) {
        System.out.println("This is our custom class");
        Employee1 harry = new Employee1();
        Employee1 john = new Employee1();


//Setting Attributes for harry

        harry.id = 12;
        harry.salary = 340000;
        harry.name = "code with harry";


//Setting attributes for jhon

        john.id = 25;
        john.salary = 120000;
        john.name = "john kumartripathi";



        // PRINTING THE ATTRIBUTES
        harry.printDetails();
        int salary = harry.getsalary();
        System.out.println(salary);

        john.printDetails();

        //  System.out.println(harry.id);
    //    System.out.println(harry.name);

    }
}