import java.util.Scanner;

class Exercize_5 {
 
    public static void main ( String [] args) {
        
        Scanner sc = new Scanner(System.in);
        
        String symbol = ""; 
        System.out.println("What symbol do you want your triangle made of?");
        symbol = sc.nextLine();
        
        int height = 0; 
        System.out.println("What height do you want your triangle to be?");
        height = sc.nextInt();
        
        
        

        
        for (int h = 1; h <= height; h++){
            
            for (int s = 1 ; s <= h; s++){
                System.out.print(symbol);
            }
            
           System.out.println("");
        }
        
        
    }
    
}

