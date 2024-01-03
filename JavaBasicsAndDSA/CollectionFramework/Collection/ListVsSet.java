package JavaBasicsAndDSA.CollectionFramework.Collection;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;
import java.util.Vector;


public class ListVsSet {
    
public static void main(String[] args) {


    //for LIST
    
        List li = new ArrayList();
        li.add(0,10);      //list works on indexed based data structures so we can provide index as well. if not the first item is always at first index.
        // li.add(2,"rojan");            // i can't add at index=2.it has to be index=1 
        li.add(1,"rojan");
        li.add('g'); 
        li.add(10);                      //accepts duplicate values.
        li.add(null);     
        li.add(null);               //accepts more than one null values   
        System.out.println(li);

        //to fetch the items one by one we use Iterator and ListIterator interface
        Iterator it = li.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }


          ListIterator lit = li.listIterator();
        while (lit.hasNext()) {
            System.out.println(lit.next());
        }  
 
        //ListIterator using previous methods
        ListIterator lt = li.listIterator();
        while (lt.hasPrevious()) {
            System.out.println(lt.previous());
        }




        //for SET

         Set se = new HashSet();
      //  se.add(0,10);                     //set doesn't works on indexed based data structures.
        se.add("rojan");
        se.add('g'); 
        se.add(10); 
       // se.add(10);                      //doesn't accept duplicate values.
        se.add(null);               //  accepts only one null value.   
        System.out.println(li);

        //to fetch the items one by one we use Iterator interface
        Iterator s = li.iterator();
        while (s.hasNext()) {
            System.out.println(s.next());
        }




        //Enumeration can be used only for legacy classes like vector and stack
        Vector vc = new Vector<>();
        vc.add(1);
        vc.add("string");

        Enumeration em = vc.elements();
        while (em.hasMoreElements()) {
            System.out.println(em.nextElement());
        }
    }

}


