package JavaBasicsAndDSA.JavaBasicsConcepts;


/**
 * switch
 */
public class Switch {

    public static void main (String arg[]){

        int n= 4;
        switch(n){
            case 1 :
            System.out.println("sunday");
             break;

             case 2 :
            System.out.println("sunday");
             break;

             case 3 :
            System.out.println("sunday");
             break;

             case 4 :
            System.out.println("sunday");
             break;

             default:
            System.out.println("enter a valid number");      

        }



        //it is supported from java 14 onwards

        // String day = "Sun";

        // switch (day) {
        //     case "sun" -> System.out.println("6am");
        //     case "mon" -> System.out.println("8am");
        //     default:
        //         System.out.println("10am");
        // }



        //another way

        //  String day = "Sun";
        //  String result = "";

        // switch (day) {
        //     case "sun" -> result="6am";
        //     case "mon" -> result="8am";
        //     default:
        //         result="10am";
        // }
        // system.out.print(result);



        //switch as an expression as well  also supported after java 14

    //     String day = "Sun";
    //      String result = "";

    //    result =  switch (day) {
    //         case "sun" : yield "6am";
    //         case "mon" : yield "8am";
    //         default:
    //             result="10am";
    //     };
    //     System.out.println(result);

    }
}