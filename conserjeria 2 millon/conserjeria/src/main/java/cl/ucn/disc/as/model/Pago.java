package cl.ucn.disc.as.model;

import io.ebean.annotation.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.ToString;

import java.util.List;

import javax.persistence.Entity;
import java.time.Instant;


/*
 * The Pago Class
 */
@Entity
public class Pago extends BaseModel{

    /**
     * fecha de pago
     */
    @NotNull
    private Instant fechaPago;

    /**
     * monto
     */
    @NotNull
    private Integer monto;

   public Pago(Instant fechaPago, Integer monto){
        this.fechaPago = fechaPago;
        this.monto = monto;
   }

    public Instant getFechaPago(){
        return fechaPago;
    }

    public Integer getMonto(){
        return monto;
    }


}