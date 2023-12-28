    
                #how java works
                  javacode---> compiler----> bytecode----> JVM
                  JVM = Java virtual Machine
                  JRE (Java Runtime Environment) = JVM + LIBRARIES
                  JDK(Java Development Kit) = JRE + JVM    
                
                
                #variables
                To store values.First digit of variables cannot be numbers.
                Int num =3; 
                Int =datatype , num = variable , 3 = value

                #datatypes
                Primitive data types (integers , float , character,boolean)
                Integers ( byte , short , int , long)
                Int - 4 bytes
                Long - 8 bytes (long L =23123L)
                Short - 2 bytes
                Byte - 1 byte
                Float (double , float)
                Float - 4 bytes (float num =5.6f)
                Double - 8 bytes (default)
                Character - 2 bytes (char c = ‘k’)  (it can be performed as a integer)
                Boolean  -  true or false


                #Wrapper class
                Are those classes that wraps the primitive data types.
                Every primitive data types has its own class that extends object.
                 int num = 4
                 Interger n = new Integer(num);  //wrapping a int

                java is not 100% OOPL because it has primitive data types and why because, it is  faster and we use primitive data types mostly.
               
                


                #literals
                Literals are just a constant value .
                String name = “Ronaldo” ;  
                Int num = 6;

                #Type conversion and casting
                byte b = 127;
                Int a = 25;  
                b=a;  -> b = (byte) a;  type casting : explicit conversion i.e had to specify datatype (byte)   
                a=b;    (type conversion : implicit conversion i.e the range of byte falls into integer range)

                #Assignment Operators
                num+=5 or num=num+5
                num++  :post-increment
                ++num  :pre-increment
                It's the same thing in a single statement but when fetching the value it's different.
                Int n =  6;
                Int result  = num++;        output=6  (it first assign the value then increments)
                Int result = ++num;        output =7 (it first increments the value then assign)

                #Relational Operators
                >,<,<=.>=
                #Logical Operators
                And (&) , OR(|), NOT(!)
                                  &     |           !
                T         T       T      T         T->F
                T         F       F      T         F->T
                F         T       F      T          
                F         F       F      F          

                #Conditional Statement
               If statements, if..else statements , if.elseif..else statements

                #Ternary Operators
                Shortcut for if..else
                Int result = a>b?10:20;


                #when to use which loop?
                if we know the end like we need to print the same statement for 500 times the we use forloop  and if we dont know the end like if we have to print the each character of a book then we use whileLoop and doWhileloop is used whenever if we have execute a statement even if the condition is false then we use DOWHILE loop.


                #class and object
                A class is a blueprint that explains the behavior and state of an object.
                An object is used to access all the properties, methods of the class.


                 #Method overloaing             
                Having the same method name but different arguments.
                Overloading even accepts different datatype of arguments.

                #MethodOveriding
                Having the same method and also same arguments but different behavior or function.Like overiding 1 method from 3 methods of parent class.




                #Stack and Heap memory
                Stack memory stores the value of local variables.
                Heap memory store the value of instance and object.

                #Array
                If we have to store more than one data then we use array.
                int num = {1,2,3};
                int num[] = new int[5];

                #Drawbacks of array
                1.it is fixed size once defined .
                2.Doesnt accept heterogeneous data types. It has to be of same data types.

                #String
                Sequence of the characters.
                String name = "Ronaldo"

                #Mutable vs Immutable String
                String constant Pool is basically a storage that contains all the strings defined.
                String s1 = "airpod" //it is stored in heap memory like ((address)104-->"airpod") and s1-->104 (address) is stored in stack memory.
                s1 = s1 + "earphone"  /what happens here is? it created a new object in heap memory with the s1 address i.e 104 and previous "airpod" is excluded and is ready for garbabge collection.
                By default Strings are immutable that cannot be changed once defined.
                But we "StringBuffer" and "StringBuilder" which are mutable i.e can be changed.


                #StringBuffer vs StringBuilder
                StringBuffer is mutable and we can append more strings even after it is assigned.
                StringBuffer str = new StringBuffer("iphone");
                str.append(" myphone");     //outpu= iphone myphone
                str.capacity();            //output = 22   because it adds extra 16 space in memory. 
                The main diff between StringBuffer and StringBuilder is that StringBuffer is THREADSAFE.


                #static variable
                Are those varaibles which are not object specific. 
                once a variable is declared static it accessed by all the objects.



                #Encapsulation
                The process of binding or hiding  the data so that it cant be accssed from other classes directly.


                #Polymorphism
                Any object or reference that has more than one forms or executes more than one behavior.
                Compiletime Polymorphism :This is achieved by method overloading.
                Runtime Polymorphism: This is achieved by method overriding. 

                
                #Dynamic Method Disptach
                It is a process in which a function call to the overridden method is resolved at Runtime. This type of polymorphism is achieved by Method Overriding 

                


                #Constructos
                1.Constructor is called whenver an instance of object is created.
                2.Constructor doesn't have return type.
                3.Constructor name should be class name.
              

               #this and super keyword 
               Every constructor has a super(); method by default which executes the constructor of  parent class.
               This();  is used to execute the default constructor of same class.



               #Naming convention
               class - Capital letter starts
               Variable and method - small letters
               constants - All CAPITAL
               Combining words = camelCasing i.e showMe();


               #Inheritance
               Process of inheriteting all the properties of parent class by a sub class is called inheritance.


               #single and multilevel inheritance
               calc--> AvdCalc  :single
               calc--> AvdCalc--->VeryAdvCalc  :Multilevel


               #multiple inheritance
               class A{
                void run();
               }

               class B{
                void run();
               }

               class C extends A,B{
                psvm{
                  obj.run(); ?????   which parent method to call . So java doesnt support multiple inheritance.
                }

               }



               #Access Modifier
               PUBLIC : They can be accessed from anywhere so most of the methods are public.
               PRIVATE : They can be used in the same class only.
               DEFAULT : They can be accessed in the same package.
               PROTECTED : They can be accessed inside the same package but can also be accessed  outside the package only in one condition the class has to be sub-class or inherting class or child class.


               #Final Keyword
               FINAL VARAIBLE : Means cant be changed once assigned or to make a varaible constant.
               FINAL CLASS : Means can't be extend or inherited or to stop the inheritance.
               FINAL METHOD : Means can't be overridden or to stop method overriding.










            



              
                





                