public class MultidimensionalArray {

   public static void main(String[] args) {
    
   
    int nums[][] =  new int[3][4];   //3 arrays with 4 elements each basically  3 rows and 4 columns
      int nums1[][] =  new int[3][];   

    for(int i=0;i<3;i++){           //i for number of rows in a array
      
        for(int j=0;j<4;j++){

         nums[i][j] = (int) (Math.random()*10);    //just assining random values to arrays using MATH function
        }
    }

      for(int i=0;i<3;i++){
      
        for(int j=0;j<4;j++){
         System.out.print(nums[i][j] + " ");    //printing it 
        }
        System.out.println();
    }


     //enhance for loop
    for (int n[] : nums) {                 //n[]   now it doesnt get a single elements it gets the whole single array        
        for(int m : n){                    //retreiving single array from n and assigning in m    
            System.out.print(m + " ");
        }
        System.out.println();

    } 


   }    

}