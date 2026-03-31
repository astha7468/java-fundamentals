package basics;

import java.util.Scanner;

public class arrays {
    public static void main(String[]args){
        // int[] x = {1, 2, 3, 4, 5};  
        Scanner sc = new Scanner(System.in);
        // System.out.println(x[4]);

//!-----------------MODIFYING AN ARRAY----------------
        // x[4]=234;
        // System.out.println(x[4]);


//!---------------INPUT AND OUPTUT OF AN ARRAY------------
        // for(int i=0; i<5; i++){        
        //     System.out.println(x[i]);
        //? can also do i<arr.length
        //? int n =arr.length;
        //?i<n;
        // }

//! ----------------can do with while loop also---------
       // int i =0;
      // while(i<=4){
     //     System.out.println(x[i]);
    //     i++;    
   // }

//!----------------PRINTING LENGTH OF AN ARRAY-------------
        // System.out.println(x.length);

//!-----------------DEFAULT VALUES IN AN ARRAY----------------
        // int[] arr = new int[5];
        // for(int i=0; i<arr.length; i++){
        //     System.out.println(arr[i]);
        // }
        //? 0 is the default value for int, 0.0 for double, false for boolean, null for String and other reference types
         
//!-----------------TAKING INOUT FROM USER---------------
        //? INPUT OF AN ARRAY
        // int[] arr = new int[5];
        // for(int i=0; i<arr.length; i++){
        //     arr[i] = sc.nextInt();
        // }

        //? PRINTING 
        // for(int i=0; i<arr.length; i++){
        //     System.out.println(arr[i]);
        // }

//!------------------PRINTING  NEGATIVE NUMEBR ONLY-------------
        // int n = sc.nextInt();
        // int[] arr = new int[n];
        // for(int i =0; i<arr.length; i++ ){
        //     arr[i] = sc.nextInt();

        // }
        // for(int i=0; i<arr.length; i++){
        //         if(arr[i]<0){
        //             System.out.println(arr[i]);
        //         }
        // }

}


}

