package JavaBasicsAndDSA.JavaBasicsConcepts.Enum;

enum Student { // enum is a class
    Rojan(90), // these are objects
    alekh,
    pawal(92);

    private int marks;

    private Student(int marks) { // parameterized constructor for marks
        this.marks = marks;
    }

    private Student() { // default constructor for alekh as it doesnt have parameters

    }

    public int getMarks() { // getter and setter to print the value of marks
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }

}

public class Enum {

    public static void main(String[] args) {

        for (Student s : Student.values()) {
            System.out.println(s + " " + s.getMarks());
        }

    }
}
