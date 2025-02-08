import java.util.Scanner;

public class Guess_The_Number {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int sysnumber=(int)(Math.random()*100);
        System.out.println("Guess the number which is guessed by the computer");
        System.out.println("Enter the number : ");
        int usernumber=-1;
        while (usernumber!=sysnumber){
            usernumber=sc.nextInt();
            if (usernumber<sysnumber){
                System.out.println("Your number is smaller than system number");
            }
            else{
                System.out.println("your number is larger than system number");
            }
        }
        System.out.println("");
        System.out.println("");
        System.out.println("  WHOOOO..... you guessed the correct number");
        System.out.println("============================================>");
        System.out.println("");
        sc.close();
    }
}
