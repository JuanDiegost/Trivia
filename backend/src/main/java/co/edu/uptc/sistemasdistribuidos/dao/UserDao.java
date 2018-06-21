package co.edu.uptc.sistemasdistribuidos.dao;

import co.edu.uptc.sistemasdistribuidos.entity.Genre;
import co.edu.uptc.sistemasdistribuidos.entity.User;
import co.edu.uptc.sistemasdistribuidos.utils.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;
import java.util.ArrayList;
import java.util.List;

public class UserDao {
    private static UserDao ourInstance = new UserDao();

    public static UserDao getInstance() {
        return ourInstance;
    }

    private Session sessionHibernate;
    private Transaction tx;

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

    public User saveUser(User user){
        sessionHibernate = HibernateUtil.getSessionFactory().openSession();
        tx = sessionHibernate.beginTransaction();
        sessionHibernate.save(user);
        tx.commit();
        sessionHibernate.close();
        return user;
    }


    public List<User> getListUsers() {
        sessionHibernate = HibernateUtil.getSessionFactory().openSession();
        System.out.println("PlayerUser");
        List<User> list = sessionHibernate.createQuery("from " + User.class.getName()).list();
        sessionHibernate.close();
        return list;
    }
}