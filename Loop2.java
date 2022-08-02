import java.util.*;
public class Loop2 {
    public static void main(String[] args){
      
        System.out.println("Enter a number either 1 or 0");
        Scanner sc = new Scanner(System.in);
        int i= sc.nextInt();
        
         switch(i){
            case 0:
                 break;
            case 1:
                System.out.println("Enter the student's number between 0 to 100");
                int r= sc.nextInt();
                if(r>=90){
                    System.out.println("This is good");
                }
                else if(r>=60){
                    System.out.println("This is also good");
                }
                else
                {
                    System.out.println("This is good as well... Because pass matters");
            
                }
                break;
            
            default:
                  System.out.println("Invalid input");           
         }
    }
    
}
