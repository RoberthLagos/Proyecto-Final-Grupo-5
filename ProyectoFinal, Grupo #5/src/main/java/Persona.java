/**
 * Representa a una persona con un ID y un nombre.
 */
public class Persona {
    private int id;
    private String nombre;

    public Persona(int id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    @Override
    public String toString() {
        return "ID: " + id + ", Nombre: " + nombre;
    }
}
