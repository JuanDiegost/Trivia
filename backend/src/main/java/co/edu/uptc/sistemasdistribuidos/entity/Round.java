package co.edu.uptc.sistemasdistribuidos.entity;

import javax.persistence.*;
import java.util.List;

@Entity
public class Round {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private Integer level;
    private Double timeLimit;

    @OneToMany
    private List<Question> questionList;

    public Round() {
    }

    public Round(String name, Integer level, Double timeLimit, List<Question> questionList) {
        this.name = name;
        this.level = level;
        this.timeLimit = timeLimit;
        this.questionList = questionList;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    public Double getTimeLimit() {
        return timeLimit;
    }

    public void setTimeLimit(Double timeLimit) {
        this.timeLimit = timeLimit;
    }

    public List<Question> getQuestionList() {
        return questionList;
    }

    public void setQuestionList(List<Question> questionList) {
        this.questionList = questionList;
    }
}
