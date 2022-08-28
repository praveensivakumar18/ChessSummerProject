public abstract class Piece {

	boolean isWhite;

	// white piece = true, else false
	public Piece(boolean isWhite) {
		this.isWhite = isWhite;
	}

	// return true for white piece
	public boolean isWhite() {

		return isWhite;
	}

	public abstract void draw();

	public abstract boolean isMoveValid(int srcRow, int srcCol, int destRow,
			int destCol);

	public abstract int relativeValue();

}