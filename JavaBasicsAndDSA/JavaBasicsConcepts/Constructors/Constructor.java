package JavaBasicsAndDSA.JavaBasicsConcepts.Constructors;

class Student {

    private String name;
    private String address;

    public Student() {         //default constructor i.e already loaded in the heap memory.
        // name = "Rojan";    
        // address = "Nepal";

    }

    public Student(String name , String address){     //parameterized constructors
       this.name = name;
       this.address=address;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public void setName(String name) {
        this.name = name;

    }

    public void setAddress(String address) {
        this.address = address;
    }

}

public class Constructor {

    public static void main(String[] args) {
        Student obj = new Student();        
        Student obj1 = new Student("Messi","Arg");      //pass the value to the parameterized constructor                                                                      //everytime the object is instantiated the constructor is called
        System.out.println(obj1.getName() + " " + obj1.getAddress());
    }
}
