import java.util.Scanner;

class Exercize_7 {
 
    public static void main ( String [] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int i = (int) (Math.random()*101)+1;
        
        int x = 0;
        System.out.println ("Enter your guess (must be an interger between 1 and 100):");
        x = sc.nextInt();
        
        
        while (x != i){
            
            if (x<i)
            System.out.println("The number you are trying to guess is higher than " + x);
            
            if (x>i)
            System.out.println("The number you are trying to guess is lower than " + x);
            
            System.out.println("Enter your guess (must be an interger between 1 and 100):");
            x = sc.nextInt();
            
        }
        
        System.out.println("You have guessed correctly, the number is " + x);
        
    }
    
}

