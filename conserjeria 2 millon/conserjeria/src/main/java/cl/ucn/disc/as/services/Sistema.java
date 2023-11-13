package cl.ucn.disc.as.services;

import cl.ucn.disc.as.exceptions.SistemaException;
import cl.ucn.disc.as.model.Edificio;
import cl.ucn.disc.as.model.Persona;
import cl.ucn.disc.as.model.Departamento;
import cl.ucn.disc.as.model.Contrato;
import cl.ucn.disc.as.model.Pago;

import java.time.Instant;
import java.util.List;
import java.util.Optional;

public interface Sistema {

    /**
     * Agregar un edificio al sistema.
     */
    Edificio add(Edificio edificio) throws SistemaException;

    /**
     * Agregar una persona al sistema.
     */
    Persona add(Persona persona) throws SistemaException;

    /**
     * Agregar un departamento al sistema.
     */
    Departamento add(Departamento departamento) throws SistemaException;

    /**
     * Realizar un contrato entre una persona y un departamento en una fecha específica.
     */
    Contrato realizarContrato(Persona duenio, Departamento departamento, Instant fechaPago) throws SistemaException;

    /**
     * Obtener la lista de todos los contratos en el sistema.
     */
    List<Contrato> getContratos();

    /**
     * Obtener la lista de todas las personas en el sistema.
     */
    List<Persona> getPersonas();

    /**
     * Obtener la lista de pagos asociados a una persona por su RUT.
     */
    List<Pago> getPagos(String rut);
    Optional<Persona> getPersona(String rut);

    void populate();
}
