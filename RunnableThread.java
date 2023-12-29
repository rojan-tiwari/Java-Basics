
class Student implements Runnable {                 
    public void run() {                          
        for (int i = 1; i < 99; i++) {
            System.out.println("i am student");
        }

    }
}

class Teacher implements Runnable {

    public void run() {
        for (int i = 1; i < 99; i++) {
            System.out.println("i am teacher");
        }

    }
}




public class RunnableThread {

    public static void main(String[] args) {

        Student student = new Student();
        Teacher teacher = new Teacher();

        Thread t1 = new Thread(student);
        Thread t2 = new Thread(teacher);

        t1.start();
        t2.start();

    }
    
}
