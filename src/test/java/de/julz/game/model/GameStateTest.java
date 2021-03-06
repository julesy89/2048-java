package de.julz.game.model;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import org.junit.Test;

import de.julz.game.model.util.Eval;

public class GameStateTest {

	
	private Board getSampleBoard() {
		return Board.fromJSON("[[1,0,0,1],"
						     + "[1,1,1,1],"
						     + "[4,4,0,0],"
						     + "[1,0,0,0]]");
	}
	
	
	public static Set<Action> getPossibleMoves(GameState state) {
		// else set calculate the values by looking at movements of all moves.
		Set<Action> nextMoves = new HashSet<Action>();
		for (Action action : Action.values()) {
			GameState nextState = state.createNextGameState(action);
			if (action != Action.NIL && !state.getBoard().equals(nextState.getBoard()))
				nextMoves.add(action);
		}
		return nextMoves;
	}
	
	
	@Test
	public void Empty_Nothing() {
		GameState state = new GameState(new Board());
		Board result = state.createNextGameState(Action.UP).getBoard();
		assertArrayEquals(new int[Board.FIELD_SIZE][4], result.getArray());
		assertEquals(16, state.getBoard().getEmptyFields().size());
		assertEquals(0, state.getBoard().getNonEmptyFields().size());
	}
	
	@Test
	public void Move_Nil() {
		GameState state = new GameState(getSampleBoard());
		Board result = state.createNextGameState(Action.NIL).getBoard();
		assertEquals(state.getBoard(), result);
	}
	
	
	@Test
	public void Move_Left() {
		GameState state = new GameState(getSampleBoard());
		Board result = state.createNextGameState(Action.LEFT).getBoard();
		Board expected =  Board.fromJSON( "[[2,0,0,0],"
									     + "[2,2,0,0],"
									     + "[5,0,0,0],"
									     + "[1,0,0,0]]");
		assertEquals(expected, result);
	}
	
	@Test
	public void Move_Up() {
		GameState state = new GameState(getSampleBoard());
		Board result = state.createNextGameState(Action.UP).getBoard();
		Board expected =  Board.fromJSON( "[[2,1,1,2],"
									     + "[4,4,0,0],"
									     + "[1,0,0,0],"
									     + "[0,0,0,0]]");
		assertEquals(expected, result);
	}
	
	@Test
	public void Move_Right() {
		GameState state = new GameState(getSampleBoard());
		Board result = state.createNextGameState(Action.RIGHT).getBoard();
		Board expected =  Board.fromJSON( "[[0,0,0,2],"
									     + "[0,0,2,2],"
									     + "[0,0,0,5],"
									     + "[0,0,0,1]]");
		assertEquals(expected, result);
	}


	@Test
	public void Move_Down() {
		GameState state = new GameState(getSampleBoard());
		Board result = state.createNextGameState(Action.DOWN).getBoard();
		Board expected =  Board.fromJSON( "[[0,0,0,0],"
									     + "[2,0,0,0],"
									     + "[4,1,0,0],"
									     + "[1,4,1,2]]");
		assertEquals(expected, result);
	}
	

	
	@Test
	public void next() {
		GameState state = new GameState(getSampleBoard());
		state.next(Action.DOWN);
		Board next = new Board(new int[][]{{0,0,0,0},{2,0,0,0},{4,1,0,0},{1,4,1,2}});
		assertEquals(state.getBoard().getEmptyFields().size(), next.getEmptyFields().size() - 1);
	}


	
	@Test
	public void Possible_Moves_None() {
		Board example =  Board.fromJSON( " [[1,2,3,4],"
									     + "[4,3,2,1],"
									     + "[1,2,3,4],"
									     + "[4,3,2,1]]");
		GameState state = new GameState(example);
		Set<Action> actions = state.getPossibleMoves();
		assertTrue(actions.isEmpty());
	}
	
	
	
	@Test
	public void Possible_Moves_Left_And_Right() {
		Board example =  Board.fromJSON( " [[1,2,3,3],"
									     + "[4,3,2,1],"
									     + "[1,2,3,4],"
									     + "[4,3,2,1]]");
		GameState state = new GameState(example);
		Set<Action> actions = state.getPossibleMoves();
		assertTrue(actions.equals(new HashSet<Action>(Arrays.asList(Action.LEFT, Action.RIGHT))));
	}
	
	@Test
	public void Possible_Moves_Up_And_Down() {
		Board example =  Board.fromJSON( " [[1,2,3,4],"
									     + "[1,3,2,1],"
									     + "[1,2,3,4],"
									     + "[4,3,2,1]]");
		GameState state = new GameState(example);
		Set<Action> actions = state.getPossibleMoves();
		assertTrue(actions.equals(new HashSet<Action>(Arrays.asList(Action.UP, Action.DOWN))));
	}
	
	@Test
	public void Possible_Moves_Only_Left() {
		Board example =  Board.fromJSON( " [[0,0,1,2],"
									     + "[0,0,3,4],"
									     + "[0,0,1,2],"
									     + "[0,0,3,4]]");
		GameState state = new GameState(example);
		Set<Action> actions = state.getPossibleMoves();
		assertTrue(actions.equals(new HashSet<Action>(Arrays.asList(Action.LEFT))));
	}
	
	@Test
	public void Possible_Moves_Only_Right() {
		Board example =  Board.fromJSON( " [[1,2,0,0],"
									     + "[4,3,0,0],"
									     + "[1,2,0,0],"
									     + "[4,3,0,0]]");
		GameState state = new GameState(example);
		Set<Action> actions = state.getPossibleMoves();
		assertTrue(actions.equals(new HashSet<Action>(Arrays.asList(Action.RIGHT))));
	}
	
	
	@Test
	public void Equal_True() {
		GameState state = new GameState(new Board(new int[][]{{1,2,0,0},{4,3,0,0},{1,2,0,0},{4,3,0,0}}), 5, Action.NIL);
		GameState other = new GameState(new Board(new int[][]{{1,2,0,0},{4,3,0,0},{1,2,0,0},{4,3,0,0}}), 5, Action.NIL);
		assertTrue(state.equals(other));
	}
	
	@Test
	public void Equal_False() {
		GameState state = new GameState(new Board(new int[][]{{1,2,0,0},{4,3,0,0},{1,2,0,0},{4,3,0,0}}), 5, Action.NIL);
		GameState other = new GameState(new Board(new int[][]{{1,1,0,0},{4,3,0,0},{1,2,0,0},{4,3,0,0}}), 5, Action.NIL);
		assertFalse(state.equals(other));
	}
	
	
	@Test
	public void Move_TEST() {
		Board b = getSampleBoard();
		GameState state = new GameState(b.copy());
		state = state.createNextGameState(Action.RIGHT);
		Board result = Eval.move(b.copy(), Action.RIGHT);
		assertArrayEquals(state.getBoard().getArray(), result.getArray());
	}
	
	

}
