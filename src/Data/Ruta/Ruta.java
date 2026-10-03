package Data.Ruta;
public class Ruta {
public Ruta_ExtraUrbana Rext;
public Ruta_Urbana Ru;
public Ruta(){
    Rext= new Ruta_ExtraUrbana();
    Ru= new Ruta_Urbana();
}
public boolean Find(String x){
    Ruta_ExtraUrbana find1=new Ruta_ExtraUrbana();
    Ruta_Urbana find2 = new Ruta_Urbana();
    for(int i=1,j=1;i<=11 && j<=9;i++,j++)
    {
      find1.Trayecto(j);
      find2.Trayecto(i);
      if(x==find1.TrayectoIda ||x==find1.TrayectoVuelta || x==find2.TrayectoIda || x==find2.TrayectoVuelta)
      return true;
    }
    return false;
}
}
