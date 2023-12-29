
class Student extends Thread {                   //Should extend thread class
    public void run() {                          //should have run() method

        for (int i = 1; i < 99; i++) {
            System.out.println("i am student");
        }

    }
}

class Teacher extends Thread {

    public void run() {
        for (int i = 1; i < 99; i++) {
            System.out.println("i am teacher");
        }

    }
}

public class Threads {

    public static void main(String[] args) {

        Student student = new Student();
        Teacher teacher = new Teacher();

        student.start();                                 //should start() thread 
        teacher.start();

    }

}

// conclusion: both the thread runs parallely.
