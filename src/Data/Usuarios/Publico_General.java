package Data.Usuarios;

import java.util.Scanner;

public class Publico_General {
    public String PGDireccion;
    public Publico_General( ){
    PGDireccion="";
    }
    public Publico_General( String direccion){
    PGDireccion=direccion;
    }
    public void Carga(){
     Scanner text = new Scanner (System.in);
        System.out.print("ingrese direccion: ");
        PGDireccion=text.nextLine();
     }
}
