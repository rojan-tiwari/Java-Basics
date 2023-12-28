


class Student{            //every class in java extends OBJECT class.
  
    public Student(){
        super();
        System.out.println("in student");
    }

    public Student(String name){
        super();
        System.out.println("Student with name");

    }

}

class Teacher extends Student{

   public Teacher(){
    super();                             //this method is always there by default whenever a constructor is created.
    System.out.println("in teacher");
   }


    public Teacher(String name){
        this();                                  //this() calls first its own constructor (public Teacher())
    // super(name);                              //here the super method is parameterized so it calls the parameterized constructor of parent class "STUDENT"
    System.out.println("in teacher with name");
   }


}






public class ThisAndSuperMethod {

    public static void main(String[] args) {
        Teacher tc = new Teacher("rojan");

    }
    
}
