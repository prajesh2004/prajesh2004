import java.util.*;
public class Loops {
 public static void main(String[] args){
    System.out.println("Enter a number till you want to check the even numbers");
    Scanner sc = new Scanner(System.in);
    int n= sc.nextInt();

    for(int i=0; i<=n; i=i+2)
    {
        System.out.println(i);
    }


 }   
}
