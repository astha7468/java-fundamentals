package basics;

import java.util.Scanner;

public class patterns {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        //  int b = sc.nextInt();

//! --------- triangle star pattern----------
        // for(int i =1; i<=a; i++){
        //     for(int j =1; j<=i; j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();   
        // }

//! ------------ single line of stars--------
        // for(int i =1; i<=a; i++){
        //     for(int j =1; j<=i; j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();   
        // }
   
//! ---------when no of rows and columns are different----------
    // for(int i =1; i<=a; i++){
    //         for(int j =1; j<=b; j++){
    //             System.out.print("*");
    //         }
    //         System.out.println();   
    //     }   
   
//! ---------square star---------
    //   for(int i =1; i<=a; i++){
    //         for(int j =1; j<=a; j++){
    //             System.out.print("*");
    //         }
    //         System.out.println();   
    //     } 

//! ---------when u have to print numbers like 1234 in square pattern-------    
    // for(int i =1; i<=a; i++){
    //         for(int j =1; j<=a; j++){
    //             System.out.println(j);  it print simple 1 2 3 4
    //             System.out.print(j+  64 + " "); it print any number in  64 65 form
    //         }
    //         System.out.println();   
    //     } 

//!  ---------when you have to print numbers like 1111 in square pattern-------
        // for(int i =1; i<=a; i++){
        //     for(int j =1; j<=a; j++){
        //         System.out.print(i+  " ");
        //     }
        //     System.out.println();   
        // } 
     
//! print alphabet in square pattern we use ascii values by adding char
//          for(int i =1; i<=a; i++){
//             for(int j =1; j<=a; j++){
//                 System.out.print((char)(j+47)+  " ");
//             }
//             System.out.println();   
//          } 
// ? we can add any number in j to get desired output in square pattern. 
//? for printing  capital characters we add 64 to j and for printing numbers we add 48 to j. 
//?  we add 96 try to print small characters in square pattern by adding 96 to j.
//? these all are printing by using ascii values. 

//! number triangle pattern
// for(int i =1; i<=a; i++){
//     for(int j =1; j<=i; j++){
//          System.out.print(j + " ");//? it print 1 2 3 4 in triangle pattern by adding 48 to j.
//             }
//     System.out.println();   
//     }

//! alphabet triangle pattern
// for(int i =1; i<=a; i++){
//     for(int j =1; j<=i; j++){
//          System.out.print((char)(j+64) + " ");//? it print A B C D in triangle pattern by adding 64 to j.
//             }
//     System.out.println();
//     }

//! alphanumeric triangle pattern
// for(int i =1; i<=a; i++){
//     if(i%2!=0){
//         for(int j =1; j<=i; j++){
//         System.out.print((char)(j+64) + " ");
//     }
// }  
//     else{
//     for(int j=1; j<=i; j++){
//         System.out.print(j+ " ");
//     }
// }
//     System.out.println();
// }

//!flipped triangle pattern
// for (int i = 1; i<=a; i++){
//     for(int j =1; j<=a+1-i; j++){
//         System.out.print(" * ");
//     }
//     System.out.println();
// }

//! flipped triangle pattern  with numbers
// for(int i =1; i<=a; i++){
//     for (int j=1; j<=a+1-i; j++){
//         System.out.print(j+ " ");
//     }
//     System.out.println();
// }

//! flipped triangle pattern with alphabet
// for(int i=1; i<=a; i++){
//     for(int j=1; j<=a+1-i; j++){
//         System.out.print((char)(j+96)+ " ");
//     }
//     System.out.println();
// }

//! hollow rectangle pattern
// for(int i =1; i<=a; i++){
//             for(int j =1; j<=b; j++){
//                 if(i==1||i==a||j==1||j==b){
//                     System.out.print("*");
//                 }
//                 else{
//                     System.out.print(" ");
//    }
//             }
//             System.out.println();   
//         }
   
//!star pattern with spaces
// int mid = a/2+1;
// for(int i =1; i<=a; i++){
//             for(int j =1; j<=a; j++){
//                 if(i==mid||j==mid){
//                     System.out.print("*");
//                 }
//                 else{
//                     System.out.print(" ");
//    }
//             }
//             System.out.println();   
//         }

//! diagonal star pattern
// for(int i=0; i<=a;i++){
//     for(int j=0; j<=a; j++){
//         if(i==j||i+j==a-1){
//             System.out.print("*");
//         }
//         else{
//             System.out.print(" ");
//         }
//     }
//     System.out.println();
// }

  //!floyd triangle
//   int n=1;
//   for(int i =1; i<=a; i++){
//     for(int j =1; j<=i; j++){
//         System.out.print(n+ " ");
//         n++;
//     }
//     System.out.println();
//   }
  

}

}



