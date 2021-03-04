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
    
    public String getFechaYHora() {
        String fechaYHora;
        fechaYHora = (horas.getTextoDeLaPantalla() + ":" + minutos.getTextoDeLaPantalla() + " " + dia.getTextoDeLaPantalla() + "-" + mes.getTextoDeLaPantalla() + "-" + ano.getTextoDeLaPantalla());
        return fechaYHora;
    }
    
    public void avanzarMinuto(){
        minutos.incrementaValorAlmacenado();
        
        if (minutos.getValorAlmacenado() == 0) {
            horas.incrementaValorAlmacenado();
            if (horas.getValorAlmacenado() == 0) {
                dia.incrementaValorAlmacenado();
                if (dia.getValorAlmacenado() == 1) {
                    mes.incrementaValorAlmacenado();
                    if (mes.getValorAlmacenado() == 1) {
                        ano.incrementaValorAlmacenado();
                    }
                }
            }
        }
    }
    
    public void fijarFechaYHora(int minuto, int hora, int dias, int meses, int anos){
        horas.setValorAlmacenado(hora);
        minutos.setValorAlmacenado(minuto);
        dia.setValorAlmacenado(dias);
        mes.setValorAlmacenado(meses);
        ano.setValorAlmacenado(anos);
    }
}
