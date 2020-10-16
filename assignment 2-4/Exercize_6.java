import java.util.Scanner;

class Exercize_6 {

    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int rollnum = 0;
        int roll = 0;
        int tally = 0;
        String answer = "yes";
        
        
        
        
      while(answer.equals("yes")){ 

        tally = 0;
          
        System.out.print("how many d6's do you want to roll?");
        rollnum = sc.nextInt();
        
        System.out.println("");
        System.out.print("You rolled: ");
        
        for(int i = 1; i<=rollnum; i++){
        roll = (int) (Math.random()*6) + 1;
        
        tally += roll;
        System.out.print(roll+", ");
       }
      
        System.out.println("");
        System.out.println("Final tally = " + tally);
        answer = sc.nextLine();
       
       
        System.out.println("");
        System.out.println("Would you like to play again, answer by typing 'yes' or 'no'");
        answer = sc.nextLine();
     
      
      }
      
        System.out.println("");
        System.out.println("Bye");
      
  }
}
    
