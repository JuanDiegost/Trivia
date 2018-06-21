package co.edu.uptc.sistemasdistribuidos.dao;

import co.edu.uptc.sistemasdistribuidos.Entity.Genre;
import co.edu.uptc.sistemasdistribuidos.Entity.User;

import java.util.ArrayList;

public class UserDao {
    private static UserDao ourInstance = new UserDao();

    public static UserDao getInstance() {
        return ourInstance;
    }

    private UserDao() {
    }

    /**
     * Return new User
     * @param name name of new user
     * @param email email of new user
     * @param urlPhoto url image of new user
     * @param password password encrypted off new user
     * @param genre genre of new user
     * @param administrator administrator info, true if he user is administrator or false if he is'nt administrator
     * @return the new user created
     */
    public User createUser(String name, String email, String urlPhoto, String password, Genre genre, boolean administrator){
        return new User(name,email,urlPhoto,password,0,genre,administrator,new ArrayList<>());
    }



}
