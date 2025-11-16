public class MyClass {
    public static void main(String args[]) {
        Curso curso = new Curso("POO", 3); // instanciación del curso

        Estudiante e1 = new Estudiante("Ana", 18);
        Estudiante e2 = new Estudiante("Juan", 19);
        Estudiante e3 = new Estudiante("Alberto", 20);

        curso.agregarAlumno(e1);
        curso.agregarAlumno(e2);
        curso.agregarAlumno(e3);

        // curso.agregarAlumno(new Estudiante("Carlos", 19));

        curso.listarAlumnos();
    }
}
