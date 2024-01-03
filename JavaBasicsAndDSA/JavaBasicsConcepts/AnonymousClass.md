**Anonymous Class**   <br>
                Those expression that can directly be used in body    <br>
              ```java
                psvm{
                   Student student = new Student() {            
                       public void study() {      
                        // ANONYMOUS CLASS: defined directly in the body 
                          System.out.println("study");
                      }
                   };
                   student.study();
                }
              ```