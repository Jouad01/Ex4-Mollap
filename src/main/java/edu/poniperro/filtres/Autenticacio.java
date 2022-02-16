package edu.poniperro.filtres;

public class Autentificacion implements Filtre{
    public Autentificacion() {}

    @Override
    public void execucio(String id){
        System.out.println("Se ha autentificado correctamente" + id.toString());
    }
}
