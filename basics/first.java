package basics;
import java.util.Scanner;
public class first {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

// ------basic print statement----------------
        // System.out.println("Hello");
        // System.out.println("astha");
        // System.out.println("ayush");
        // System.out.println("PRACHI\n and  kajal");

// ---------variables------------
        // int a =10;
        // System.out.println(a);
        // int b;
        // b=20;
        // System.out.println(b);
        // Scanner sc= new Scanner(System.in);
        // System.out.println("enter a number");
        // int a = sc.nextInt();
        // System.out.println("the square of the number is");

 // ---------sum of three numbers----------------
         // System.out.println(a*a);
        // System.out.println("enter first number");
        // int a = sc.nextInt();
        // System.out.println("enter second number");
        // int b = sc.nextInt();
        // System.out.println("enter third number");
        // int c = sc.nextInt();
        // System.out.println("the sum of three number is " + (a+b+c));

// ---------- taking string as input-----------------
        // System.out.println("enter your name");
        // String  name = sc.nextLine();
        // System.out.println("enter you school name");
        // String school = sc.nextLine();

// ----------printing ASCII value of a character-----------------
        // char ch = 'A';
        // int x = ch;
        // System.out.println(x);

// ----------conditional statements-------
//  Scanner sc = new Scanner(System.in);
       //   System.out.println("enter first number");
//         int num = sc.nextInt();
//         if(num%2==0){
//                 System.out.println("this number is even number");
//         }else{
//                 System.out.println("this number is odd number");
//         }
// }
  
//   System.out.println("enter first number");
//         int num = sc.nextInt();
//         if(num%5==0){
//                 System.out.println("this number is divisible by 5");
//         }else{
//                 System.out.println("this number is not divisible by 5");

// --------nested if else statements----------------
//  int x= sc.nextInt();
        //  if(x%5==0 && x%3==0){
        //     System.out.println("divisible by 5 and 3");
        // }else if(x%3==0){
        //     System.out.println("divisible by 3");
        // }
        // else if(x%5==0 ){
        //     System.out.println("divisible by 5");
        //  }
        //  else {
        //     System.out.println("not divisible by 5 or 3");
        // }

// --------------GREATEST OF THREE NUMBERS---------------
        // int b = sc.nextInt();
        // if(b<69){
        //     System.out.println("b is smaller than 69");
        // }else{
        //     System.out.println("b is greater than 69");
        // }
        // if(b%5==0 || b%3==0){
        //     System.out.println("divisible by 5 or 3");
        // }else {
        //     System.out.println("not divisible by 5 or 3");
        // } 
        
// --------perimeter and area of rectangle-------
 // int l = sc.nextInt();
    // int b = sc.nextInt();
    // int area = l*b;
    //System.out.println("Area of rectangle is: " + area);
    // int perimeter=2*(l+b);
    //System.out.println("perimeter of rectangle is: " + perimeter);
    // if(area>perimeter){
    //     System.out.println("area is greater than perimeter");
    // }else{
    //     System.out.println("perimeter is greater than area");
    // } 

// -------LOOPS----------
// for(int i =7; i<=12; i++){
//     System.out.println(i);
// }

// -------PRINTING EVEN NUMBERS------
// int n = sc.nextInt();
// for (int i = 1; i<=100; i++){
//     if(i%2==0){
//         System.out.println(i);    
//        }

// --------number divisible by 3-------

int n = sc.nextInt();

// for(int i = 1; i<=n; i++){
//         if(i%3==0){
//                 System.out.println(i);
//         }
// }

// ---------printing table of any number-------
// for(int i =1; i<=10; i++){
//         System.out.println("12 x " + i + " = " + 12*i);
// }

// -----printing AP n terms-------
// for (int i = 2; i<=3*n-1; i+=3){
//         System.out.println(i);
//          }

// -------- printing composite number -------
// for(int i = 2; i<=n-1; i++){
//         if(n%i==0){
//                 System.out.println("composite number");
//                 break;
//         }
// }

// -------printing reverse number--------
// int r = 0;
// while(n!=0){
//         r*=10;
//         r+=(n%10) ;
//         n/=10;
// }
// System.out.println(r);

// -------add original no and reverse number-------
// int original = n;
// int r = 0;
// while(n!=0){
//         r*=10;
//         r+=(n%10) ;
//         n/=10;
// }
// System.out.println(r);
// int sum = original+r;
// System.out.println(sum);

// ----------factorial of a number-------
int fact = 1;
for(int i = 1; i<=n; i++){
        fact*=i;
        }
System.out.println(fact);



     }
}
