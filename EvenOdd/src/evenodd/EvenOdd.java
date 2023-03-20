

package evenodd;
import java.util.Scanner;

public class EvenOdd {

    public static void main(String[] args) {
        
        System.out.println("Enter any number: ");
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        if(num%2==0){
            System.out.printf("It's a Even number\n");
        }
        else{
            System.out.printf("It's a Odd number\n");
        }
    }
    
}
