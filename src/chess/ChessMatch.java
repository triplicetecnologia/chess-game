package chess;

import boardgame.Board;

//Será a classe que irá conter as regras do Xadrez, basicamente o coração da aplicação
public class ChessMatch {
	
	private Board board;
	
	public ChessMatch() {
		//Essa regra está devidamente atrelada com a classe responsável por saber disso
		board = new Board(8, 8);
	}
	
	public ChessPiece[][] getPieces(){
		ChessPiece[][] mat = new ChessPiece[board.getRows()][board.getColumns()];
		for(int i=0; i < board.getRows(); i++) {
			for(int j=0; j < board.getColumns(); j++) {
				//Está sendo feito o downcast para que a peça não seja acessada diretamente, só será acessada as peças do jogo mesmo
				mat[i][j] = (ChessPiece) board.piece(i,j);
			}
		}
		return mat;
	}

}
