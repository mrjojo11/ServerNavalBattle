package Server.dao;

import Server.entity.Score;
import Server.entity.User;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * The type Score dao.
 */
@Repository
public class ScoreDAOImpl implements ScoreDAO {

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public List<Score> getScores() {
        Session currentSession
                = sessionFactory.getCurrentSession();
        Query<Score> theQuery =
                currentSession.createQuery(
                        "from Score order by id",
                        Score.class);
        List<Score> scores = theQuery.getResultList();
        return scores;
    }

    @Override
    public Score saveScore(Score theScore) {
        Session currentSession
                = sessionFactory.getCurrentSession();
        currentSession.saveOrUpdate(theScore);
        return theScore;
    }

    @Override
    public Score getScoreID(int theId) {
        Session currentSession = sessionFactory.getCurrentSession();
        Score theScore = currentSession.get(Score.class, theId);
        return theScore;
    }

    @Override
    public int deleteScore(int theId) {
        Session currentSession
                = sessionFactory.getCurrentSession();
        Query theQuery =
                currentSession.createQuery(
                        "delete from Score where id=:scoreId");
        theQuery.setParameter("scoreId", theId);
        theQuery.executeUpdate();
        return theId;
    }

    @Override
    public Score getScoreName(String user_name) {
        Session currentSession = sessionFactory.getCurrentSession();
        Query query = currentSession.createSQLQuery(
                "select * from score where user_name_entry=:user_name")
                .addEntity(Score.class).
                        setParameter(
                                "user_name", user_name);
        List<Score> scores = query.getResultList();
        Score theScore = scores.get(0);
        return theScore;
    }
}
