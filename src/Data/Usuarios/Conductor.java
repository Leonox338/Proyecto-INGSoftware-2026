package Data.Usuarios;

import java.util.Scanner;

public class Conductor {
public boolean Clicencia;    
    public Conductor( ){
        Clicencia=false;
    }
    public Conductor( boolean lic)
    {
    Clicencia = lic;
    }
    public void Carga(){
     Scanner text = new Scanner (System.in);
        System.out.print("Es Verdad que el conductor tiene licencia: ");
        Clicencia=text.nextBoolean();
     }
}
