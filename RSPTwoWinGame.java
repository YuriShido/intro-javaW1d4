import java.util.Scanner;
import java.lang.Math;

public class RSPTwoWinGame {
  
  public static void main(String[] args) {
    
    Scanner input = new Scanner(System.in);
    // while computer or person win 2 times loop finish
    //count win 
    int computerWinCounter = 0;
    int personWinCounter = 0;
    System.out.println("Winner is the one who won two times first");
    while(computerWinCounter < 2 && personWinCounter < 2)
    {
      System.out.print("scissor (0) , rock (1) , paper (2) : ");
      int person = input.nextInt();
      int computer = (int)(Math.random() * 3);
      
      if (person == 0)
      switch(computer) {
        case 0:
        System.out.println("The computer is scissor. You are scissor too It's a draw!");
        break;
        case 1:
        System.out.println("The computer is rock. You are scissor. You lost!");
        computerWinCounter++;
        break;
        case 2:
        System.out.println("The computer is paper. You are scissor. You won!");
        personWinCounter++;
        break;
      }
      else if (person == 1)
      switch(computer) {
        case 0:
        System.out.println("The computer is scissor. You are rock! You won!");
        personWinCounter++;
        break;
        case 1:
        System.out.println("The computer is rock. You are rock too. It's a draw! ");
        break;
        case 2:
        System.out.println("The computer is paper. You are rock. You lost!");
        computerWinCounter++;
        break;
      }
      else 
      switch(computer) {
        case 0:
        System.out.println("The computer is scissor. You are paper! You lost!");
        computerWinCounter++;
        break;
        case 1:
        System.out.println("The computer is rock. You are paper. You won!");
        personWinCounter++;
        break;
        case 2:
        System.out.println("The computer is paper. You are paper too. It's a draw!");
        break;
      }

      if (computerWinCounter == 2) {
  
        System.out.println("Finish! Computer is win! You are lost!");
        
      }
      else if (personWinCounter == 2) {
  
        System.out.println("Finish! You are win!");
        
      }  
      else 
      System.out.println("Next round!");

    }
    
  }
}
