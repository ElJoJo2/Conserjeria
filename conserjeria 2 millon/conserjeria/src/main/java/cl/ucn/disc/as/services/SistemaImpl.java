package cl.ucn.disc.as.services;

import cl.ucn.disc.as.model.Edificio;
import cl.ucn.disc.as.model.exceptions.SistemaException;
import io.ebean.Database;
import lombok.extern.slf4j.Slf4j;
import org.jetbrains.annotations.NotNull;

import javax.persistence.PersistenceException;

@Slf4j
public class SistemaImpl implements Sistema {

    private final Database database;

    public SistemaImpl(Database database) {
        this.database = database;
    }


    @Override
    public Edificio add(@NotNull Edificio edificio) {
       try {
           this.database.save(edificio);
       } catch(PersistenceException ex) {
           //TODO: save the exception
           log.error("Error", ex);
           throw new SistemaException("Error al agregar un edificio", ex);
       }
        return edificio;
    }
}
