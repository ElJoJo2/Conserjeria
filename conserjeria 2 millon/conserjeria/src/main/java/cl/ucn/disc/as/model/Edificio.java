package cl.ucn.disc.as.model;

import io.ebean.annotation.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.ToString;

import java.util.List;

import javax.persistence.Entity;


/**
 * The Edificio class
 */
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

    /**
     * Departamentos
     */
    @Getter
    @NotNull
    private List<Departamento> departamentos;

    public Edificio(String nombre, String direccion){
        this.nombre = nombre;
        this.direccion = direccion;
    }

    public String getNombre(){
        return nombre;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public String getDireccion(){
        return direccion;
    }

    public void setDireccion(String direccion){
        this.direccion = direccion;
    }

    public void addDepartamento(Departamento departamento){
        departamentos.add(departamento);
    }

    public List<Departamento> getDepartamentos(){
        return departamentos;
    }

}
