import java.util.*;
public class Loop3 {
  public static void main(String args[]){
    System.out.println("Enter two numbers to perform loop");
    Scanner sc= new Scanner(System.in);
    int a= sc.nextInt();
    int b= sc.nextInt();

    for(int i= 1; i<=a; i++){
        
        for(int j=1; j<=b; j++){
            System.out.print("*");
            

        }
        System.out.println();
    }
  }  
}
