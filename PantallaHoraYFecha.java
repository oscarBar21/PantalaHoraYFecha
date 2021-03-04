public class PantallaHoraYFecha{
    private PantallaDosDigitos horas;
    private PantallaDosDigitos minutos;
    private PantallaDosDigitos dia;
    private PantallaDosDigitos mes;
    private PantallaDosDigitos ano;
    
    public PantallaHoraYFecha(){
       horas = new PantallaDosDigitos(0, 24);
       minutos = new PantallaDosDigitos(0, 60);
       dia = new PantallaDosDigitos(1, 31);
       mes = new PantallaDosDigitos(1, 13);
       ano = new PantallaDosDigitos(1, 99);
    }
}