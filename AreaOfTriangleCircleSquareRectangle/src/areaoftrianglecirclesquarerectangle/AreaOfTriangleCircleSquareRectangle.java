package areaoftrianglecirclesquarerectangle;
import java.util.Scanner;

class AreaOfTriangleCircleSquareRectangle{
    public static void main(String args[]){
        
        //area of traingle
        double height,base,result;
        System.out.printf("Enter the Height of Triangle : ");
        Scanner input = new Scanner(System.in);
        height = input.nextDouble();
        System.out.printf("Enter the Width of Triangle : ");
        Scanner input1 = new Scanner(System.in);
        base = input1.nextDouble();
        result = 0.5*height*base;
        System.out.printf("The area of Triangle is :%.2f \n", result);
        
        
        //area of circle
        double radius,result1;
        System.out.printf("Enter the Radius of Circle : ");
        Scanner input2 = new Scanner(System.in);
        radius = input2.nextDouble();
        double pi = 3.1416;
        result1 = pi*radius*radius;
        System.out.printf("The area of Circle is :%.2f \n", result1);
        
        
        //area of Square
        double height1,length,result2;
        System.out.printf("Enter the Height of Square : ");
        Scanner input3 = new Scanner(System.in);
        height1 = input3.nextDouble();
        System.out.printf("Enter the Length of Square : ");
        Scanner input4 = new Scanner(System.in);
        length = input4.nextDouble();
        result2 = height1*length;
        System.out.printf("The area of Square is :%.2f \n", result2);
        
        
        //area of Rectangle
        double lenght1,result3;
        System.out.printf("Enter the Length of Rectangle : ");
        Scanner input5 = new Scanner(System.in);
        lenght1 = input5.nextDouble();
        result3 = lenght1*lenght1;
        System.out.printf("The area of Rectangle is :%.2f \n", result3);
        
        
    }
}