package Data.Ruta;
public class Ruta_ExtraUrbana {
public String TrayectoIda, TrayectoVuelta;
public Ruta_ExtraUrbana(){
    TrayectoIda="";
    TrayectoVuelta="";    
    }
public Ruta_ExtraUrbana Trayecto(int n){
  Ruta_ExtraUrbana Rext= new Ruta_ExtraUrbana();
  switch(n){
      case(1): 
      Rext.TrayectoIda="UCV-GUARENAS";
      Rext.TrayectoVuelta="GUARENAS-UCV";
      return Rext;
      case(2):
      Rext.TrayectoIda="UCV-LA GUAIRA";
      Rext.TrayectoVuelta="LA GUAIRA-UCV";
      return Rext;    
      case(3):
      Rext.TrayectoIda="UCV-LOS TEQUES";
      Rext.TrayectoVuelta="LOS TEQUES-UCV";
      return Rext;    
      case(4):
      Rext.TrayectoIda="UCV-TEJERIAS";
      Rext.TrayectoVuelta="TEJERIAS-UCV";
      return Rext;    
      case(5):
      Rext.TrayectoIda="UCV-LA VICTORIA";
      Rext.TrayectoVuelta="LA VICTORIA-UCV";
      return Rext;    
      case(6):
      Rext.TrayectoIda="UCV-MARACAY";
      Rext.TrayectoVuelta="MARACAY-UCV";
      return Rext;    
      case(7):
      Rext.TrayectoIda="UCV-CHARALLAVE/CUA";
      Rext.TrayectoVuelta="CHARALLLAVE/CUA-UCV";
      return Rext;
      case(8):
      Rext.TrayectoIda="UCV-OCUMARE DEL TUY";
      Rext.TrayectoVuelta="OCUMARE DEL TUY-UCV";
      return Rext;    
      case(9):
      Rext.TrayectoIda="UCV-SANTA TERESA DEL TUY";
      Rext.TrayectoVuelta=" SANTA TERESA DEL TUY-UCV";
      return Rext;    
      default:
      Rext.TrayectoIda="";
      Rext.TrayectoVuelta="";
      return Rext;
  }
    
}
}
