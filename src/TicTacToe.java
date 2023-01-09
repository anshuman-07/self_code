public class TicTacToe {

    private static Controller controller = null;
    public static void main(String[] args) {
        controller = new Controller();
        Controller.player1 = "X";
        Controller.player2 = "0";
        System.out.println("Hello , game started.");
        System.out.println("Player1 = X");
        System.out.println("Player2 = 0");
    }

    public void addInput(int pos){
        controller.HandleInput(pos);
    }
}