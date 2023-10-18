package cl.ucn.disc.as.model;

import io.ebean.annotation.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.ToString;

import javax.persistence.Entity;


@ToString(callSuper = true)
@AllArgsConstructor
@Builder
@Entity
public class Edificio extends BaseModel{

    /**
     * Nombre
     */
    @Getter
    @NotNull
    private String nombre;

    /**
     * Direccion
     */
    @Getter
    @NotNull
    private String direccion;


}
