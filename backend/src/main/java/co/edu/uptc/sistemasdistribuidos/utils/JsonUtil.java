package co.edu.uptc.sistemasdistribuidos.utils;

import com.google.gson.Gson;
import spark.ResponseTransformer;

/**
 *
 * @author Juan Molina
 */
public class JsonUtil {

    /**
     *
     * @param object
     * @return a String representation of an object in JSON format
     */
    public static String toJson(Object object) {
        return new Gson().toJson(object);
    }

    /**
     *
     * @return A response transformer object that contains a string
     *          representation of a persisted object
     */
    public static ResponseTransformer json() {
        return JsonUtil::toJson;
    }
}