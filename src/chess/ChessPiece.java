package chess;

import boardgame.Board;
import boardgame.Piece;

public class ChessPiece extends Piece{
	
	private Color color;

	public ChessPiece(Board board, Color color) {
		//esse super está repassando o board para a classe Piece
		super(board);
		this.color = color;
	}

	//Color só pode ser acessado e não criado ou modificado
	public Color getColor() {
		return color;
	}

	
}
