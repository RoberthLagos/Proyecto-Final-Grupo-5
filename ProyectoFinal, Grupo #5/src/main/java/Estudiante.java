/**
 * Representa a un estudiante con ID, nombre, promedio y estado de aprobación.
 */
public class Estudiante {
    private int id;           // Identificador único
    private String nombre;    // Nombre del estudiante
    private double promedio;  // Promedio de calificaciones
    private boolean aprobado; // Indica si el estudiante está aprobado

    /**
     * Constructor que inicializa los datos del estudiante 
     * y define su estado de aprobación (>= 60).
     */
    public Estudiante(int id, String nombre, double promedio) {
        this.id = id;
        this.nombre = nombre;
        this.promedio = promedio;
        this.aprobado = promedio >= 60;
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPromedio() {
        return promedio;
    }

    /**
     * Indica si el estudiante está aprobado.
     * 
     * @return true si el promedio es >= 60, de lo contrario false.
     */
    public boolean isAprobado() {
        return aprobado;
    }

    /**
     * Devuelve una representación formateada del estudiante.
     */
    @Override
    public String toString() {
        return String.format("| %-10d | %-20s | %-10.2f | %-10s |", 
                              id, nombre, promedio, 
                              (aprobado ? "Aprobado" : "Reprobado"));
    }
}
