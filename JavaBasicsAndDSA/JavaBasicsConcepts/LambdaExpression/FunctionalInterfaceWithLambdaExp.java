package LambdaExpression;

@FunctionalInterface // can have only one method
interface Student {
    // void study(int i);
   
    int add(int i,int j );
}

// class Teacher implements Student {     // Instead of writing the class that extends interface we can use anonymous class used below.

//     public void study() {
//         System.out.println("study");            
//     }

// }

public class FunctionalInterfaceWithLambdaExp {

    public static void main(String[] args) {

        // Student student = new Student() {            
        //     public void study() {                      //ANONYMOUS CLASS: defined directly in the body 
        //         System.out.println("study");
        //     }
        // };
        // student.study();




        //   Student student = () -> {                       //LAMBDA EXPRESSIONS without parameters
        //         System.out.println("study");     //for single statement we dont 
        //  };
        // student.study();

        //  Student student = (i) -> System.out.println("study" + " "+ i);             //LAMBDA EXPRESSIONS with parameters ,for single statement we dont              
        //  student.study(5);


          Student student = (i,j) -> i + j;             //LAMBDA EXPRESSIONS with return.              
          student.add(5,6);

    }

}
