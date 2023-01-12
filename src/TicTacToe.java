import org.w3c.dom.ls.LSOutput;

public class TicTacToe {

   public boolean player1Turn = true;
   String[][] board = new String[3][3];
   public TicTacToe(String player1 , String player2){
      int counter = 1;
      for(String[] array : board){
         int i = 0;
         for(String c : array){
             c = Integer.toString(counter);
             array[i]= c;
             i++;
             counter++;
         }
         i = 0;
      }
   }

   public void playTurn(String position){
      updateBoard(position);
      isPlayerWon(position);
      player1Turn = !player1Turn;
   }

   public boolean hasNextTurn(){
      for(String[] array : board){
         for(String c : array){
            if(!(c.equals("X") || c.equals("0")))
               return true;
         }
      }
      System.out.println("Game tied.");
      return false;
   }

   private boolean isPlayerWon(String pos){
      switch (pos){
         case "1":
         {
            if(player1Turn && (board[1][1].equals("X") && board[2][2].equals("X")) ||
                    (board[0][1].equals("X") && board[0][2].equals("X")) ||
                    (board[1][0].equals("X") && board[2][0].equals("X"))) {
               System.out.println("player1 won.");
            }else if((board[1][1].equals("0") && board[2][2].equals("0")) ||
                    (board[0][1].equals("0") && board[0][2].equals("0")) ||
                    (board[1][0].equals("0") && board[2][0].equals("0"))){
               System.out.println("player2 won.");
            }
         }
            break;
         case "2": {
            if((board[0][0].equals("X")&&board[2][2].equals("X"))||
                    (board[0][1].equals("X")&&board[0][2].equals("X"))||
                    (board[1][0].equals("X")&&board[2][0].equals("X"))){
               if (player1Turn) {
                  System.out.println("player1 own");
               } else {
                  System.out.println("player2 own");
               }
            }
         }
            break;
         case "3":
         {
            if (board[1][1].equals("X") && board[2][2].equals("X")) {
               if (player1Turn) {
                  System.out.println("player1 own");
               } else {
                  System.out.println("player2 own");
               }
            }
         }
            break;
         case "4":
         {
            if (board[1][1].equals("X") && board[2][2].equals("X")) {
               if (player1Turn) {
                  System.out.println("player1 own");
               } else {
                  System.out.println("player2 own");
               }
            }
         }
            break;
         case "5":
         {
            if (board[1][1].equals("X") && board[2][2].equals("X")) {
               if (player1Turn) {
                  System.out.println("player1 own");
               } else {
                  System.out.println("player2 own");
               }
            }
         }
            break;
         case "6":
         {
            if (board[1][1].equals("X") && board[2][2].equals("X")) {
               if (player1Turn) {
                  System.out.println("player1 own");
               } else {
                  System.out.println("player2 own");
               }
            }
         }
            break;
         case "7":
         {
            if (board[1][1].equals("X") && board[2][2].equals("X")) {
               if (player1Turn) {
                  System.out.println("player1 own");
               } else {
                  System.out.println("player2 own");
               }
            }
         }
            break;
         case "8":
         {
            if (board[1][1].equals("X") && board[2][2].equals("X")) {
               if (player1Turn) {
                  System.out.println("player1 own");
               } else {
                  System.out.println("player2 own");
               }
            }
         }
            break;
         case "9":
         {
            if (board[1][1].equals("X") && board[2][2].equals("X")) {
               if (player1Turn) {
                  System.out.println("player1 own");
               } else {
                  System.out.println("player2 own");
               }
            }
         }
            break;
      }
      return false;
   }

   private void updateBoard(String input){
      for(String[] array : board){
         int i = 0;
         for(String c : array){
            if(input.equals(c)){
               array[i]=  player1Turn ? "X" : "0";
            }
            i++;
         }
         i = 0;
      }
      displayBoard();
   }

   public void displayBoard(){
      for(String[] array : board){
         for(String c : array){
            System.out.print(c + " " + "| ");
         }

         System.out.println();
         System.out.print("--  --  --");
         System.out.println();
      }
   }


}
