package co.edu.uptc.sistemasdistribuidos;

import org.mindrot.jbcrypt.BCrypt;

public class Utils {

    public static String encryptPassword(String originalPassword){
        String generatedSecuredPasswordHash = BCrypt.hashpw(originalPassword, BCrypt.gensalt(12));
        return generatedSecuredPasswordHash;
    }

    public static boolean validPassword(String hash,String password){
        return  BCrypt.checkpw(password, hash);
    }
}
