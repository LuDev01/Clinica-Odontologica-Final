package BackEndC3.ClinicaOdontologica.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Odontologo {
    private Integer id;
    private Integer numeroMatricula;
    private String nombre;
    private String apellido;


    public Odontologo(Integer id, Integer numeroMatricula, String nombre, String apellido) {
        this.id = id;
        this.numeroMatricula = numeroMatricula;
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public Odontologo(Integer numeroMatricula, String nombre, String apellido) {
        this.numeroMatricula = numeroMatricula;
        this.nombre = nombre;
        this.apellido = apellido;
    }


}