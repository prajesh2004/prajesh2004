import java.util.*;
public class Loop5 {
    public static void main(String args[]){
    System.out.println("Enter a number to perform loop");
        Scanner sc= new Scanner(System.in);
    int a = sc.nextInt();

    for(int i= 1; i<=a; i++){
        System.out.println();
        for(int j=1; j<=i; j++)
        System.out.print("*");
    }
     System.out.println();
    }
}
