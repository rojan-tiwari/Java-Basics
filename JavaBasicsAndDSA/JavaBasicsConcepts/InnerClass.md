**Inner class**
                Class inside class is a inner class.we can make the object of the inner class by making the object of outer class.   <br>
             ```java
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
             ```