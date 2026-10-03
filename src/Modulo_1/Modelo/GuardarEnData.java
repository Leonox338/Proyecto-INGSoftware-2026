package Modulo_1.Modelo;
import Data.Usuarios.Usuario;
import java.io.File;
import java.nio.file.StandardOpenOption;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;
public class GuardarEnData {
 public GuardarEnData() throws IOException{
     String a ="";
 }
 
public boolean GuardarUsuarios( Usuario u) throws IOException
{
  switch(u.Urol.toLowerCase()){
      case ("estudiante"):
      File FileEstudiante=new File("Estudiantes.txt");
      Path RutaUsuarioEstudiantes = Path.of("Estudiantes.txt");
      String ContenidoEstudiante= """
                    --------------------------------------
                        Nombre: %s
                        Apellido: %s
                        Cedula: %s
                        Correo: %s
                        Rol: %s
                        Facultad: %s
                        Carrera: %s
                    --------------------------------------
                        """.formatted(u.Uname,u.Uapellido,u.Ucedula,u.Uemail,u.Urol,u.E.Efacultad,u.E.Ecarrera);
     
      Files.writeString(RutaUsuarioEstudiantes, ContenidoEstudiante, StandardCharsets.UTF_8,StandardOpenOption.CREATE,StandardOpenOption.APPEND);
      return FileEstudiante.exists();
      case ("empleado"):
          File FileEmpleado=new File("Empleados.txt");
          Path RutaUsuarioEmpleados = Path.of("Empleados.txt");
          String ContenidoEmpleado= """
                    --------------------------------------
                        Nombre: %s
                        Apellido: %s
                        Cedula: %s
                        Correo: %s
                        Rol: %s
                        Facultad: %s
                        Carrera: %s
                        Area: %s 
                    --------------------------------------
                        """.formatted(u.Uname,u.Uapellido,u.Ucedula,u.Uemail,u.Urol,u.Emp.EmpArea);
      Files.writeString(RutaUsuarioEmpleados, ContenidoEmpleado, StandardCharsets.UTF_8,StandardOpenOption.CREATE,StandardOpenOption.APPEND);
      return FileEmpleado.exists();
      case ("profesor"):
          File FileProf= new File("Profesores.txt");
          Path RutaUsuarioProfesor = Path.of("Profesores.txt");
          String ContenidoProfesor= """
                    --------------------------------------
                        Nombre: %s
                        Apellido: %s
                        Cedula: %s
                        Correo: %s
                        Rol: %s
                        Facultad: %s
                        Carrera: %s
                        Materia que Dicta: %s 
                    --------------------------------------
                        """.formatted(u.Uname,u.Uapellido,u.Ucedula,u.Uemail,u.Urol,u.P.Pfacultad,u.P.PCarrera,u.P.PMateria);
      Files.writeString(RutaUsuarioProfesor, ContenidoProfesor, StandardCharsets.UTF_8,StandardOpenOption.CREATE,StandardOpenOption.APPEND);
     return FileProf.exists();
      case ("conductor"):
         File FileConductor= new File ("Conductores.txt");
         Path RutaUsuarioConductor = Path.of("Conductores.txt");
         String licen;
         if(u.C.Clicencia==false){
             licen = "sin licencia" ;
         }else{
             licen= "licencia Certificada";
         }
         String ContenidoConductor= """
                    --------------------------------------
                        Nombre: %s
                        Apellido: %s
                        Cedula: %s
                        Correo: %s
                        Rol: %s
                        Licenia %s 
                    --------------------------------------
                        """.formatted(u.Uname,u.Uapellido,u.Ucedula,u.Uemail,u.Urol,licen);
      Files.writeString(RutaUsuarioConductor, ContenidoConductor, StandardCharsets.UTF_8,StandardOpenOption.CREATE,StandardOpenOption.APPEND);
      return FileConductor.exists();
      case ("publico general"):
      File FilePG= new File ("Publico_General.txt");
          Path RutaUsuarioPublicG = Path.of("Publico_General.txt");
          String ContenidoPG= """
                    --------------------------------------
                        Nombre: %s
                        Apellido: %s
                        Cedula: %s
                        Correo: %s
                        Rol: %s
                        Direccion: %s 
                    --------------------------------------
                        """.formatted(u.Uname,u.Uapellido,u.Ucedula,u.Uemail,u.Urol,u.PG.PGDireccion);
      Files.writeString(RutaUsuarioPublicG, ContenidoPG, StandardCharsets.UTF_8,StandardOpenOption.CREATE,StandardOpenOption.APPEND);
      return FilePG.exists();
      default:
      return false;
  }//Del Switch
}// de la funcion
}// de la clase
