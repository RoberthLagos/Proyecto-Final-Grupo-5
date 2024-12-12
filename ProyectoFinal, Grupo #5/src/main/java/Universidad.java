import java.util.ArrayList;
import java.util.Scanner;

public class Universidad {
    private ArrayList<Carrera> carreras;

    public Universidad() {
        carreras = new ArrayList<>();
    }

    public void agregarCarrera(Carrera carrera) {
        carreras.add(carrera);
    }

    public void mostrarMenu() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n------------- MENU -------------");
            System.out.println("1. Mostrar informacion del Curso");
            System.out.println("2. Generar Reporte de Estudiantes");
            System.out.println("3. Salir");
            System.out.print("\nElija una opcion: ");
            int opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1:
                    mostrarInformacionCurso();
                    break;
                case 2:
                    generarReporte();
                    break;
                case 3:
                    System.out.println("\nSaliendo...");
                    System.exit(0);
                    break;
                default:
                    System.out.println("\nOpcion no valida. Intente de nuevo.");
            }
        }
    }

    private void mostrarInformacionCurso() {
    Scanner scanner = new Scanner(System.in);

    System.out.println("\n--- CARRERAS ---");
    // Muestra las carreras disponibles para que el usuario elija
    for (int i = 0; i < carreras.size(); i++) {
        System.out.println((i + 1) + ". " + carreras.get(i).getNombre());
    }

    System.out.print("Seleccione una carrera: ");
    int carreraSeleccionada = scanner.nextInt() - 1;

    if (carreraSeleccionada >= 0 && carreraSeleccionada < carreras.size()) {
        // Aquí pasamos true para incluir el estado de los estudiantes
        carreras.get(carreraSeleccionada).mostrarInformacion(true); // Para mostrar el estado
    } else {
        System.out.println("Carrera no valida.");
    }
}


    private void generarReporte() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("\n--- CARRERAS ---");
        for (int i = 0; i < carreras.size(); i++) {
            System.out.println((i + 1) + ". " + carreras.get(i).getNombre());
        }

        System.out.print("Seleccione una carrera para el reporte: ");
        int carreraSeleccionada = scanner.nextInt() - 1;

        if (carreraSeleccionada >= 0 && carreraSeleccionada < carreras.size()) {
            Reporte.generarReporte(carreras.get(carreraSeleccionada));
        } else {
            System.out.println("\nCarrera no valida.");
        }
    }
}
