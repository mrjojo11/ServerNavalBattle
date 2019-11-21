package Server.service;

import Server.entity.Score;

import java.util.List;

public interface ScoreService {

    /**
     * Gets all scores.
     *
     * @return the scores
     */
    public List<Score> getScores();

    /**
     * Save a score.
     *
     * @param theScore the scorer
     */
    public Score saveScore(Score theScore);

    /**
     * Gets a score by the ID.
     *
     * @param theId the id
     * @return the score
     */
    public Score getScoreID(int theId);

    /**
     * Delete a score.
     *
     * @param theId the the id
     */
    public int deleteScore(int theId);

    /**
     * Gets user by the name.
     *
     * @param user_name the user name
     * @return the score
     */
    public Score getScoreName(String user_name);
}
