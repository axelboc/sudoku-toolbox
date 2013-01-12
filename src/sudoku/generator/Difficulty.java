package sudoku.generator;

public enum Difficulty {
	
	PIECE_OF_CAKE(new int[]{43, 48}, 5),
	EASY(new int[]{36, 42}, 4),
	MEDIUM(new int[]{32, 35}, 3),
	HARD(new int[]{28, 31}, 2),
	EVIL(new int[]{22, 27}, 0);

	private int givensRowColLowerBound;
	private int[] givensInterval;
	
	
	Difficulty(int[] givensInterval, int givensRowColLowerBound) {
		this.givensInterval = givensInterval;
		this.givensRowColLowerBound = givensRowColLowerBound;
	}

	
	public int getGivensLowerBound() {
		return givensInterval[0];
	}

	public int getGivensUpperBound() {
		return givensInterval[1];
	}

	public int getGivensRowColLowerBound() {
		return givensRowColLowerBound;
	}
	
}
