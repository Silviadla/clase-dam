public class Alumno {

    // el nombre completo del alumno
    private String nombre;
    // el numero de matricula
    private String numeroMatricula;
    // la edad del alumno
    private int edad;

    /**
     * Crea un alumno nuevo
     */
    public Alumno(String nombreCompleto, String numeroMatriculaAlumno, int edadAlumno) {
        nombre = nombreCompleto;
        numeroMatricula = numeroMatriculaAlumno;
        edad = edadAlumno;
        if (nombre.length() < 3){
            System.out.println("No se puede realizar el proceso, debido a que la longitud del nombre es erronea");
        }
        if (numeroMatricula.length() < 4){
            System.out.println("No se puede realizar el proceso, debido a que la longitud de la matr�cula es erronea");
        }
    }

    /**
     * Devuelve el nombre completo del alumno
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Cambia el nombre del alumno
     */
    public void cambiarnombre(String nuevoNombre) {
        nombre = nuevoNombre;
    }

    /**
     * Imprime por pantalla los detalles del alumno
     */
    public void imprimeDetalles() {
        System.out.println(nombre + " (" + numeroMatricula + ") - " + edad + " años");
    }

    /**
     * Devuelve el nombre de usuario que el alumno debe configurar
     * en su cuenta de Github en formato de 7 caracateres
     */
    public String getNombreUsuarioGithub() {
        int lenMatricula = numeroMatricula.length();
        int lenNombre= nombre.length();
        String nombreGithub= null;
        if(lenNombre < 3){
            nombreGithub = nombre.substring(0, lenNombre) + numeroMatricula.substring(0,lenMatricula );
        }
        if(lenMatricula < 4)
        {
            nombreGithub = nombre.substring(0, lenNombre) + numeroMatricula.substring(0,lenMatricula );
        }
        else if(lenNombre < 3){
            nombreGithub = nombre.substring(0, lenNombre) + numeroMatricula.substring(0, 4);
        }
        else if(lenMatricula < 4){
            nombreGithub = nombre.substring(0, 3) + numeroMatricula.substring(0, lenMatricula);
        }
        else{
            nombreGithub = nombre.substring(0, 3) + numeroMatricula.substring(0, 4);
        }
    
        return nombreGithub;
    }
}
