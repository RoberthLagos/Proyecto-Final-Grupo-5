/**
 * Representa un curso con un nombre y un profesor asignado.
 */
public class Curso {
    private String nombre;    // Nombre del curso
    private Profesor profesor; // Profesor encargado del curso

    /**
     * Constructor que inicializa el curso con su nombre y profesor.
     *
     * @param nombre   Nombre del curso.
     * @param profesor Profesor encargado del curso.
     */
    public Curso(String nombre, Profesor profesor) {
        this.nombre = nombre;
        this.profesor = profesor;
    }

    public String getNombre() {
        return nombre;
    }

    public Profesor getProfesor() {
        return profesor;
    }

    /**
     * Devuelve una representación formateada del curso.
     *
     * @return Información del curso en formato tabular.
     */
    @Override
    public String toString() {
        return String.format("| %-20s | %-20s |", nombre, profesor.getNombre());
    }
}
