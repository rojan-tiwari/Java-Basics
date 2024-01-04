package Interface;

interface A {      
 
    int a=5;               //final and static


    void show();          //these are all public and abstract

    void ok();

}

interface C {
    void showWhat();
    
}

class B implements A, C {                  //this is multiple inheritance achieved by interfaces         

    public void show() {                     //need to define  all the methods of interfaces after implementing 
        System.out.println("show");
    }

    public void ok() {
        System.out.println("ok");
    }

    public void showWhat() {
        System.out.println("nothing");
    }
}

public class Interface {

    public static void main(String[] args) {
        A obj = new B();                            //can create the instance of interfae (A obj) but cant create the object.
        obj.show();

    }

}
