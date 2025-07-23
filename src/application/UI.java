package application;

import chess.ChessPiece;

public class UI {

	
	public static void printBoard(ChessPiece[][] pieces) {
		for(int i=0; i<pieces.length; i++) {
			//imprimi o número da linha
			System.out.print((8 - i) + " ");
			for(int j=0; j<pieces.length; j++) {
				printPiece(pieces[i][j]);
			}	
			System.out.println();
		}
		System.out.print(" a b c d e f g h");
	}
	
	//printar uma peça
	public static void printPiece(ChessPiece piece) {
		if(piece == null) {
			//significa que não tem peça
			System.out.print("-");
		}else {
			System.out.print(piece);
		}
		System.out.print(" ");
	}
}
