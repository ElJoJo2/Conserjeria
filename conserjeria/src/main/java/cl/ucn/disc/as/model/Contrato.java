package cl.ucn.disc.as.model;

import cl.ucn.disc.as.exceptions.IllegalDomainException;
import cl.ucn.disc.as.utils.ValidationUtils;
import io.ebean.annotation.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.ToString;

import java.time.Instant;
import java.util.List;

import javax.persistence.Entity;


/*
 * The Contrato Class
 */
@ToString(callSuper = true)
@Entity
public class Contrato extends BaseModel {

    /*
     * fecha de pago
     */
    @NotNull
    private Instant fechaPago;

    /*
     * persona del contrato
     */
    @NotNull
    private Persona persona;

    /*
     * Departamento del contrato
     */
    @NotNull
    private Departamento departamento;

    /*
     * Lista de pagos
     */
    private List<Pago> pagos;

    public Contrato(Persona persona, Departamento departamento, Instant fechaPago){
        this.persona = persona;
        this.departamento = departamento;
        this.fechaPago = fechaPago;
    }

    public Instant getFechaPago(){
        return fechaPago;
    }

    public Persona getPersona(){
        return persona;
    }

    public Departamento getDepartamento(){
        return departamento;
    }

    public List<Pago> getPagos(){
        return pagos;
    }
}
