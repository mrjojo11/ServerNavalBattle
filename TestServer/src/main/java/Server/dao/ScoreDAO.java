package Server.dao;

import Server.entity.Score;
import Server.entity.User;

import java.util.List;

public interface ScoreDAO {

    /**
     * Gets all scores.
     *
     * @return the scores
     */
    List<Score> getScores();

    /**
     * Save a score.
     *
     * @param theScore the scorer
     */
    Score saveScore(Score theScore);

    /**
     * Gets a score by the ID.
     *
     * @param theId the id
     * @return the score
     */
    Score getScoreID(int theId);

    /**
     * Delete a score.
     *
     * @param theId the the id
     */
    int deleteScore(int theId);

    /**
     * Gets user by the name.
     *
     * @param user_name the user name
     * @return the score
     */
    Score getScoreName(String user_name);
}
