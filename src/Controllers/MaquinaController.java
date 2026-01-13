package Controllers;

import java.util.List;
import java.util.Set;

import models.Maquina;

public class MaquinaController {
    //Metodo que ordene un listado de maquinas
    //Por su subred y luego por el nombre
    //Si ambas son iguales se consideren maquinas
    //y se descarta

    public Set<Maquina> ordenarPorSubred(List<Maquina> maquinas){
        Set<Maquina> treeSet = new java.util.TreeSet<>();
        for(Maquina maquina : maquinas){
            treeSet.add(maquina);
        }
        return treeSet;
       

    }
    
}
