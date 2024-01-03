package JavaBasicsAndDSA.JavaBasicsConcepts.Encapsulation;

 class Student {

    private String name;         //making data private  (Encapsulation)
    private String address;       //these are instance varaibles

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public void setName(String name){      //these are local varaibles
        this.name = name;                  //reason why we use this keyword is that the local varaibles and instance varaibles are same ("name" and "address") and local varaible always shadows the instance varaible .
                                           //to make sure that these are instance varaible we this keyword.
    }


     public void setAddress(String address){
        this.address = address;
    }

}

public class Encapsulation {

    public static void main(String[] args) {
        Student obj = new Student();
        obj.setName("Rojan");        //setting data only through getters
        obj.setAddress("Nepal");
    
        System.out.println(obj.getName() + " " + obj.getAddress());   //getting data only through setter

    }
}



