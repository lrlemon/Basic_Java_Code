package tu14userinput;
import java.util.Scanner;

public class Tu14UserInput{
    public static void main(String args[]){
        int id, price;
        String title,description,category;
        
        Scanner input  = new Scanner(System.in);
        Scanner input1  = new Scanner(System.in);
        System.out.printf("Enter id : ");
        id = input.nextInt();
        System.out.printf("Enter Title : ");
        title = input1.nextLine();
        System.out.printf("Enter Price : ");
        price = input.nextInt();
        System.out.printf("Enter Description : ");
        description = input1.nextLine();
        System.out.printf("Enter Category : ");
        category = input1.nextLine();
        
        
        System.out.println("The Id Is: "+id);
        System.out.println("The Title Is: "+title);
        System.out.println("The Enter Price Is: "+price);
        System.out.println("The Description Is: "+description);
        System.out.println("The Category Is: "+category);
      
    }
}
