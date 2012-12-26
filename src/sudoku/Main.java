package sudoku;

import sudoku.generator.Difficulty;
import sudoku.generator.Generator;
import sudoku.solver.Solver;
import sudoku.solver.SolverMode;

public class Main {

	private final static String[] TEST_GRIDS = {
		"..3.2.6..9..3.5..1..18.64....81.29..7.......8..67.82....26.95..8..2.3..9..5.1.3..", // Very easy
		".64......39.1.547225..4.3....95.3.8.....8.....3.6.45....6.3..479734.8.65......91.", // Easy
		".5.......24..63..77.1..4.53....7.4..82.....35..9.3....96.4..3.85..62..49.......6.", // Medium
		"4.8.6..3......542...5.28...7.6.......1..5..6.......7.4...93.1...715......4..7.9.5", // Difficult
		"...4....5.69..1..24.....8......9.32..3..6..4..28.7......1.....47..5..26.8....9...", // Evil
		"8..6..9.5.............2.31...7318.6.24.....73...........279.1..5...8..36..3......", // Multiple solutions
		"8.......5.............2.31...7318.6.24.....73...........279.1..5...8..36..3......", // Lots of multiple solutions 
		"..9...............5..3....6.5..3..................2........6...3....8........7..."  // No solution
	};
	
	
	public Main() {
		//testSolver();
		testGenerator();
	}
	

	@SuppressWarnings("unused")
	private void testSolver() {
		//Grid grid = new Grid("..345..9...2376........2...5.8..4.714.......232.9..6.4...5........8391...3..617..");
		Grid grid = new Grid(TEST_GRIDS[7]);
		grid.printGrid();
		
		Solver solver = new Solver(grid);
		solver.solve(SolverMode.DO_NOT_STOP);
		solver.printSolutions();
	}

	private void testGenerator() {
		Generator gen = Generator.getInstance();
		gen.generateSudoku(Difficulty.DIFFICULT);
	}
	
	
	public static void main(String[] args) {
		new Main();
	}

}
