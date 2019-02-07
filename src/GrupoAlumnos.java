/**
 * Created by alumno on 07/02/2019.
 */


//Atributos
public class GrupoAlumnos {
    private Alumno [] ListaAlumnos;
    private int numAlumnos;
    private int maximo;
    private String nombre;

 //Constructores

    //Hace un grupo vacio con numeor de alumnos=10
    public GrupoAlumnos() {
        this.nombre="GrupoDesconocido";
        this.maximo=10;
        this.numAlumnos=0;
        this.ListaAlumnos= new Alumno [maximo]; //Al hacer el new es de tipo alumno pq llama a la clase del otro fichero
    }

    public GrupoAlumnos(int max, String nom) {
        this.maximo = max;
        this.nombre = nom;
        this.numAlumnos=0;
        this.ListaAlumnos= new Alumno[maximo];

    }

    public int getNumAlumnos() {
        return numAlumnos;
    }

    public int getMaximo() {
        return maximo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    //Metodos
    public Alumno alumnoPos(int i){
        return ListaAlumnos[i];
    }
    public boolean insertarAlumno(Alumno a){
        if (numAlumnos<maximo) {
            ListaAlumnos[numAlumnos] = a;
            numAlumnos++;
            return true;
        }
        else
            return false;

    }

     public void mostrarGrupo(){
         System.out.println(getNombre());
         for (int i = 0; i < numAlumnos; i++) {
             ListaAlumnos[i].mostrarAlumno();

         }
    }
}
