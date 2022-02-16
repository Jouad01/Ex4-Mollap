package edu.poniperro.administrador;

import edu.poniperro.filtres.Filtre;
import edu.poniperro.targets.Target;
import edu.poniperro.targets.Vehicle;

public class ProgramadorTasques {

    private Tasques tasques = null;

    public ProgramadorTasques(Target target){
        tasques = new Tasques();
        tasques.setTarget(target);
    }
    public Tasques getTasques(){
        return this.tasques;
    }

    public void setTasca(Filtre tasca) {
        getTasques().afegirTasca(tasca);
    }

    public void executarTasques(String missatge){
        tasques.execucio(missatge);
    }


}
