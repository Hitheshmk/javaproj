package tic_tac_toe;
import java.util.Scanner;

public class Game extends Board {
	String player="X";
	Board b=new Board();
	
	public Game() {
		b.print_board();
	}
	
	public boolean check_winner() {
		for(int i=0;i<board.length;i++) {
			if(board[i][0]==player && board[i][1]==player && board[i][2]==player) {
				return true;
			}
			else if (board[0][i].equals(player) && board[1][i].equals(player) && board[2][i].equals(player)) {
	            return true;
	        }
		}
		if (board[0][0].equals(player) && board[1][1].equals(player) && board[2][2].equals(player)) {
	        return true;
	    }
		else if (board[0][2].equals(player) && board[1][1].equals(player) && board[2][0].equals(player)) {
	        return true;
	    }
		return false; 
	}
	
	public boolean is_full () {
		for (int i = 0; i < 3; i++) {
        	for (int j = 0; j < 3; j++) {
        		if(board[i][j]=="-" || board[i][j]==" ") {
        			return false;
        		}
        	}
        }
		return true; 
	} 
	
	public void start() {
		Scanner sc=new Scanner(System.in);
		
		while (true) {
			System.out.println();
			
			System.out.print("player "+player+" : ");
			int x=sc.nextInt();
			int y=sc.nextInt();
			
			System.out.println();

			if(board[x][y]=="-" || board[x][y]==" ") {
				board[x][y]=player;
			}
			else {
				System.out.println("The place is already filled");
				continue;
			}
			
			b.print_board();
			
			if(check_winner()) {
				System.out.println("Player "+player+" is winner");
				break; 
			}
			
			if(is_full()) {
				System.out.println("Board is full - Game Draw");
				break; 
			}
			
			if(player=="X") {
				player="O";
			}
			else {
				player="X";
			}
		}
	}
}
