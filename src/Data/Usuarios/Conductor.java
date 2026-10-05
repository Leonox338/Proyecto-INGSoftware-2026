package Data.Usuarios;
import java.util.Scanner;
public class Conductor {
public String CMatricula;    
    public Conductor( ){
        CMatricula="";
    }
    public Conductor( String lic)
    {
    CMatricula = lic;
    }
    public void Carga(){
     Scanner text = new Scanner (System.in);
        System.out.print("Es Verdad que el conductor tiene licencia: ");
        CMatricula=text.nextLine();
     }
}
