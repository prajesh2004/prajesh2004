import java.util.*;
public class SecondClass{
    public static void main(String[] args){
       System.out.println("Enter two numbers");
       Scanner sc= new Scanner(System.in);
       int a = sc.nextInt();
       float b = sc.nextFloat();
       System.out.println("Enter the number to perform a operation");
       int k = sc.nextInt();
       
       switch(k){
        case 1: 
              System.out.println(a+b);
              break;
        case 2:
              System.out.println(a-b); 
             break;
        case 3:
              System.out.println(a*b);
              break;
        case 4:
              System.out.println(a/b);
              break;
        case 5:
              System.out.println(a%b);
              break;
        default:
              System.out.println("Invalid input!!!!!");                             
       }
    }
}
    