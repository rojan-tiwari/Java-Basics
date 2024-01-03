package JavaBasicsAndDSA.JavaBasicsConcepts.Array;
public interface Array {
    
public static void main(String[] args) {
    
   int num[] = {1,2,3};      //definig array with fixed values
   int num1[] = new int[4];    //definig array with unknow values
    num1[0]=1;
    num1[1]=1;
    num1[2]=1;
    num1[3]=1;

    for(int i=0;i<4;i++)
   System.out.println(num1[i]);
}

}
