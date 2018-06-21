package co.edu.uptc.sistemasdistribuidos.servicios;


import co.edu.uptc.sistemasdistribuidos.logica.LogicUser;
import co.edu.uptc.sistemasdistribuidos.utils.JsonUtil;

import static spark.Spark.*;

public class Services {

    public static void main(String[] args){
        ipAddress("localhost");
        port(8181);

        get("/students", (req, res) ->
            LogicUser.getInstance().getListUsers(), JsonUtil.json()
        );

        post("/singup",(req,res)->{
            LogicUser.addUser( req.queryParams("administrator").equals("true"),
                    req.queryParams("name"),
                    req.queryParams("phone"),
                    req.queryParams("email"),
                    req.queryParams("password"),
                    req.queryParams("img"),
                    req.queryParams("genre")), JsonUtil.json());
        });

        post("/addGenre",((request, response) ->

        ));


    }
}
