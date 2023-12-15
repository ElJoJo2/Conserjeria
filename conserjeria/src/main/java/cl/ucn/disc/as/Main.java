 package cl.ucn.disc.as;


 import cl.ucn.disc.as.dao.PersonaFinder;
 import cl.ucn.disc.as.grpc.PersonaGrpcServiceImpl;
 import cl.ucn.disc.as.model.Contrato;
 import cl.ucn.disc.as.model.Edificio;
 import cl.ucn.disc.as.model.Persona;
 import cl.ucn.disc.as.services.Sistema;
 import cl.ucn.disc.as.services.SistemaImpl;
 import io.ebean.DB;
 import io.ebean.Database;

 import cl.ucn.disc.as.ui.ApiRestServer;
 import cl.ucn.disc.as.ui.WebController;
 import io.grpc.Server;
 import io.grpc.ServerBuilder;
 import lombok.extern.slf4j.Slf4j;
 import io.javalin.Javalin;

 import java.io.IOException;
 import java.sql.DatabaseMetaData;
 import java.text.DateFormat;
 import java.text.SimpleDateFormat;
 import java.util.Date;
 import java.util.Optional;

/**
 *The Main
 *@author Profesor Diego Urrutia-Astorga
  */
@Slf4j
public class Main {
    /**
    *The Main
     *
     * @param args to use.
     */
    public static void main(String[] args){

        log.debug("Starting Main..");

        log.debug("Starting Main..");

        //get the database
        Database db = DB.getDefault();

        Sistema sistema = new SistemaImpl(db);
        
        //Start the API Rest Server
        Javalin app = ApiRestServer.start(7070,new WebController());

        //start the gRPC server
        log.debug("Starting Grpc server");
        Server server = ServerBuilder
                .forPort(50123)
                .addService(new PersonaGrpcServiceImpl())
                .build();
        server.start();

        //shutdown hook
        Runtime.getRuntime().addShutdownHook(new Thread(Server::shutdown));

        server.awaitTermination();

        log.debug("Done. :)");

        /**Persona persona = Persona.builder()
                .rut("20600505-K")
                .nombre("Diego")
                .apellidos("Vera Santis")
                .email("diego@gmail.com")
                .telefono("123456789")
                .build();

        log.debug("The Persona before db: ${}", persona);

        //save into the database
        db.save(persona);

        log.debug("The Persona after db: ${}", persona);

        //finder de personas
        PersonaFinder pf = new PersonaFinder();
        Optional<Persona> oPersona = pf.byRut("999999");
        oPersona.ifPresent(p -> log.debug("Persona from db: {}", p));


        log.debug("Done. :)");**/

    }
}
