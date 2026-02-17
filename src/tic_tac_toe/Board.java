package tic_tac_toe;

public class Board {
    static String[][] board=new String[3][3];
    public Board(){
        for (int i = 0; i < 3; i++) {
        	for (int j = 0; j < 3; j++) {
        		board[i][j]=" ";
        	}
        }
    }
    public void print_board() {
    	for(int i=0;i<board.length;i++){
    		System.out.print(i+"   ");
            for(int j=0;j<board.length;j++){
                System.out.print(board[i][j]);
                if(j<board.length-1) {
                	System.out.print(" | ");
                }
            }
            System.out.println();
            if(i<board.length-1)
            System.out.println("   -----------");
        }
    	System.out.println();
    	System.out.println("    "+0+"   "+1+"   "+2);
    }
}
