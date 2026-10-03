package Data.Itinerarios;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import Data.Ruta.Ruta;
public class Itinerario {
   public LocalDate dia;
   public LocalTime hora;
   public Ruta rutaItinerario;
   public Itinerario(){
       dia=LocalDate.now();
       hora=LocalTime.now();
       rutaItinerario= new Ruta();
   }
  public void Cargar(LocalDate date, LocalTime time, Ruta r){
      dia=date;
      hora=time;
      rutaItinerario=r;
  }
}
