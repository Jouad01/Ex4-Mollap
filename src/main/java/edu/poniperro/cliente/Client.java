package edu.poniperro.cliente;

import edu.poniperro.administrador.ProgramadorTasques;

public interface Client {
    void setProgramadorTasques(ProgramadorTasques programador);

    void enviarPeticion(String peticio);

    void enviarPeticio(String id);
}
