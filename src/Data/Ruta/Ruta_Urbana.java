package Data.Ruta;
public class Ruta_Urbana {
public String TrayectoIda, TrayectoVuelta;
public Ruta_Urbana(){
    TrayectoIda="";
    TrayectoVuelta=""; 
}
 public Ruta_Urbana Trayecto(int n){
  Ruta_Urbana Ru= new Ruta_Urbana();
  switch(n){
      case(1): 
      Ru.TrayectoIda="UCV-PARQUE DEL ESTE";
      Ru.TrayectoVuelta="PARQUE DEL ESTE-UCV";
      return Ru;
      case(2):
      Ru.TrayectoIda="UCV-BELLO MONTE";
      Ru.TrayectoVuelta="BELLO MONTE-UCV";
      return Ru;    
      case(3):
      Ru.TrayectoIda="UCV-AV.FUERZAS ARMADAS";
      Ru.TrayectoVuelta="AV.FUERZAS ARMDAS-UCV";
      return Ru;    
      case(4):
      Ru.TrayectoIda="UCV-ESCUELA VARGAS";
      Ru.TrayectoVuelta="ESCUELA VARGAS-UCV";
      return Ru;    
      case(5):
      Ru.TrayectoIda="UCV-CATIA/PZA.O'LEARY";
      Ru.TrayectoVuelta="CATIA/PZA.O'LEARY-UCV";
      return Ru;    
      case(6):
      Ru.TrayectoIda="UCV-SAN MARTIN/CAPUCHINOS";
      Ru.TrayectoVuelta="SAN MARTIN/CAPUCHINOS-UCV";
      return Ru;    
      case(7):
      Ru.TrayectoIda="UCV-ALGODONAL/CARAPITA";
      Ru.TrayectoVuelta="ALGODONAL/CARAPITA-UCV";
      return Ru;
      case(8):
      Ru.TrayectoIda="UCV-COTA 905";
      Ru.TrayectoVuelta="COTA 905-UCV";
      return Ru;    
      case(9):
      Ru.TrayectoIda="UCV-RUIZ PINERDA";
      Ru.TrayectoVuelta="RUIZ PINEDA-UCV";
      return Ru;    
      case(10):
      Ru.TrayectoIda="UCV-CARICUAO";
      Ru.TrayectoVuelta="CARICUAO-UCV";
      return Ru;
      case(11):
      Ru.TrayectoIda="UCV-AV INTERCOMUNAL VALLE/COCHE";
      Ru.TrayectoVuelta="AV INTERCOMUNAL VALLE/COCHE-UCV";
      return Ru;    
      default:
      Ru.TrayectoIda="";
      Ru.TrayectoVuelta="";
      return Ru;
  }
}
}
