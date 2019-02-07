/**
 * Created by alumno on 07/02/2019.
 */
public class Principal {
    public static void main(String[] args) {
        Alumno alumno0= new Alumno("Arias Gonzalez","Felipe","aa1253",3.50);
        Alumno alumno1= new Alumno( "Garcia Sacedón", "Manuel", "ax0074", 8.35);
        Alumno alumno2= new Alumno("Lopez Medina", "Margarita", "mj7726",7.70);
        Alumno alumno3=new Alumno("Sanchez Arellano", " Estela", "bc2658", 6.75);


        alumno3.anadirAsignatura("Fisica");
        alumno3.anadirAsignatura("Algebra");
        System.out.println("------------------");
        alumno3.mostrarAsignaturas();
        System.out.println("------------------");
        alumno0.mostrarAlumno(); //No muestra asignaturas
        System.out.println("------------------");
        alumno3.mostrarAlumno();
        System.out.println("***********************************************************************");

        GrupoAlumnos grupo1 = new GrupoAlumnos(20, "g1");

        grupo1.insertarAlumno(alumno0);//Se accede siempre por el nombre del objeto
        grupo1.insertarAlumno(alumno1);
        grupo1.insertarAlumno(alumno2);
        grupo1.insertarAlumno(alumno3);

        Alumno victor=new Alumno("Alcaraz Lopez", "Victor", "bp0196", 10.0);

        grupo1.insertarAlumno(victor);

        victor.anadirAsignatura("Est. Datos");
        victor.anadirAsignatura("Algebra");

        grupo1.mostrarGrupo();




    }

}
