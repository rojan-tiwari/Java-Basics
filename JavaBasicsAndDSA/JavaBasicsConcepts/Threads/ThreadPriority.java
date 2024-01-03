package JavaBasicsAndDSA.JavaBasicsConcepts.Threads;



class Student extends Thread {                   
    public void run() {                          

        for (int i = 1; i < 99; i++) {
            System.out.println("i am student");
            try { 
                Thread.sleep(7);                  //thread sleep
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
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

public class ThreadPriority {
    

    public static void main(String[] args) {

        Student student = new Student();
        Teacher teacher = new Teacher();
        
        student.setPriority(6);             //thread priority ranges from 1-10
        teacher.setPriority(Thread.MAX_PRIORITY);        //10

        student.start();                               
        teacher.start();

    }



}
