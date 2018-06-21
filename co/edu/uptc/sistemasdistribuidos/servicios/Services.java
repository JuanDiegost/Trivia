package co.edu.uptc.sistemasdistribuidos.servicios;


import static spark.Spark.get;
import static spark.Spark.ipAddress;
import static spark.Spark.port;

public class Services {

    public static void main(String[] args){
        ipAddress("localhost");
        port(8181);

        get("/students", (req, res) -> {
            return "hello";
        });
    }
}
