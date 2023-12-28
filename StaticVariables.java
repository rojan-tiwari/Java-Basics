


class Students{
    int rollno;
    String name;
    static String principle;            //using static varaible


    static{
        principle = "john";     //or we can write the static varaibles in the static block and it is loaded only once.whenever 
                                 //a object is created constructor is called and class loader memory loads class with static block first.
    }


    public void studentDetails(){
        System.out.println(name + ":" + rollno + ":" + principle);
    }

    public static void studentDetails1(Students student1){
        System.out.println(student1.name + ":" + student1.rollno + ":" + student1.principle);  //it will throw error if i dont pass which object(stud1 or stud2) value to print.
                                                                                              //it doesnt accept nonstatic varaibles in static method until we pass the object.
    }


}



public class StaticVariables {

    public static void main(String[] args) {

        Students stud1 = new Students();
        stud1.rollno = 1;
        stud1.name = "Neymar";
        stud1.principle="madan";
        // Students.principle="madan";  // we can use className for static varaibles as well.
     

        Students stud2 = new Students();
        stud2.rollno = 2;
        stud2.name = "Hazard";
        // stud1.principle="madan";    //priciple is same 
        stud2.principle="john";        //but if i change the principle of stud2 then principle of stud1 is changed to "john" as well after defining the static varaible.

        stud1.studentDetails();
        stud2.studentDetails();

        // Students.studentDetails();   // i cant call this method using class name because it is not static 

        Students.studentDetails1(stud1);    // but i cant call this method using class name because it is  static  method.
                                       


        
    }
}