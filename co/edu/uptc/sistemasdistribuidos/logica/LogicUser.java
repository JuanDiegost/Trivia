package co.edu.uptc.sistemasdistribuidos.logica;

import co.edu.uptc.sistemasdistribuidos.Entity.Genre;
import co.edu.uptc.sistemasdistribuidos.Entity.User;
import co.edu.uptc.sistemasdistribuidos.Utils;
import co.edu.uptc.sistemasdistribuidos.dao.UserDao;

public class LogicUser {
    private static LogicUser ourInstance = new LogicUser();

    public static LogicUser getInstance() {
        return ourInstance;
    }

    private LogicUser() {
    }

    public User singIn(String name, String email, String urlPhoto, String password, Genre genre, boolean administrator){
        User user = UserDao.getInstance().createUser(name,email,urlPhoto, Utils.encryptPassword(password),genre,administrator);
        //ToDo Add data base user
        return user;
    }


}


