import java.io.IOException;

public class Controller {
    private static String GAME_INTRO = "Welcome to TicTacToe.";
    private static String PLAYER1_NAME_PROMPT = "Please enter player1 name.";
    private static String PLAYER2_NAME_PROMPT = "Please enter player2 name.";
    public static void main(String[] args) throws IOException {
        System.out.println(GAME_INTRO);
        System.out.println(PLAYER1_NAME_PROMPT);
        byte byte1[]=new byte[50];
        System.in.read(byte1);
        String player1Name =new String(byte1).trim();
        System.out.println(PLAYER2_NAME_PROMPT);
        byte byte2[]=new byte[50];
        System.in.read(byte2);
        String player2Name =new String(byte2).trim();
        System.out.println("For "+player1Name + ", input is X");
        System.out.println("For "+player2Name + ", input is 0");
        System.out.println("Please enter a position in the given dashboard.");
        TicTacToe game = new TicTacToe(player1Name,player2Name);
        game.displayBoard();
        while (game.hasNextTurn()){
            if(game.player1Turn)
                System.out.println("Input for " + player1Name + ": ");
            else
                System.out.println("Input for " + player2Name + ": ");
            byte inputByte[]=new byte[50];
            System.in.read(inputByte);
            String input =new String(inputByte).trim();
            game.playTurn(input);

        }
    }
}