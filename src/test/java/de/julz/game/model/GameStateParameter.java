package de.julz.game.model;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import de.julz.game.model.util.Eval;

@RunWith(Parameterized.class)
public class GameStateParameter {
	

	    @Parameters
	    public static Collection<Object[]> data() {
	    	
	    	List<Object[]> list = new ArrayList<Object[]>();
	    	list.add(new Object[] {Board.fromJSON("[[1,0,0,1],"
											     + "[1,1,1,1],"
											     + "[4,4,0,0],"
											     + "[1,0,0,0]]")});
	    	
	    	
	    	list.add(new Object[] {Board.fromJSON("[[1,3,0,9],[4,0,0,0],[7,9,3,0],[2,0,5,5]]")});
	    	list.add(new Object[] {Board.fromJSON("[[2,0,0,7],[6,0,5,8],[0,0,0,5],[0,0,5,0]]")});
	    	list.add(new Object[] {Board.fromJSON("[[9,3,2,0],[4,3,7,0],[0,0,2,0],[1,0,0,0]]")});
	    	list.add(new Object[] {Board.fromJSON("[[0,1,6,0],[0,0,0,0],[7,9,7,0],[0,0,0,0]]")});
	    	list.add(new Object[] {Board.fromJSON("[[6,0,1,6],[0,1,5,0],[9,0,0,0],[3,3,0,5]]")});
	    	list.add(new Object[] {Board.fromJSON("[[9,0,2,0],[0,1,0,7],[0,9,0,0],[0,0,4,0]]")});
	    	list.add(new Object[] {Board.fromJSON("[[8,8,0,0],[0,2,0,4],[7,0,8,1],[0,0,0,0]]")});
	    	list.add(new Object[] {Board.fromJSON("[[1,9,0,0],[4,9,3,8],[0,0,0,4],[0,0,0,0]]")});
	    	list.add(new Object[] {Board.fromJSON("[[9,3,0,0],[0,0,1,0],[0,8,2,1],[0,0,3,3]]")});
	    	list.add(new Object[] {Board.fromJSON("[[3,6,0,0],[4,8,0,0],[6,0,6,5],[0,0,0,3]]")});
	    	list.add(new Object[] {Board.fromJSON("[[2,0,6,0],[8,0,0,0],[0,7,6,0],[0,2,1,0]]")});
	    	list.add(new Object[] {Board.fromJSON("[[0,1,0,9],[0,0,1,3],[7,5,0,0],[5,0,0,5]]")});
	    	list.add(new Object[] {Board.fromJSON("[[8,0,0,5],[8,0,0,4],[6,6,6,9],[0,0,0,4]]")});
	    	list.add(new Object[] {Board.fromJSON("[[0,2,0,1],[0,1,0,0],[9,5,9,0],[4,0,2,0]]")});
	    	list.add(new Object[] {Board.fromJSON("[[1,0,6,0],[1,0,0,0],[0,4,1,0],[5,1,0,0]]")});
	    	list.add(new Object[] {Board.fromJSON("[[4,4,0,0],[0,5,0,0],[0,7,1,0],[1,1,6,8]]")});
	    	list.add(new Object[] {Board.fromJSON("[[0,6,5,0],[2,0,5,1],[0,8,0,2],[9,4,0,4]]")});
	    	list.add(new Object[] {Board.fromJSON("[[0,9,0,0],[0,4,5,3],[0,0,0,0],[0,0,0,0]]")});
	    	list.add(new Object[] {Board.fromJSON("[[1,0,5,0],[0,5,0,0],[6,0,0,8],[1,0,1,9]]")});
	    	list.add(new Object[] {Board.fromJSON("[[3,0,0,0],[0,0,2,9],[0,0,6,7],[5,9,5,4]]")});
	    	list.add(new Object[] {Board.fromJSON("[[0,0,5,0],[1,3,0,0],[8,2,6,0],[6,0,1,2]]")});
	    	list.add(new Object[] {Board.fromJSON("[[0,0,5,2],[1,8,0,6],[7,6,3,0],[5,1,9,0]]")});
	    	list.add(new Object[] {Board.fromJSON("[[0,7,0,6],[9,3,0,4],[8,0,4,6],[7,6,0,0]]")});
	    	list.add(new Object[] {Board.fromJSON("[[0,4,2,0],[0,0,0,0],[0,8,7,4],[3,9,8,0]]")});
	    	list.add(new Object[] {Board.fromJSON("[[1,7,6,2],[4,0,2,0],[4,7,0,1],[0,6,0,8]]")});
	    	list.add(new Object[] {Board.fromJSON("[[4,9,0,6],[8,0,2,1],[3,0,0,0],[1,7,9,6]]")});
	    	list.add(new Object[] {Board.fromJSON("[[4,7,0,6],[5,1,1,0],[1,6,0,0],[3,0,0,9]]")});
	    	list.add(new Object[] {Board.fromJSON("[[8,0,1,0],[2,0,7,0],[0,6,0,0],[9,0,8,0]]")});
	    	list.add(new Object[] {Board.fromJSON("[[9,0,0,1],[0,8,0,0],[4,8,0,5],[0,0,4,0]]")});
	    	list.add(new Object[] {Board.fromJSON("[[0,7,0,0],[0,0,2,8],[2,7,4,5],[6,0,0,1]]")});
	    	list.add(new Object[] {Board.fromJSON("[[7,0,0,3],[0,8,5,0],[0,0,3,9],[6,5,8,0]]")});
	    	list.add(new Object[] {Board.fromJSON("[[7,0,9,0],[7,2,0,0],[2,0,0,6],[3,0,0,0]]")});
	    	list.add(new Object[] {Board.fromJSON("[[7,7,4,3],[9,7,0,0],[9,7,0,0],[8,8,5,9]]")});
	    	list.add(new Object[] {Board.fromJSON("[[0,1,2,0],[0,5,9,0],[8,0,7,0],[1,0,7,5]]")});
	    	list.add(new Object[] {Board.fromJSON("[[8,3,5,0],[0,0,1,2],[3,0,0,8],[0,1,0,4]]")});
	    	list.add(new Object[] {Board.fromJSON("[[0,8,0,0],[8,1,0,4],[4,2,0,2],[0,0,6,0]]")});
	    	list.add(new Object[] {Board.fromJSON("[[9,0,6,0],[0,4,8,3],[0,0,0,0],[0,7,0,0]]")});
	    	list.add(new Object[] {Board.fromJSON("[[7,6,9,2],[0,8,0,0],[6,0,1,0],[0,7,0,0]]")});
	    	list.add(new Object[] {Board.fromJSON("[[0,6,0,0],[0,5,6,9],[0,0,3,1],[9,7,0,0]]")});
	    	list.add(new Object[] {Board.fromJSON("[[0,0,4,5],[9,0,0,0],[0,0,0,4],[0,8,2,2]]")});
	    	list.add(new Object[] {Board.fromJSON("[[1,0,0,0],[3,7,0,5],[7,7,9,9],[1,0,4,0]]")});
	    	list.add(new Object[] {Board.fromJSON("[[5,3,0,6],[0,0,4,9],[0,0,0,8],[0,0,0,0]]")});
	    	list.add(new Object[] {Board.fromJSON("[[2,9,6,0],[5,0,2,6],[0,0,0,4],[6,0,7,3]]")});
	    	list.add(new Object[] {Board.fromJSON("[[0,0,0,0],[3,0,5,0],[6,7,8,0],[1,2,0,0]]")});
	    	list.add(new Object[] {Board.fromJSON("[[9,0,8,8],[3,0,0,2],[0,0,0,0],[6,0,2,0]]")});
	    	list.add(new Object[] {Board.fromJSON("[[0,6,1,0],[0,2,2,0],[0,6,3,0],[9,4,0,0]]")});
	    	list.add(new Object[] {Board.fromJSON("[[0,7,7,0],[9,0,3,0],[0,0,0,7],[2,0,4,0]]")});
	    	list.add(new Object[] {Board.fromJSON("[[6,0,0,4],[2,0,0,0],[8,2,0,0],[0,0,0,0]]")});
	    	list.add(new Object[] {Board.fromJSON("[[2,0,1,8],[4,0,1,0],[0,3,9,5],[0,3,0,1]]")});
	    	list.add(new Object[] {Board.fromJSON("[[1,0,0,1],[0,9,8,6],[1,0,0,2],[3,0,0,7]]")});
	    	list.add(new Object[] {Board.fromJSON("[[4,0,0,0],[3,5,4,0],[4,8,1,8],[9,9,4,2]]")});
	    	list.add(new Object[] {Board.fromJSON("[[2,3,2,0],[5,9,0,0],[0,5,8,0],[8,0,6,0]]")});
	    	list.add(new Object[] {Board.fromJSON("[[0,6,4,0],[0,9,0,7],[0,0,5,9],[7,1,4,0]]")});
	    	list.add(new Object[] {Board.fromJSON("[[0,2,6,0],[2,0,0,1],[0,3,0,0],[6,1,3,5]]")});
	    	list.add(new Object[] {Board.fromJSON("[[0,0,8,2],[0,1,0,0],[7,2,5,7],[7,0,0,0]]")});
	    	list.add(new Object[] {Board.fromJSON("[[0,0,0,0],[2,3,0,5],[9,0,0,9],[0,0,0,0]]")});
	    	list.add(new Object[] {Board.fromJSON("[[6,0,7,0],[0,0,0,4],[0,0,0,5],[9,0,0,6]]")});
	    	list.add(new Object[] {Board.fromJSON("[[0,0,0,0],[0,3,2,5],[2,0,8,0],[3,3,0,0]]")});
	    	list.add(new Object[] {Board.fromJSON("[[0,1,0,0],[0,2,9,0],[4,0,7,0],[0,0,0,0]]")});
	    	list.add(new Object[] {Board.fromJSON("[[0,9,0,0],[0,0,7,0],[0,0,0,6],[0,3,0,6]]")});
	    	list.add(new Object[] {Board.fromJSON("[[0,1,0,0],[0,0,0,0],[0,0,0,1],[1,0,1,0]]")});
	    	list.add(new Object[] {Board.fromJSON("[[4,8,0,1],[6,0,0,8],[0,0,0,6],[7,0,0,0]]")});
	    	list.add(new Object[] {Board.fromJSON("[[8,0,3,9],[6,3,3,0],[1,0,0,0],[0,6,0,5]]")});
	    	list.add(new Object[] {Board.fromJSON("[[0,9,8,0],[4,3,6,0],[0,0,0,0],[4,0,0,0]]")});
	    	list.add(new Object[] {Board.fromJSON("[[8,0,2,8],[0,0,0,0],[9,3,1,1],[0,8,0,6]]")});
	    	list.add(new Object[] {Board.fromJSON("[[0,8,6,0],[0,0,8,8],[0,7,0,0],[5,7,0,7]]")});
	    	list.add(new Object[] {Board.fromJSON("[[0,6,0,9],[0,7,6,0],[0,5,0,0],[0,2,6,0]]")});
	    	list.add(new Object[] {Board.fromJSON("[[0,0,4,5],[8,8,0,0],[0,4,0,3],[0,0,0,8]]")});
	    	list.add(new Object[] {Board.fromJSON("[[0,7,0,6],[1,5,0,7],[3,5,8,3],[6,5,0,0]]")});
	    	list.add(new Object[] {Board.fromJSON("[[0,0,1,8],[0,0,0,8],[0,0,2,0],[7,0,9,6]]")});
	    	list.add(new Object[] {Board.fromJSON("[[5,4,3,0],[9,0,2,2],[0,0,4,8],[0,8,0,1]]")});
	    	list.add(new Object[] {Board.fromJSON("[[7,1,6,0],[0,0,0,0],[0,1,0,6],[0,0,0,7]]")});
	    	list.add(new Object[] {Board.fromJSON("[[0,0,4,0],[3,9,0,4],[8,9,8,0],[0,0,3,4]]")});
	    	list.add(new Object[] {Board.fromJSON("[[4,0,2,6],[8,0,2,8],[0,1,5,0],[1,0,6,0]]")});
	    	list.add(new Object[] {Board.fromJSON("[[3,0,0,1],[0,1,8,8],[0,6,0,0],[0,0,0,8]]")});
	    	list.add(new Object[] {Board.fromJSON("[[0,0,0,3],[7,0,6,6],[3,6,0,1],[0,4,0,5]]")});
	    	list.add(new Object[] {Board.fromJSON("[[0,3,0,0],[0,7,2,4],[1,2,9,0],[0,0,5,0]]")});
	    	list.add(new Object[] {Board.fromJSON("[[5,0,4,9],[5,0,5,9],[0,0,9,0],[7,7,7,5]]")});
	    	list.add(new Object[] {Board.fromJSON("[[3,8,9,8],[0,8,6,1],[0,5,1,0],[4,3,0,2]]")});
	    	list.add(new Object[] {Board.fromJSON("[[0,8,0,8],[0,7,7,4],[4,1,9,4],[0,5,9,0]]")});
	    	list.add(new Object[] {Board.fromJSON("[[2,2,0,5],[4,2,6,9],[9,0,2,0],[0,0,0,3]]")});
	    	list.add(new Object[] {Board.fromJSON("[[8,4,3,0],[0,0,0,0],[0,1,2,7],[0,9,3,1]]")});
	    	list.add(new Object[] {Board.fromJSON("[[0,0,4,0],[0,0,0,0],[0,0,8,0],[0,0,0,0]]")});
	    	list.add(new Object[] {Board.fromJSON("[[5,2,3,6],[0,0,1,8],[0,0,6,0],[4,0,8,3]]")});
	    	list.add(new Object[] {Board.fromJSON("[[0,4,7,0],[0,0,0,4],[7,0,5,0],[0,0,7,0]]")});
	    	list.add(new Object[] {Board.fromJSON("[[0,6,2,3],[3,8,0,1],[0,0,0,0],[0,8,0,4]]")});
	    	list.add(new Object[] {Board.fromJSON("[[3,6,2,4],[5,0,7,0],[0,0,0,3],[0,1,9,4]]")});
	    	list.add(new Object[] {Board.fromJSON("[[9,2,0,3],[0,8,5,0],[0,5,5,0],[3,8,0,0]]")});
	    	list.add(new Object[] {Board.fromJSON("[[0,5,6,0],[3,4,0,0],[9,1,0,1],[0,0,2,0]]")});
	    	list.add(new Object[] {Board.fromJSON("[[0,0,0,0],[0,6,0,0],[9,0,0,0],[0,0,0,7]]")});
	    	list.add(new Object[] {Board.fromJSON("[[7,0,0,0],[0,0,6,0],[7,0,0,0],[0,0,0,0]]")});
	    	list.add(new Object[] {Board.fromJSON("[[0,7,0,3],[0,3,0,6],[6,0,0,0],[9,0,0,9]]")});
	    	list.add(new Object[] {Board.fromJSON("[[7,0,0,8],[1,4,0,4],[0,0,0,0],[1,5,3,0]]")});
	    	list.add(new Object[] {Board.fromJSON("[[0,0,0,1],[0,6,1,0],[7,5,2,0],[4,0,0,2]]")});
	    	list.add(new Object[] {Board.fromJSON("[[6,0,0,0],[5,1,2,0],[0,0,0,0],[9,0,7,9]]")});
	    	list.add(new Object[] {Board.fromJSON("[[8,7,8,0],[0,0,3,9],[2,5,8,0],[0,0,6,4]]")});
	    	list.add(new Object[] {Board.fromJSON("[[4,2,4,0],[0,0,6,3],[0,0,2,6],[0,0,4,0]]")});
	    	list.add(new Object[] {Board.fromJSON("[[0,1,1,3],[0,1,2,7],[0,0,0,8],[1,7,0,0]]")});
	    	list.add(new Object[] {Board.fromJSON("[[9,1,0,0],[0,0,0,3],[7,0,0,1],[8,8,5,0]]")});
	    	list.add(new Object[] {Board.fromJSON("[[8,4,0,3],[5,6,9,0],[2,0,4,3],[1,0,0,5]]")});
			
	    
	        return list;
	    }

	    private Board board;


	    public GameStateParameter(Board board) {
			super();
			this.board = board;
		}


		@Test
	    public void correctMoveTest() {
			for (Action a : Action.values()) {
				Board expected = Eval.move(board.copy(), a);
				Board result = new GameState(board.copy()).createNextGameState(a).getBoard();
				assertEquals(expected, result);
			}
	    }
		
		@Test
	    public void possibleMovesTest() {
			GameState state = new GameState(board.copy());
			assertEquals(GameStateTest.getPossibleMoves(state), state.getPossibleMoves());
	    }
	    
	    
	    

}
