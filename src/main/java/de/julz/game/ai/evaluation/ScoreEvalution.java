package de.julz.game.ai.evaluation;

import de.julz.game.model.GameState;

public class ScoreEvalution extends Evaluation{

	
	@Override
	public double getScore(GameState state) {
		return state.getScore();
	}

}
