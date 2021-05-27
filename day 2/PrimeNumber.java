import java.util.*;
public class PrimeNumber {
    public static void main(String[] args) {
        Scanner S= new Scanner(System.in);
        int a;
        System.out.print("enter a number ");
        a=S.nextInt();    
        if(a==0 || a==1){
            System.out.println(a+" is not a prime number");
        }
        else if(a==2){
            System.out.println(a+" is a prime number");
        }
        else if(a%2!=0){
            System.out.println(a+" is a prime number");
        }
        else{
            System.out.println(a+" is not a prime number");
        }
    }
}