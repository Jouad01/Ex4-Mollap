package edu.poniperro.filtres;

public class Autenticacio implements Filtre{
    public Autenticacio() {}

    @Override
    public void execucio(String id){
        System.out.println("Autenticación OK para" + id.toString());
    }
}
