package ExceptionHandling;

class RojanException extends Exception{           //custom exception : here i hacve to pass the message to the parent class(EXCEPTION) to show 
                                                  //my custom message (The value is zero) 
    public RojanException(String message){
         super(message);
    }
}



public class TryCatch {

    public static void main(String[] args) {

        int a = 2;
        int b = 0 ;
        int arr[] = new int[4]; 

        try {                                //try with multiple catch statements
             b =2 / a;
             if(b==0){
                throw new ArithmeticException("The value is zero");      //throw exception to manually throw the exception(custom exception).
             }

             if(b==1){
                throw  new RojanException("the value is 1");
             }
             System.out.println(arr[5]);
        } catch (ArithmeticException e) {
            e.printStackTrace();
        }
        catch (ArrayIndexOutOfBoundsException e){
            e.printStackTrace();
        }
        catch (Exception e){
          e.printStackTrace();
        }

        System.out.println(b);

        System.out.println("hello");

    }

}
