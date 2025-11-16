public class Curso {
    private String nombreCurso;
    private Estudiante[] alumnos;
    private int cantidadAlumnos;

    public Curso(String nombreCurso, int capacidadMaxima) {
        this.nombreCurso = nombreCurso;
        this.alumnos = new Estudiante[capacidadMaxima];
        this.cantidadAlumnos = 0;
    }

    public void agregarAlumno(Estudiante e) {
        if (cantidadAlumnos < alumnos.length) {
            alumnos[cantidadAlumnos] = e;
            cantidadAlumnos++;
        } else {
            System.out.println("Curso lleno, no se puede agregar más alumnos.");
        }
    }

    public void listarAlumnos() {
        System.out.println("Alumnos del curso " + nombreCurso + ":");
        for (int i = 0; i < cantidadAlumnos; i++) {
            Estudiante e = alumnos[i];
            System.out.println("- " + e.getNombre() + " (nota: " + e.getNota() + ")");
        }
    }
}
