package MethodOverloadingAndOveriding;

class Student{
    
    public int add(int m , int n){
        return m+n;
    }

    public int sub(int m , int n){
        return m-n;

    }
 
}

class Teacher extends Student{
 
    public int add(int m , int n){    //this method is overiding the parent class method.
        return m+n+1;                 //same method name , parameters but should have different functions otherwise why would we need to overide it.
    }
}

 



public class MethodOveriding {   

    public static void main(String[] args) {
        

        Teacher teacher =  new Teacher();
        int output = teacher.add(5,5);
        System.out.println(output);
    }

}
