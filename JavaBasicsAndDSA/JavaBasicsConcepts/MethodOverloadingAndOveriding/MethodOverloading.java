package JavaBasicsAndDSA.JavaBasicsConcepts.MethodOverloadingAndOveriding;


//method overloading conceept

 class Calculator {

    public int add(int n1 , int n2) {
       return n1 + n2;
    }

          public int add(int n1 , int n2 ,int n3) {
       return n1 + n2 + n3;
    }

       public double add(double n1 , int n2 ,int n3) {   //accpets even if the datatype of arguments are different                                                        
       return n1 + n2 + n3;
    }



}


public class MethodOverloading {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        int result = calc.add(4, 5 );
        int result1 = calc.add(4, 5 , 5);
        System.out.println(result);
        System.out.println(result1);
    }   
}
