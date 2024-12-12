//Sistema de Gestión de Recursos Educativos

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        // Crear instancias de profesores
        Profesor prof1 = new Profesor("Carlos Mendoza", "Ingenieria en Computacion");
        Profesor prof2 = new Profesor("Ana Ramirez", "Administracion de Empresas");

        // Crear instancias de cursos y asignarles un profesor
        Curso curso1 = new Curso("Matematicas", prof1);
        Curso curso2 = new Curso("Programacion", prof1);
        Curso curso3 = new Curso("Contabilidad", prof2);
        Curso curso4 = new Curso("Gestion Empresarial", prof2);

        // Crear instancias de estudiantes con su ID, nombre y promedio
        // Estudiantes para Ingeniería en Computación
        Estudiante est1 = new Estudiante(1, "Juan Perez", 80);
        Estudiante est2 = new Estudiante(2, "Ana Gomez", 60);
        Estudiante est3 = new Estudiante(3, "Luis Torres", 50);
        Estudiante est4 = new Estudiante(4, "Maria Lopez", 70);

        // Estudiantes para Administración de Empresas
        Estudiante est5 = new Estudiante(5, "Carlos Diaz", 90);
        Estudiante est6 = new Estudiante(6, "Laura Castillo", 75);
        Estudiante est7 = new Estudiante(7, "Sofia Herrera", 85);
        Estudiante est8 = new Estudiante(8, "Jorge Mendez", 45);

        // Crear carreras e incluirles estudiantes y cursos
        Carrera carrera1 = new Carrera("Ingenieria en Computacion");
        carrera1.agregarEstudiante(est1);
        carrera1.agregarEstudiante(est2);
        carrera1.agregarEstudiante(est3);
        carrera1.agregarEstudiante(est4);
        carrera1.agregarCurso(curso1);
        carrera1.agregarCurso(curso2);

        Carrera carrera2 = new Carrera("Administracion de Empresas");
        carrera2.agregarEstudiante(est5);
        carrera2.agregarEstudiante(est6);
        carrera2.agregarEstudiante(est7);
        carrera2.agregarEstudiante(est8);
        carrera2.agregarCurso(curso3);
        carrera2.agregarCurso(curso4);

        // Crear la universidad y agregar las carreras
        Universidad universidad = new Universidad();
        universidad.agregarCarrera(carrera1);
        universidad.agregarCarrera(carrera2);

        // Mostrar el menú de la universidad
        universidad.mostrarMenu();
    }
}
