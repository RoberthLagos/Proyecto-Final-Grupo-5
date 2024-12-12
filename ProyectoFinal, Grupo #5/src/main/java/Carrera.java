import java.util.ArrayList;

public class Carrera {
    private String nombre;
    private ArrayList<Estudiante> estudiantes;
    private ArrayList<Curso> cursos;

    /**
     * Constructor de la clase Carrera. Inicializa los atributos y las listas de estudiantes y cursos.
     *
     * @param nombre El nombre de la carrera.
     */
    public Carrera(String nombre) {
        this.nombre = nombre;
        this.estudiantes = new ArrayList<>(); // Lista para almacenar estudiantes
        this.cursos = new ArrayList<>(); // Lista para almacenar cursos
    }

    /**
     * Agrega un estudiante a la lista de estudiantes de la carrera.
     *
     * @param estudiante El estudiante a agregar.
     */
    public void agregarEstudiante(Estudiante estudiante) {
        estudiantes.add(estudiante);
    }

    /**
     * Elimina un estudiante de la lista de estudiantes de la carrera.
     *
     * @param estudiante El estudiante a eliminar.
     */
    public void eliminarEstudiante(Estudiante estudiante) {
        estudiantes.remove(estudiante);
    }

    /**
     * Agrega un curso a la lista de cursos de la carrera.
     *
     * @param curso El curso a agregar.
     */
    public void agregarCurso(Curso curso) {
        cursos.add(curso);
    }

    /**
     * Elimina un curso de la lista de cursos de la carrera.
     *
     * @param curso El curso a eliminar.
     */
    public void eliminarCurso(Curso curso) {
        cursos.remove(curso);
    }

    /**
     * Muestra la información de la carrera, incluyendo los cursos y los estudiantes.
     * @param incluirEstado Indica si se debe incluir la columna "Estado" en el reporte de estudiantes.
     */
    public void mostrarInformacion(boolean incluirEstado) {
        // Muestra el nombre de la carrera
        System.out.println("\n--- CARRERA: " + nombre + " ---");

        // Muestra los cursos de la carrera
        System.out.println("\nClases:");
        if (cursos.isEmpty()) {
            System.out.println("\nNo hay cursos registrados.");
        } else {
            System.out.printf("| %-20s | %-20s |\n", "Clases", "Profesor");
            for (Curso curso : cursos) {
                System.out.println(curso.toString()); // Muestra la información de cada curso
            }
        }

        // Muestra los estudiantes de la carrera
        System.out.println("\nEstudiantes:");
        if (estudiantes.isEmpty()) {
            System.out.println("\nNo hay estudiantes registrados.");
        } else {
            if (incluirEstado) {
                // Con estado
                System.out.printf("| %-10s | %-20s | %-10s | %-10s |\n", "ID", "Nombre", "Promedio", "Estado");
                for (Estudiante estudiante : estudiantes) {
                    System.out.println(estudiante.toString());
                }
            } else {
                // Sin estado
                System.out.printf("| %-10s | %-20s | %-10s |\n", "ID", "Nombre", "Promedio");
                for (Estudiante estudiante : estudiantes) {
                    System.out.printf("| %-10d | %-20s | %-10.2f |\n", 
                                      estudiante.getId(), estudiante.getNombre(), estudiante.getPromedio());
                }
            }
        }
    }

    // Getters para acceder a los atributos de la clase
    public String getNombre() {
        return nombre;
    }

    public ArrayList<Estudiante> getEstudiantes() {
        return estudiantes;
    }

    public ArrayList<Curso> getCursos() {
        return cursos;
    }

    // Setter opcional para cambiar el nombre de la carrera
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Busca un estudiante por su ID dentro de la carrera.
     *
     * @param id El ID del estudiante a buscar.
     * @return El estudiante con el ID correspondiente o null si no se encuentra.
     */
    public Estudiante buscarEstudiantePorId(int id) {
        for (Estudiante estudiante : estudiantes) {
            if (estudiante.getId() == id) {
                return estudiante;
            }
        }
        return null; // Retorna null si no se encuentra
    }

    /**
     * Busca un curso por su nombre dentro de la carrera.
     *
     * @param nombreCurso El nombre del curso a buscar.
     * @return El curso con el nombre correspondiente o null si no se encuentra.
     */
    public Curso buscarCursoPorNombre(String nombreCurso) {
        for (Curso curso : cursos) {
            if (curso.getNombre().equalsIgnoreCase(nombreCurso)) {
                return curso;
            }
        }
        return null; // Retorna null si no se encuentra
    }
}
