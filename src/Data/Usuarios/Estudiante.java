package Data.Usuarios;
import java.util.Scanner;
public class Estudiante {
    public String Efacultad;
    public String Ecarrera;
    public Estudiante(){
        Efacultad="";
        Ecarrera="";
    }
    public Estudiante (String facultad, String carrera )
    { 
    Efacultad= facultad;
    Ecarrera=carrera;
    }// Final del Constructor de Estudiante
    public void Carga(){
     Scanner text = new Scanner (System.in);
        System.out.print("Ingrese Facultad: ");
        Efacultad = text.nextLine();
        System.out.print("Ingrese Carrera: ");
        Ecarrera = text.nextLine();
     }
}
