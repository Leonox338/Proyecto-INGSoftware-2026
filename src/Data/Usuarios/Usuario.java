package Data.Usuarios ;
import java.util.Scanner;
public class Usuario{
        public String Uemail; //variable del Correo
        public String Uname; //variable del nombre
        public String Uapellido; //variable del Apellido
        public int Ucedula; //variable de la Cedula
        public String Urol; //variable del roll
        public Profesor P; //si el Usuario es profesor se le instancian datos referente a este rol
        public Conductor C; //si el Usuario es Conductor se le instancian datos referente a este rol
        public Estudiante E; //si el Usuario es Estudiante se le instancian datos referente a este rol
        public Publico_General PG; //si el Usuario es Publico general se le instancian mas datos referente a este rol
        public Empleado Emp; //variable del nombre
        public Usuario( String Nombre, String Apellido,int Cedula, String Correo, String roll ){
         Uname=Nombre;
         Uapellido= Apellido;
         Ucedula=Cedula;
         Uemail=Correo;
         Urol=roll;
         E=new Estudiante();
         P=new Profesor();
         C=new Conductor();
         PG= new Publico_General();
         Emp=new Empleado();
        }
        }
