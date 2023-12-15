package cl.ucn.disc.as.model;

import cl.ucn.disc.as.exceptions.IllegalDomainException;
import cl.ucn.disc.as.utils.ValidationUtils;
import io.ebean.annotation.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.ToString;

import javax.persistence.Entity;


/*
 * The Departamento Class
 */
@ToString(callSuper = true)
@Builder
@Entity
public class Departamento extends BaseModel {

    /**
     * Numero de departamento
     */
    private Integer numero;

    /**
     * Piso en que se encuentra
     */
    private Integer piso;

    public Departamento(Integer numero, Integer piso){
        this.numero = numero;
        this.piso = piso;
    }

    public Integer getNumero(){
        return numero;
    }

    public Integer getPiso(){
        return piso;
    }
}
