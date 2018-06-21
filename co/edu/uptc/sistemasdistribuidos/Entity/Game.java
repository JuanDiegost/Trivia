package co.edu.uptc.sistemasdistribuidos.Entity;

import javax.persistence.*;

@Entity
public class Game {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private Double time;
    private int point;
    private int questionsCorrect;
    private int questionsIncorrect;
    @ManyToOne
    private Round round;

    public Game() {
    }

    public Game(Double time, int point, int questionsCorrect, int questionsIncorrect, Round round) {
        this.time = time;
        this.point = point;
        this.questionsCorrect = questionsCorrect;
        this.questionsIncorrect = questionsIncorrect;
        this.round = round;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Double getTime() {
        return time;
    }

    public void setTime(Double time) {
        this.time = time;
    }

    public int getPoint() {
        return point;
    }

    public void setPoint(int point) {
        this.point = point;
    }

    public int getQuestionsCorrect() {
        return questionsCorrect;
    }

    public void setQuestionsCorrect(int questionsCorrect) {
        this.questionsCorrect = questionsCorrect;
    }

    public int getQuestionsIncorrect() {
        return questionsIncorrect;
    }

    public void setQuestionsIncorrect(int questionsIncorrect) {
        this.questionsIncorrect = questionsIncorrect;
    }

    public Round getRound() {
        return round;
    }

    public void setRound(Round round) {
        this.round = round;
    }
}
