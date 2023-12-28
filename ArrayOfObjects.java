public class ArrayOfObjects {

    public static void main(String[] args) {
        Student s1 = new Student();
        s1.rollno =1;
        s1.name ="ronaldo";
        s1.address="lisbon";

        Student s2 = new Student();
        s2.rollno =1;
        s2.name ="messi";
        s2.address="argentina";


        Student s3 = new Student();
        s3.rollno =1;
        s3.name ="neymar";
        s3.address="brazil";


        Student student[] = new Student[3];
        student[0] = s1;
        student[1] = s2;
        student[2] = s3;
        for(int i=0; i<student.length;i++ ){
            System.out.println(student[i].name + " " + student[i].rollno);
        }


        //Enhanced for loop
        // for(Student stud : student){
        //     System.out.println(stud.name + " :" + stud.rollno );     
        // }

 
    }
}

class Student{
    int rollno;
    String name;
    String address;
}

