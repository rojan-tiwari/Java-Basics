**String**
                Sequence of the characters.    <br>
                String name = "Ronaldo"    <br>

**Mutable vs Immutable String**
                String constant Pool is basically a storage that contains all the strings defined.   <br>
                String s1 = "airpod" //it is stored in heap memory like ((address)104-->"airpod") and s1-->104 (address) is stored in stack memory.   <br>
                s1 = s1 + "earphone"  /what happens here is? it created a new object in heap memory with the s1   address i.e 104 and previous "airpod" is excluded and is ready for garbabge collection.  <br>
                By default Strings are immutable that cannot be changed once defined.   <br>
                But we "StringBuffer" and "StringBuilder" which are mutable i.e can be changed.    <br>


**StringBuffer vs StringBuilder**
                StringBuffer is mutable and we can append more strings even after it is assigned.   <br>
                StringBuffer str = new StringBuffer("iphone");      <br>
                str.append(" myphone");     //outpu= iphone myphone     <br>
                str.capacity();            //output = 22   because it adds extra 16 space in memory.      <br>
                The main diff between StringBuffer and StringBuilder is that StringBuffer is THREADSAFE(only one thread at a time).    <br> 