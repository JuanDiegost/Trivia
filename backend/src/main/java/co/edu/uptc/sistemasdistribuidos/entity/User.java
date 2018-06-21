package co.edu.uptc.sistemasdistribuidos.entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "\"PlayerUser\"")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private String email;
    private String urlPhoto;
    private String password;
    private double ranking;
    @ManyToOne
    private Genre genre;
    private boolean administrator;
    @OneToMany
    private List<Game> gameList;

    public User() {
    }

    public User(String name, String email, String urlPhoto, String password, double ranking, Genre genre, boolean administrator, List<Game> gameList) {
        this.name = name;
        this.email = email;
        this.urlPhoto = urlPhoto;
        this.password = password;
        this.ranking = ranking;
        this.genre = genre;
        this.administrator = administrator;
        this.gameList = gameList;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUrlPhoto() {
        return urlPhoto;
    }

    public void setUrlPhoto(String urlPhoto) {
        this.urlPhoto = urlPhoto;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public double getRanking() {
        return ranking;
    }

    public void setRanking(double ranking) {
        this.ranking = ranking;
    }

    public Genre getGenre() {
        return genre;
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
    }

    public boolean getAdministrator() {
        return administrator;
    }

    public void setAdministrator(boolean administrator) {
        this.administrator = administrator;
    }

    public List<Game> getGameList() {
        return gameList;
    }

    public void setGameList(List<Game> gameList) {
        this.gameList = gameList;
    }
}
