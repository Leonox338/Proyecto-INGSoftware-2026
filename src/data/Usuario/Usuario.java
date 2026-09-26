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
        public Usuario( String Nombre, String Apellido,int Cedula, String Correo, String rol ){
         Uname=Nombre;
         Uapellido= Apellido;
         Ucedula=Cedula;
         Uemail=Correo;
         Urol=rol;
        }
        }