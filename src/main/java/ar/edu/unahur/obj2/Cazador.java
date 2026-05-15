package ar.edu.unahur.obj2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public abstract class Cazador {
    
    protected String nombre;
    protected Integer cantidadDeExperiencia;
    protected Set<Profugo> profugosCapturados = new HashSet<Profugo>();

    public Boolean cazar() {
        return Boolean.TRUE;
    }


}