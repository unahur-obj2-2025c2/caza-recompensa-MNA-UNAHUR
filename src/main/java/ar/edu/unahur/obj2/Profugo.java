package ar.edu.unahur.obj2;

public class Profugo {
    private String nombre;
    private Integer nivelInocencia;
    private Integer nivelHabilidad;
    private Boolean esNervioso;

    public Profugo(String nombre, Integer nivelInocencia, private Integer nivelHabilidad, Boolean esNervioso){
        this.nombre = nombre;
        this.nivelInocencia = nivelInocencia;
    }

    public void setNivelDeInocencia(Integer nivelInocencia){
        /*
        No puede menor a cero -> (NULL, -), 0, +
         */
        if (nivelInocencia == null) {
            throw new NullPointerException("El nivel de inocencia no puede ser nulo");
        }

        if(!validarInocencia(nivelInocencia)){
            throw new IllegalArgumentException("El nivel de inocencia debe estar entre 0 y 100");
        }
        this.nivelInocencia = nivelInocencia;
    }

    private Boolean validarInocencia(Integer nivelInocencia) {
        return (nivelInocencia >=0 && nivelInocencia <= 100);
    }


}
