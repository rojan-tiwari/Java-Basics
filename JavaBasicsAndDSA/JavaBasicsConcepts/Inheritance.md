**Inheritance**
               Process of inheriteting all the properties of parent class by a sub class is called inheritance.


**single and multilevel inheritance**
               calc--> AvdCalc  :single
               calc--> AvdCalc--->VeryAdvCalc  :Multilevel


**multiple inheritance**
               ```java
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
               ```