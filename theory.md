    
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