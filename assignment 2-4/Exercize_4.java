import java.util.Scanner;

class Exercize_4 {
 
    public static void main ( String [] args) {
        
        Scanner sc = new Scanner(System.in);
        
        String symbol = ""; 
        System.out.println("What symbol do you want your bar made of?");
        symbol = sc.nextLine();
        
        int height = 0; 
        System.out.println("What length do you want your bar to be?");
        height = sc.nextInt();
        
        
        

        
        
            for (int s = 1 ; s <= height; s++){
                System.out.print(symbol);
            }
            
         
        }
        
        
}
    


