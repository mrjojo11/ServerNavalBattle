package Server.rest;

import Server.entity.Score;
import Server.service.ScoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

/**
 * The Score rest controller.
 */
@RestController
@RequestMapping("/score")
public class ScoreRestController {

    @Autowired
    private ScoreService scoreService;

    @GetMapping("/get/all")
    public List<Score> getScores() {
        return scoreService.getScores();
    }

    @GetMapping("/get/id/{scoreID}")
    public Score getScoreID(@PathVariable int scoreID) {
        Score theScore = scoreService.getScoreID(scoreID);
        return theScore;
    }

    @GetMapping("/get/name/{user_name}")
    public Score getScoreName(@PathVariable String user_name) {
        Score theScore = scoreService.getScoreName(user_name);
        return theScore;
    }

    @DeleteMapping("/delete/{scoreId}")
    public String deleteUser(@PathVariable int scoreId) {
        Score tempScore = scoreService.getScoreID(scoreId);
        scoreService.deleteScore(scoreId);
        return "Deleted score id - " + scoreId;
    }

    @PostMapping("/add")
    public Score addScore(@RequestBody Score theScore) {
        theScore.setId(0);
        scoreService.saveScore(theScore);
        return theScore;
    }

}
