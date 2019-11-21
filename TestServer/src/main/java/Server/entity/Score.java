package Server.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

/**
 * The type Score.
 */
@Entity
@Table(name = "score")
public class Score implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;
    @Column(name = "user_name_entry")
    private String user_name;
    @Column(name = "score")
    private int score;


    /**
     * Instantiates a new User.
     */
    public Score() {
    }

    /**
     * Gets id.
     *
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * Sets id.
     *
     * @param id the id
     */
    public void setId(final int id) {
        this.id = id;
    }

    /**
     * Gets user name.
     *
     * @return the user name
     */
    public String getUser_name() {
        return user_name;
    }

    /**
     * Sets user name.
     *
     * @param user_name the user name
     */
    public void setUser_name(final String user_name) {
        this.user_name = user_name;
    }

    /**
     * Gets score.
     *
     * @return the score
     */
    public int getScore() {
        return score;
    }

    /**
     * Sets score.
     *
     * @param score the score
     */
    public void setScore(final int score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return "Score [id=" + id + ", user_name_entry="
                + user_name + ", score="
                + score + "]";
    }
}





