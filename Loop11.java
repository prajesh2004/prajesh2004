import java.util.*;
public class Loop11 {
    public static void main(String args[]){
        System.out.println("Enter a number two perform loop");
        Scanner sc= new Scanner(System.in);
        int a= sc.nextInt();
// outer loop
       for(int i=1; i<=a; i++){
        //inner loop
        for(int j=1; j<=i; j++){
            if((i+j)%2==0){
                System.out.print(1+" ");

            }
            else{
                System.out.print(0+" ");
            }
        }
        System.out.println();
       }

       

    }
}
