package data.Usuario;
import java.util.Scanner;
public class Empleado {
    public String EmpArea;
    public Empleado( ){
    EmpArea="";
    }
    public Empleado(String Area )
    {
        EmpArea=Area;
    }
    public void Carga(){
     Scanner text = new Scanner (System.in);
        System.out.print("Ingrese Area: ");
        EmpArea = text.nextLine();
     }
}

