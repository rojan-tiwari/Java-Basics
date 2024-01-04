package Stream;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamExample {

    public static void main(String[] args) {
        List<Integer> li = Arrays.asList(2,3,4,5,6,7,8);

        // Stream<Integer> st = li.stream();
        // Stream<Integer> fl = st.filter(n -> n%2==0);   //using filter for even numbers returns stream
        // Stream<Integer> ma = fl.map(n -> n*2);         //using map to double and again returns stream 
        // // Integer rd = ma.reduce(0,(c,e) -> c*e);     //reduce is the last method that doesnt return stream infact it returns integer
        // ma.forEach(n -> System.out.println(n));
        

        // OR, we can use stream in  a single statements

        Stream str = li.stream()
                     .filter(n-> n%2==0)
                     .map(n -> n*2);

                     str.forEach(n -> System.out.println(n));



    }
    
}
