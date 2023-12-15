package cl.ucn.disc.as.model;

import io.ebean.annotation.NotNull;
import lombok.*;

import java.util.List;

import javax.persistence.Entity;


/**
 * The Edificio class
 */
@ToString(callSuper = true)
@AllArgsConstructor
@Builder
@Entity
@Getter
@Setter
//como funciona el setter
public class Edificio extends BaseModel {

    /**
     * The Name
     */
    @NotNull
    private String nombre;

    /**
     * The direccion
     */
    @NotNull
    private String direccion;

    private List<Departamento> departamentos;

    public Edificio(String nombre, String direccion) {
        this.nombre = nombre;
        this.direccion = direccion;
    }

    public void addDepartamento(Departamento departamento) {
        departamentos.add(departamento);
    }
}
