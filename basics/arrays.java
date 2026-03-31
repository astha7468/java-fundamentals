package basics;

public class arrays {
    public static void main(String[]args){
         int[] arr = {1, 2, 3, 4, 5};  
        // Scanner sc = new Scanner(System.in);
        // System.out.println(arr[4]);

//!-----------------MODIFYING AN ARRAY----------------
        // arr[4]=234;
        // System.out.println(arr[4]);


//!---------------INPUT AND OUPTUT OF AN ARRAY------------
        // for(int i=0; i<5; i++){        
        //     System.out.println(arr[i]);
        //? can also do i<arr.length
        //? int n =arr.length;
        //?i<n;
        // }

//! ----------------can do with while loop also---------
       // int i =0;
      // while(i<=4){
     //     System.out.println(arr[i]);
    //     i++;    
   // }

//!----------------PRINTING LENGTH OF AN ARRAY-------------
        // System.out.println(x=arr.length);

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


//!------------------ADDING ELEMENT OF AN ARRAY--------------  
        // int sum = 0;
        // int n = sc.nextInt();      
        // int[] arr = new int[n];
        // for(int i=0; i<arr.length; i++){
        //     arr[i] = sc.nextInt();
        // }
       //? PRINTING 
        // for(int i=0; i<arr.length; i++){
        //     System.out.println((arr[i]));
        //     sum += arr[i];
        // }
        // System.out.println("Sum: " + sum);
    
//!------------------PRODUCT OF ELEMENTS IN AN ARRAY---------------
        // int product = 1;
        // int n = sc.nextInt();      
        // int[] arr = new int[n];
        // for(int i=0; i<arr.length; i++){
        //     arr[i] = sc.nextInt();
        // }
        // for(int i=0; i<arr.length; i++){
        //     System.out.println((arr[i]));
        //     product*= arr[i];
        // }
        // System.out.println("product: " + product);
        
//!------------------DIVISON OF ELEMENTS IN AN ARRAY---------------
//         int division =1;
//        for(int i=0; i<arr.length; i++){
//         division /= arr[i];
//  }
//         System.out.println("division: " + division);

//!-----------------MAXIMUM ELEMENT IN AN ARRAY---------------
        //        int max = arr[0];
        //        for(int i =0; i<arr.length; i++){
        //           if(arr[i]>max){
        //                 max=arr[i];
        //           }
        //        }
        //        System.out.println("Maximum element: " + max);
        

//!-----------------MINIMUM ELEMENT IN AN ARRAY---------------
        //        int min = arr[0];
        //        for(int i =0; i<arr.length; i++){
        //           if(arr[i]<min){
        //                 min=arr[i];
        //           }
        //        }
        //        System.out.println("Minimum element: " + min);
}

}