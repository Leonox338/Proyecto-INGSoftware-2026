package Modulo_7.Modelo7;
import Data.Itinerarios.Itinerario;
import java.io.File;
import java.nio.file.StandardOpenOption;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
public class AlmacenarHorario {
    Itinerario h;
    Path direccion;
    File FileItinerario;
    String Contenido;
    public AlmacenarHorario(Itinerario Itinerary, boolean selector, int n) throws IOException{
        h=new Itinerario();
        direccion = Path.of("Horarios.txt");
        FileItinerario= new File("Horarios.txt");
        if(selector==true && n==0){
        Contenido= """
            --------------------------   
                   Dia: %s
                   Hora: %s
                   Ruta: Urbana
                   Trayecto: %s
            --------------------------   
                   """.formatted(h.dia,h.hora,h.rutaItinerario.Ru.TrayectoIda);
        Files.writeString(direccion, Contenido,StandardCharsets.UTF_8,StandardOpenOption.CREATE,StandardOpenOption.APPEND);
    }else if(selector==true&& n==1){
        Contenido= """
            --------------------------          
                   Dia: %s
                   Hora: %s
                   Ruta: Urbana
                   Trayecto: %s
            --------------------------   
                   """.formatted(h.dia,h.hora,h.rutaItinerario.Ru.TrayectoVuelta);
        Files.writeString(direccion, Contenido,StandardCharsets.UTF_8,StandardOpenOption.CREATE,StandardOpenOption.APPEND);
    }else if(selector==false && n==0){
        Contenido= """
            --------------------------   
                   Dia: %s
                   Hora: %s
                   Ruta: ExtraUrbana
                   Trayecto: %s
            --------------------------   
                   """.formatted(h.dia,h.hora,h.rutaItinerario.Rext.TrayectoIda);
        Files.writeString(direccion, Contenido,StandardCharsets.UTF_8,StandardOpenOption.CREATE,StandardOpenOption.APPEND);
    }else{
        Contenido= """
            --------------------------       
                   Dia: %s
                   Hora: %s
                   Ruta: ExtraUrbana
                   Trayecto: %s
            --------------------------
                   """.formatted(h.dia,h.hora,h.rutaItinerario.Rext.TrayectoVuelta);
        Files.writeString(direccion, Contenido,StandardCharsets.UTF_8,StandardOpenOption.CREATE,StandardOpenOption.APPEND);
    }
    }
}
