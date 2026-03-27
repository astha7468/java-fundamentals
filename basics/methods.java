package basics;
public class methods{
    public static void Astha(){
        prachi();                  //LINE 5
        System.out.println("hello"); //LINE 7
    }
    public static void main(String[]args){  //LINE 1
        Ayush();                           //LINE 2
    }
    public static void prachi(){
        System.out.println("how are you"); //LINE 6
    }
    public static void Ayush(){
        System.out.println("I am fine");// LINE 3
        Astha();                        // LINE 4
    }
}