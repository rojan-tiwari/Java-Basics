package ExceptionHandling;




class Student extends Exception{
    public void  searchClassName() throws ClassNotFoundException{           //This method is called by main method so it ducks the exception using "THROWS" which will be ultimately handled by main method
        Class.forName("calc");     //it throws an exception  because i dont have a class called calc.
    }
}


public class ExceptionThrows {

    public static void main(String[] args) {
        
        Student student = new Student();
        try{                                         //now main method has to handle the exception using try..catch
            student.searchClassName(); 

        }catch(ClassNotFoundException e){
            System.out.println("this class can't be found");
        }
                         
    }
    
}
