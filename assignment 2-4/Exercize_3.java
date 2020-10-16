import java.util.Scanner;

class Exercize_3 {
 
    public static void main ( String [] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int i = 0;
        
        int tally = 0;
        
        while (i >= 0){
            
            System.out.println("Enter interger:");
            i = sc.nextInt();
            
            if(i>0)
            tally += i;
            
        }
       
        System.out.println("");
        System.out.println("Tally equals " + tally);
        
        
    }
    
}

