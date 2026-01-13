package models;

import java.util.List;

public class Maquina  implements Comparable<Maquina> {
    private String nombre;
    private String ip;
    private List<Integer> codigos;
    private int subred;
    private int riesgo;
    public Maquina(String nombre, String ip, List<Integer> codigos) {
        this.nombre = nombre;
        this.ip = ip;
        this.codigos = codigos;
        this.subred = calcularSubred();
    }
    public String getNombre() {
        return nombre;
    }
    public String getIp() {
        return ip;
    }
    public List<Integer> getCodigos() {
        return codigos;
    }
    public int getSubred() {
        return subred;
    }
    public int getRiesgo() {
        return riesgo;
    }
    
    private int calcularSubred(){
        String[] octetos = ip.split("\\.");
        String subred = octetos[2]
;        return Integer.parseInt(subred);
        


    }

    private int calcularRiesgo(){
        return 0;



    }
    @Override
    public int compareTo(Maquina o) {
        //comparar por subred
        int com = Integer.compare(this.subred, o.getSubred());
        if(com!=0) return com;
        return this.nombre.compareTo(o.getNombre());
        //si son iguales comparar por nombre



        
        
       
    }
    @Override
    public String toString() {
        return "Maquina [nombre=" + nombre + ", ip=" + ip + ", codigos=" + codigos + ", subred=" + subred + ", riesgo="
                + riesgo + "]";
    }
    

}
