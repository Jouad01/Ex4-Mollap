package edu.poniperro.cliente;

import edu.poniperro.administrador.ProgramadorTasques;

public class Mollapp implements Client {

    private ProgramadorTasques programador = null;

    @Override
    public void setProgramadorTasques(ProgramadorTasques programador){
        this.programador = programador;
    }

    @Override
    public void enviarPeticion(String peticio) {
        
    }

    @Override
    public void enviarPeticio(String id){
        programador.executarTasques(id);
    }
}
