package edu.poniperro.filtres;

public class Autorizacion implements Filtre {
    public Autorizacion(){}

    @Override
    public void execucio(String id){
        System.out.println("Se ha autorizado correctamente" + id.toString());
    }
}
