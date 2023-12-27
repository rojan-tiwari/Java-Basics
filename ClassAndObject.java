
  class Calculator {

    public int add(int num1 , int num2){
        int addition = num1 + num2;
      return addition;
    }
}



public class ClassAndObject {
    public static void main(String[] args) {
    Calculator calc =  new Calculator();      //created a object of class calculator
    int result = calc.add(4,5);     //object used the method of the class calculator
    System.out.println(result);
    } 
}