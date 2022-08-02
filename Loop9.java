import java.util.*;
public class Loop9 {
   public static void main(String args[]){
    System.out.println("Enter a number two perform pattern loop");
    //input source code
    Scanner sc = new Scanner(System.in);
    int a=sc.nextInt();

    for(int i=a; i>=1; i--){
        for(int j=1; j<=i; j++){
            System.out.print(j);
        }
          System.out.println();
    }

   } 
}
