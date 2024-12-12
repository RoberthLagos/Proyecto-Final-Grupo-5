/**
 * Representa a un profesor con nombre y carrera.
 */
public class Profesor {
    private String nombre;  // Nombre del profesor
    private String carrera; // Carrera o área de especialización

    /**
     * Constructor que inicializa el nombre y la carrera del profesor.
     *
     * @param nombre  
     * @param carrera 
     */
    public Profesor(String nombre, String carrera) {
        this.nombre = nombre;
        this.carrera = carrera;
    }

    public String getNombre() {
        return nombre;
    }

    public String getCarrera() {
        return carrera;
    }
}
