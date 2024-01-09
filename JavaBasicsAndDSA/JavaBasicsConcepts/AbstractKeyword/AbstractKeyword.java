package AbstractKeyword;


abstract class Student{                 //abstract class can have both normal and abstract methods

    public abstract void teach();           //abstract method always declared inside abstract class.

    public void play(){
        System.out.println("play");
    }
}



class Teacher extends Student {              //if another class extends abstract class it needs to implement or define the abstract method from parent class.

    public void teach() {
        System.out.println("teacher");
    }
     
}



public class AbstractKeyword {
    public static void main(String[] args) {
        
    }
    
}
