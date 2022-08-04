import java.util.*;
public class Loop13 {
    public static void main(String args[]){
      int n=5;
      //spaces
      for(int i=1; i<=n; i++){
        for(int j=1; j<=n-i; j++){
        System.out.print(" ");
      }
      //stars
      for (int j=1; j<=n; j++){
        System.out.print("*");
      }
      System.out.println();

    }
    
}
}