//Write a code for a tic-tac-toe board game with 3 rows and 3 columns. Randomly put "X"  "0" and " " in it.
import java.util.Random;
class Main {
  public static void main(String[] args) {
    Random rand = new Random();
    String[][] board = new String[3][3];

    System.out.println();

    System.out.println(board[0][0] + "  |  " + board[0][1] + "  |  " + board[0][2]);  
    System.out.println("-------------");
    System.out.println(board[1][0] + "  |  " + board[1][1] + "  |  " + board[1][2]);  
    System.out.println("-------------");
    System.out.println(board[2][0] + "  |  " + board[2][1] + "  |  " + board[2][2]);

    for(int r=0; r<3; r++){
      for(int c=0; c<3; c++){
        int rando = rand.nextInt(10); 
        if(rando %2 == 0){
          board[r][c] = "X";
        }
        else{
          board[r][c] = "O";
        }
        System.out.println("\n\nThe Random Placement: \n");
          System.out.println(board[0][0] + "  |  " + board[0][1] + "  |  " + board[0][2]);  
    System.out.println("-------------");
    System.out.println(board[1][0] + "  |  " + board[1][1] + "  |  " + board[1][2]);  
    System.out.println("-------------");
    System.out.println(board[2][0] + "  |  " + board[2][1] + "  |  " + board[2][2]);
          
      }
    }
      
    
  }
}

