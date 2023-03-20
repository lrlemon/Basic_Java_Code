
package incrementdecrementoperator;


public class IncrementDecrementOperator {

    public static void main(String[] args) {
       
        int x = 5,y;
        int a = 10,b;
        
        y = ++x;//the value of x is 6
        System.out.printf("The value of X is( After Prefix Increment): %d \n",y);
        
        
        y = x++;//the value of x is 6
        System.out.printf("The value of X is( After Postfix Increment): %d \n",y);
        y = x;//the value of x is 7
        System.out.printf("The value of X is( After Prefix Increment): %d \n",y);
        
        
        b = --a;//the value of x is 9
        System.out.printf("The value of X is( After Prefix Decrement): %d \n",b);
        
        
        b = a--;//the value of x is 9
        System.out.printf("The value of X is( After Postfix Decrement): %d \n",b);
        b = a;//the value of x is 8
        System.out.printf("The value of X is( After Postfix Decrement): %d \n",b);
    }
    
}
