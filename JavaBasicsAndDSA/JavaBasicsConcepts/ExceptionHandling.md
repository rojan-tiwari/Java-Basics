**Exception**
                Exception are run-time error that disrupts the normal flow the normal flow of the program.
                1.Compiled-Time Exception: That occurs in the compile time.Ex-Sql exception , IO Exception
                2.Run-time Exception : that occurs in the run-time.
                Ex- Arithmetic Exception , Null Pointer Exception

 **Exception Handling**
                ### try..catch    <br>
                ```java
                 try{
                  //block of code that could throw  exception
                 }catch (Exception e){}    //catching the exception   <br>
                ``` 

                 ### finally      <br>
                 finally keyword is used to execute the statement whether the exception is handled or not.It can be try..catch...finally or try...finally   <br>


                 ### throw     <br>
                 The "throw" keyword is used to throw an exception.it can be used to throw our own created custom exception    <br>
            ```java
                 throw new ArithmeticException("exception occured);    
                 throw new MyOwnException("This is custom Exception");
            ```

                 ### throws 
                 The "throws" keyword is used to duck the exception.it is used in the signature method.    <br>

  **Exception Heirarchy**
                 object-->Throwable--->Error       <br>
                                   --->Exception--->Runtime Exception    <br>
                                              --->CompileTimeException    <br>
                 1.Arithmetic, ArrayIndexOutOfBound,NullPointer are all runtime exception and are called unchecked  exceprion.Compiler don't care.      <br>
                 2.SQL exception,IO Exception are all Compiletime exception and are called checked exception.Compiler asks forcly to handle such exception.     <br>