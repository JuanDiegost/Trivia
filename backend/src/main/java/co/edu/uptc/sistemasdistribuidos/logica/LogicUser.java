package co.edu.uptc.sistemasdistribuidos.logica;

import co.edu.uptc.sistemasdistribuidos.entity.Genre;
import co.edu.uptc.sistemasdistribuidos.entity.User;
import co.edu.uptc.sistemasdistribuidos.utils.Utils;
import co.edu.uptc.sistemasdistribuidos.dao.UserDao;

import javax.jws.soap.SOAPBinding;
import java.util.List;
import java.util.function.BinaryOperator;

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


    public List<User> getListUsers() {
        return UserDao.getInstance().getListUsers();
    }

    public static Object addUser(boolean administrator, String name, String phone, String email, String password, String img, String genre) {
        return null;
    }
}


