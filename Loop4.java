import java.util.*;
public class Loop4 {
    public static void main(String args[]){
        System.out.println("Enter two numbers to perform loop");
    Scanner sc = new Scanner(System.in);
    int a= sc.nextInt();
    int b= sc.nextInt();
    //outer loop
    for(int i=0; i<a; i++){
        //inner loop
        for(int j=0; j<b; j++){
            //cell -> (i,j)
            if(i==0|| j==0 || i==a-1 || j==b-1){
                System.out.print("*");
            } else {
                System.out.print(" ");
            }
            
        }
           System.out.println();
    }
    }
    
}
