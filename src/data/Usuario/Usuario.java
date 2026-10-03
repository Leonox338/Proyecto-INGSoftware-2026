package data.Usuario;
public class Usuario{
        public String Uemail;
        public String Uname;
        public String Uapellido;
        public int Ucedula;
        public String Urol;
        public Profesor P;
        public Conductor C;
        public Estudiante E;
        public Publico_General PG;
        public Empleado Emp;
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