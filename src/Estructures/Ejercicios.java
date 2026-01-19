package Estructures;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class Ejercicios {

    public Map<Integer,Integer> contarDuplicados(List<Integer> list){
        Map<Integer, Integer> Conteo = new HashMap<>();
      for(Integer num: list){
        Conteo.put(num, Conteo.getOrDefault(num, 0)+1);

      }
        
        return Conteo;
    }

    public Integer primerNoRepetido(List<Integer> list) {
    Map<Integer, Integer> conteo = new HashMap<>();
    
    
    for (Integer num : list) {
        conteo.put(num, conteo.getOrDefault(num, 0) + 1);
    }
    
    
    for (Integer num : list) {
        if (conteo.get(num) == 1) {
            return num;
        }
    }
    
    
    return null;    
}
    

    public Map<String, Integer> RankingPuntajes(List<String[]> jugadores) {
    Map<String, Integer> conteo = new HashMap<>();
    for (String[] jugador : jugadores) {
        String nombre = jugador[0];
        int puntaje = Integer.parseInt(jugador[1]);
        conteo.put(nombre, Math.max(conteo.getOrDefault(nombre, 0), puntaje));
    }
    Map<String, Integer> ranking = new TreeMap<>(
        (j1, j2) -> {
            int cmp = conteo.get(j2).compareTo(conteo.get(j1));
            if (cmp == 0) return j1.compareTo(j2); 
            return cmp;
        }
    );
    ranking.putAll(conteo);
    return ranking;
}
}
    




 

