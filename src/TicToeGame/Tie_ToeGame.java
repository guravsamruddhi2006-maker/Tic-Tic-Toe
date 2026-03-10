package TicToeGame;
import java.util.*;
public class Tie_ToeGame {
    static int rows = 3;
    static int cols = 3;
    static char[][] board = new char[rows][cols];
    static char currentPlayer;

    public static void main(String[] args){
        Scanner sc = new Scanner((System.in));
        Tie_ToeGame obj = new Tie_ToeGame();
        obj.initializeBorad();
        int move = 0;
        currentPlayer = 'X';



        boolean gameOver = false;
        while(!gameOver){
            int row, col;


            obj.PrintBoard();
            System.out.println("Enter the row (0-9): ");
            row = sc.nextInt();
            System.out.println("Enter the column (0-9): ");
            col = sc.nextInt();
            if(!(obj.isValidate(row, col))){
                System.out.println("Invalid Move so, Try again");
            }
            obj.placeMove(row, col);
            move=move+1;

            if(obj.checkWinner()){
                obj.PrintBoard();
                System.out.println(currentPlayer + "Win!");
                gameOver = true;
            }
            else if(obj.isDraw()){
                obj.PrintBoard();
                System.out.println("Game is draw!");
                gameOver = true;
            }
            else{
                obj.switchPlayer();
            }


        }



    }
    public void initializeBorad(){
        for(int i = 0; i<3; i++){
            for(int j = 0; j<3; j++){
                board[i][j]= ' ';
            }

        }


    }
    public void PrintBoard(){
        for(int i = 0; i<rows; i++){
            for(int j = 0; j<cols; j++){
                System.out.print(board[i][j]);
                if(j < cols-1){
                    System.out.print(" | ");

                }

            }
            System.out.println();
            if(i<rows -1){
                System.out.println("--+--+--");
            }
        }
    }

    public boolean isValidate(int row, int col){
        if(row<0 || row>=rows){
            return false;
        }
        if(col>=cols || col<0){
            return false;
        }
        if(board[row][col] != ' '){
            return false;
        }
        return true;

    }

    public void placeMove(int row, int col){

        board[row][col] = currentPlayer;


    }
    public boolean checkWinner() {
        for (int i = 0; i < 3; i++) {
            if (board[i][0] == board[i][1] && board[i][1] == board[i][2] && board[i][0] != ' ') {
                return true;
            }


        }
        for (int j = 0; j < 3; j++) {
            if (board[0][j] == board[1][j] && board[1][j] == board[2][j] && board[0][j] != ' ') {
                return true;
            }
        }
        if (board[0][0] == board[1][1] && board[1][1] == board[2][2] && board[0][0] != ' ') {
            return true;
        }
        if(board[0][2] == board[1][1] && board[1][1] == board[2][0] && board[0][2] != ' '){
            return true;
        }
        return false;


    }

    public boolean isDraw(){
        for(int i = 0; i<3; i++){
            for(int j = 0; j<3; j++){
                if(board[i][j] == ' '){
                    return false;
                }
            }
        }
        return true;

    }
    public void switchPlayer(){
        if(currentPlayer == 'X'){
            currentPlayer = 'O';
        }else
            currentPlayer = 'X';


    }
}
