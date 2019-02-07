/**
 * Created by alumno on 07/02/2019.
 */
public class Alumno {
    //Atributos
    static int MAX=5;
    private String nombre;
    private String apellidos;
    private String matricula;
    private double calificacion;
    private String [] asignaturas;
    private int numAsig;

    //Constructor
    public Alumno() {
        this.nombre="";
        this.apellidos="";
        this.matricula="";
        this.calificacion=0;
        this.numAsig=0;
        this.asignaturas=new String[MAX];

    }

    public Alumno(String apellidos, String nombre, String matricula, double calificacion) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.matricula = matricula;
        this.calificacion = calificacion;
        this.asignaturas=new String[MAX];
        this.numAsig=0;
    }
    //Getters y setters
    public String getNombre() {
        return nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public String getMatricula() {
        return matricula;
    }

    public double getCalificacion() {
        return calificacion;
    }

    public int getNumAsig() {
        return numAsig;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public void setCalificacion(double calificacion) {
        this.calificacion = calificacion;
    }

    //Métodos
    public void anadirAsignatura(String asig){
        if (numAsig<5) {
            asignaturas[numAsig] = asig;
            numAsig++;
        }
        else
            System.out.println("No es posible añadir mas asignaturas");

    }
    public void mostrarAsignaturas(){
        if (numAsig==0)
            System.out.println("El alumno no está matriculado en ninguna asignatura");
        else {
            for (int i = 0; i < numAsig; i++) {

                System.out.println("- " + asignaturas[i]);
            }
        }
    }
    public void mostrarAlumno(){
        System.out.println(getApellidos() + ", " + getNombre() + ". Matr: " + getMatricula() + "(" + getCalificacion() + ")");
        mostrarAsignaturas();
    }




}
