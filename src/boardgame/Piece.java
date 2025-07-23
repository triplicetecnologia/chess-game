package boardgame;

public class Piece {
	
	//para uma camda protegida evitando que outras camadas acessem.
	protected Position position;
	private Board board;
	public Piece(Board board) {
		super();
		this.board = board;
	}
	
	//Por questão de segurança protected para evitar que outras camadas acessem esse metodo
	protected Board getBoard() {
		return board;
	}
		
}
