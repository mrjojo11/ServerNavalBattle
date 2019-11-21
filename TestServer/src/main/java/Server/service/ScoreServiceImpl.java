package Server.service;

import Server.dao.ScoreDAO;
import Server.dao.UserDAO;
import Server.entity.Score;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Service
public class ScoreServiceImpl implements ScoreService {

    @Autowired
    private ScoreDAO scoreDAO;

    @Override
    @Transactional
    public List<Score> getScores() {
        return scoreDAO.getScores();
    }

    @Override
    @Transactional
    public Score saveScore(Score theScore) {
        scoreDAO.saveScore(theScore);
        return theScore;
    }

    @Override
    @Transactional
    public Score getScoreID(int theId) {
        return scoreDAO.getScoreID(theId);
    }

    @Override
    @Transactional
    public int deleteScore(int theId) {
        scoreDAO.deleteScore(theId);
        return theId;
    }

    @Override
    @Transactional
    public Score getScoreName(String user_name) {
        return scoreDAO.getScoreName(user_name);
    }
}
