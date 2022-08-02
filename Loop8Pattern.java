import java.util.*;
public class Loop8Pattern {
    public static void main(String args[]){
        System.out.println("Enter a numebr to perform pattern loop");
    Scanner sc = new Scanner(System.in);
    int a= sc.nextInt();


    for(int i=1; i<=a; i++){
        for(int j=1; j<=i; j++){
            System.out.print(j);
        }
        System.out.println();
    }
    }
    
}
