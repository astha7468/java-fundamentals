package basics;
public class Array {
    public static void main(String[]args){
        //  int[] arr = {1, 2, 3, 4, 5};  
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


//!------------------PASSING ARRAY TO METHODS/FUNCTIONS---------------
        // int[] arr = {10,12,34,45,67};
        // System.out.println(arr[3]); //? line 1
        // change(arr);                //? line 2
        // System.out.println(arr[3]); //? line 4
        // }
        // //? PASS BY REFERENCE
        // public static void change(int[] arr){   //?line 3    
        //         arr[3]=100;
       // }


//!----------------SHALLOW COPY-------------
        //  int[] arr = {1,2,3,4};
        //  int[] x = arr;
        //  x[3]=9;
        //  System.out.println(arr[3]);

//!--------------DEEP COPY-------------
//        int []arr = {1,2,3,4};
//        int[] w = Arrays.copyOf(arr, arr.length);
//        w[2]=90;
//        System.out.println(w[2]);
//        System.out.println(arr[2]); 

//!----------------SORT OF ARRAY--------------
//         int[] arr={5,3,4,34,6};
//         print(arr);
//         Arrays.sort(arr);
//         print(arr);
// }  
// public static void print(int[] arr){
//         for(int i=0;i<arr.length;i++){
//                 System.out.println(arr[i]);
//         }
//         System.out.println();

//!-------------MULTIPLYING ODD INDEXED ELEMENTS BY 2 AND 10 TO EVEN INDEXED ELEMENTS----------------
        //    int[] arr = {2,3,4,67,89};
        //    for(int i =0; i<arr.length; i++){
        //         if(arr[i]% 2==0){
        //                 arr[i]*=10;
        //         }
        //         else{
        //                 arr[i]*=2;
        //         }
        //         }
        //         for(int i=0; i<arr.length; i++){
        //                 System.out.println(arr[i]);
        //         }

//!-----------------SEARCH IN ARRAY---------------
//        int[] arr = {23,34,56,67};
//        int target = 45;
//        boolean found = false;
//        for(int i=0; i<arr.length; i++){
//           if(arr[i]==target){
//                 found = true;
//                 break;
//          }
//        }
//        if(found){
//            System.out.println("yes");
//        }
//        else{
//            System.out.println("no");
//        }


//!----------------TWO SUM--------------
//        int[] arr ={1,1,3,4};
//        int target = 2;
//        boolean found = false;
//        for(int i=0; i<arr.length; i++){
//              for(int j=i+1; j<arr.length; j++){
//                 if(arr[i]+arr[j]==target){
//                         found=true;
//                         break;
//                   }
//              }
//        }
//        if(found){
//         System.out.println("yes");
//        }
//        else{
//         System.out.println("no");
//        }


//!-----------------SECOND MAXIMUM ELEMNET IN AN ARRAY------------
        // int[] arr = {23, 34, 56, 9};
        // int max = Integer.MIN_VALUE;
        // int smax = Integer.MIN_VALUE;
        // int thirdmax = Integer.MIN_VALUE;

        // for (int i = 0; i < arr.length; i++) {
        //     int num = arr[i];
        //     if (num > max) {
        //         thirdmax = smax;
        //         smax = max;
        //         max = num;
        //     } 
        //     else if (num > smax && num != max) {
        //         thirdmax = smax;
        //         smax = num;
        //     } 
        //     else if (num > thirdmax && num != smax && num != max) {
        //         thirdmax = num;
        //     }
        // }

        // System.out.println("Third maximum = " + thirdmax);
    }
}


       

    
