public class Reporte {

    public static void generarReporte(Carrera carrera) {
        System.out.println("\n\n--- REPORTE DE ESTUDIANTES DE LA CARRERA: " + carrera.getNombre() + " ---");

        System.out.println("\nCursos:");
        System.out.printf("| %-20s | %-20s |\n", "Curso", "Profesor");
        for (Curso curso : carrera.getCursos()) {
            System.out.println(curso.toString());
        }

        System.out.println("\nEstudiantes:");
        System.out.printf("| %-10s | %-20s | %-10s | %-10s |\n", "ID", "Nombre", "Promedio", "Estado");
        for (Estudiante estudiante : carrera.getEstudiantes()) {
            System.out.println(estudiante.toString());
        }
    }
}
