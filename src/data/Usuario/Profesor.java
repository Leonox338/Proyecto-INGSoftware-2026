package data.Usuario;

import java.util.Scanner;

public class Profesor {
    public String Pfacultad;
    public String PCarrera;
    public String PMateria;
    public Profesor ( )
    {
    Pfacultad= "";
    PCarrera="";
    PMateria="";
    }//
    public Profesor (String Facultad, String Carrera, String Materia )
    {
    Pfacultad= Facultad;
    PCarrera=Carrera;
    PMateria=Materia;
    }// Final del Constructin del constructor  
    public void Carga(){
     Scanner text = new Scanner (System.in);
        System.out.print("Ingrese Facultad: ");
        Pfacultad = text.nextLine();
        System.out.print("Ingrese Carrera: ");
        PCarrera = text.nextLine();
        System.out.print("Ingrese Materia que Dicta: ");
        PMateria = text.nextLine();
     }
}
