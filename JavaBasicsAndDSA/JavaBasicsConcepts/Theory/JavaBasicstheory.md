    
                1.how java works
                javacode---> compiler----> bytecode----> JVM
                JVM = Java virtual Machine
                JRE (Java Runtime Environment) = JVM + LIBRARIES
                JDK(Java Development Kit) = JRE + JVM    
                
                
                2.variables
                To store values.First digit of variables cannot be numbers.
                Int num =3; 
                Int =datatype , num = variable , 3 = value

                3.datatypes
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


                4.Wrapper class
                Are those classes that wraps the primitive data types.
                Every primitive data types has its own class that extends object.
                 int num = 4
                 Interger n = new Integer(num);  //wrapping a int

                java is not 100% OOPL because it has primitive data types and why because, it is  faster and we use primitive data types mostly.
               

                5.literals
                Literals are just a constant value .
                String name = “Ronaldo” ;  
                Int num = 6;

                6.Type conversion and casting
                byte b = 127;
                Int a = 25;  
                b=a;  -> b = (byte) a;  type casting : explicit conversion i.e had to specify datatype (byte)   
                a=b;    (type conversion : implicit conversion i.e the range of byte falls into integer range)

                7.Assignment Operators
                num+=5 or num=num+5
                num++  :post-increment
                ++num  :pre-increment
                It's the same thing in a single statement but when fetching the value it's different.
                Int n =  6;
                Int result  = num++;        output=6  (it first assign the value then increments)
                Int result = ++num;        output =7 (it first increments the value then assign)

                8.Relational Operators
                >,<,<=.>=
                #Logical Operators
                And (&) , OR(|), NOT(!)
                                  &     |           !
                T         T       T      T         T->F
                T         F       F      T         F->T
                F         T       F      T          
                F         F       F      F          

                9.Conditional Statement
               If statements, if..else statements , if.elseif..else statements

                #Ternary Operators
                Shortcut for if..else
                Int result = a>b?10:20;


                10.when to use which loop?
                if we know the end like we need to print the same statement for 500 times the we use forloop  and if we dont know the end like if we have to print the each character of a book then we use whileLoop and doWhileloop is used whenever if we have execute a statement even if the condition is false then we use DOWHILE loop.


                11.class and object
                A class is a blueprint that explains the behavior and state of an object.
                An object is used to access all the properties, methods of the class.


                12.Method overloaing             
                Having the same method name but different arguments.
                Overloading even accepts different datatype of arguments.

                13.MethodOveriding
                Having the same method and also same arguments but different behavior or function.Like overiding 1 method from 3 methods of parent class.


                14.Stack and Heap memory
                Stack memory stores the value of local variables.
                Heap memory store the value of instance and object.

                15.Array
                If we have to store more than one data then we use array.
                int num = {1,2,3};
                int num[] = new int[5];

                16.Drawbacks of array
                1.it is fixed size once defined .
                2.Doesnt accept heterogeneous data types. It has to be of same data types.

                17.String
                Sequence of the characters.
                String name = "Ronaldo"

                18.Mutable vs Immutable String
                String constant Pool is basically a storage that contains all the strings defined.
                String s1 = "airpod" //it is stored in heap memory like ((address)104-->"airpod") and s1-->104 (address) is stored in stack memory.
                s1 = s1 + "earphone"  /what happens here is? it created a new object in heap memory with the s1 address i.e 104 and previous "airpod" is excluded and is ready for garbabge collection.
                By default Strings are immutable that cannot be changed once defined.
                But we "StringBuffer" and "StringBuilder" which are mutable i.e can be changed.


                19.StringBuffer vs StringBuilder
                StringBuffer is mutable and we can append more strings even after it is assigned.
                StringBuffer str = new StringBuffer("iphone");
                str.append(" myphone");     //outpu= iphone myphone
                str.capacity();            //output = 22   because it adds extra 16 space in memory. 
                The main diff between StringBuffer and StringBuilder is that StringBuffer is THREADSAFE(only one thread at a time).


                20.static variable
                Are those varaibles which are not object specific. 
                once a variable is declared static it accessed by all the objects.

                21.Encapsulation
                The process of binding or hiding  the data so that it cant be accssed from other classes directly.

                22.Polymorphism
                Any object or reference that has more than one forms or executes more than one behavior.
                Compiletime Polymorphism :This is achieved by method overloading.
                Runtime Polymorphism: This is achieved by method overriding. 

                
                23.Dynamic Method Disptach
                It is a process in which a function call to the overridden method is resolved at Runtime. This type of polymorphism is achieved by Method Overriding 

                
                24.Constructos
                1.Constructor is called whenver an instance of object is created.
                2.Constructor doesn't have return type.
                3.Constructor name should be class name.
              

               25.this and super keyword 
               Every constructor has a super(); method by default which executes the constructor of  parent class.
               This();  is used to execute the default constructor of same class.


               26.Naming convention
               class - Capital letter starts
               Variable and method - small letters
               constants - All CAPITAL
               Combining words = camelCasing i.e showMe();


               27.Inheritance
               Process of inheriteting all the properties of parent class by a sub class is called inheritance.


               28.single and multilevel inheritance
               calc--> AvdCalc  :single
               calc--> AvdCalc--->VeryAdvCalc  :Multilevel


               29.multiple inheritance
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


               30.Access Modifier
               PUBLIC : They can be accessed from anywhere so most of the methods are public.
               PRIVATE : They can be used in the same class only.
               DEFAULT : They can be accessed in the same package.
               PROTECTED : They can be accessed inside the same package but can also be accessed  outside the package only in one condition the class has to be sub-class or inherting class or child class.


               31.Final Keyword
               FINAL VARAIBLE : Means cant be changed once assigned or to make a varaible constant.
               FINAL CLASS : Means can't be extend or inherited or to stop the inheritance.
               FINAL METHOD : Means can't be overridden or to stop method overriding.


               32.Abstract keyword
               1.Abstract Class can have both  the normal methods and abstract methods but abstract methods can only be defined inside abstract class.
               2.Abstract methods are used to just declare .  i.e abstract class void show();  //declaring
               2.Those class that inherits the abstract class should define the abstract methods.
                public void show(){      //defining
                }


                33.Inner class
                Class inside class is a inner class.we can make the object of the inner class by making the object of outer class.
                class A{
                  public void show(){}

                  class B{                 //inner class
                    public void ok(){}
                  }
                }

                psvm{
                  A obj = new A();    //creating object of outerclass
                  A.B obj1 = obj.new B(); //creating object of        innerclass by the help of outer class object    
                }


                34.Interface
                when we have to use all the methods that are abstract only then we can use interface. so by default all the methods inside interface are public and abstract and all the varaibles inside interface are final and static.
                interface A{
                  //all abstract methods.
                }  

                35.Types of interface

                a.Normal Interface
                it can have more than one methods.

                b.Functional Interface
                Its a interface that has only one method.
                @FuntionalInterface

                c.Marker Interface
                Dont have any methods i.e blank


                36.Enum
                Enums are class in java which is a group of constants.
                enum student{
                   Running,
                   Studying,
                   Helping;
                } 


                37.Anonymous Class
                Those expression that can directly be used in body
                psvm{
                   Student student = new Student() {            
                       public void study() {      
                        // ANONYMOUS CLASS: defined directly in the body 
                          System.out.println("study");
                      }
                   };
                   student.study();
                }


                38.Lambda Expression (->)
                1.Those expression  which takes parameters and returns some value.
                2.Can only be used with the functional interface.

                39.Exception
                Exception are run-time error that disrupts the normal flow the normal flow of the program.
                1.Compiled-Time Exception: That occurs in the compile time.Ex-Sql exception , IO Exception
                2.Run-time Exception : that occurs in the run-time.
                Ex- Arithmetic Exception , Null Pointer Exception

                40.Exception Handling
                1.try..catch 
                 try{
                  //block of code that could throw  exception
                 }catch (Exception e){}    //catching the exception 

                 2.finally
                 finally keyword is used to execute the statement whether the exception is handled or not.It can be try..catch...finally or try...finally


                 3.throw
                 The "throw" keyword is used to throw an exception.it can be used to throw our own created custom exception
                 throw new ArithmeticException("exception occured);
                 throw new MyOwnException("This is custom Exception");

                 4.throws 
                 The "throws" keyword is used to duck the exception.it is used in the signature method.


                 41.Exception Heirarchy
                 object-->Throwable--->Error    
                                   --->Exception--->Runtime Exception
                                              --->CompileTimeException
                 1.Arithmetic, ArrayIndexOutOfBound,NullPointer are all runtime exception and are called unchecked exceprion.Compiler don't care.
                 2.SQL exception,IO Exception are all Compiletime exception and are called checked exception.Compiler asks forcly to handle such exception.


                 42.Threads
                 Threads are the lightweight processes available.A multithreaded program contains two or more part that can run concurrently.Each part of such programs are called threads.
                 for ex- While playing PUBG .one player is firing,another player is driving, another is throwing a granade.so these are all threads working concurrently which is also called multithreading.


                 43.Stream Api
                 from java 8 , Stream are basically used to fetch data from collections. Can only be used once.Stream has different functions filter(Predicate),map(Function),reduce etc.It can be used for sorting i.e sort();

                 44.Var
                 After java 10, Var is introduced which can only be used in local varaibles. Var needs to be initialized.
                 class student{
          
                  var int age =10;        //wont work here because it  is instance varaible
                                           
                ` psvm{
                    
                       int a=6;
                       var b= 5;         //by default it knows that it is integer type.
                                          
     
                 }

                 }
                                              
                                                

                 

              






                 

                                        










            



              
                





                