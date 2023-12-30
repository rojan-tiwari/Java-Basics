import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ForEach {
   
    public static void main(String[] args) {
        

        List<Integer> li = Arrays.asList(2,3,4,5,6,7,8);
    
        // Consumer co = new Consumer<Integer>() {          //for for each we need to have consumer object.Consumer has accept method where we define all the logics.
        //                                              //Basically what consumer does is fetches the value from collections.

        //     @Override
        //     public void accept(Integer t) {

        //         System.out.println(t);
        //       //all the logics
                
        //     }
            
        // };

        // li.forEach(co);



        //OR WE CAN USE LAMBDA EXP BECAUSE CONSUMER IS A FUNCTIONAL INTERFACE


        //    Consumer co = t ->  System.out.println(t);
        // li.forEach(co);


        //OR,

        li.forEach(t ->  System.out.println(t));

    }
    
}
