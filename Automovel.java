public class Automovel {

    private String placa;
    private LocalDateTime horaEntrada;
    private LocalDateTime horaSaida;
    private float valorTotal;    

    
    public Automovel(String placa){

        this.placa = placa;
        this.horaEntrada = LocalDateTime.now();
        
               
    }
    
    

    public String getPlaca() {
        return placa;
    }



    public void setPlaca(String placa) {
        this.placa = placa.toUpperCase();
    }



    public LocalDateTime getHoraEntrada() {
        return horaEntrada;
    }




    public void setHoraEntrada(LocalDateTime horaEntrada) {
        this.horaEntrada = horaEntrada;
    }




    public LocalDateTime getHoraSaida() {
        return horaSaida;
    }


    public void setHoraSaida(LocalDateTime horaSaida) {
        this.horaSaida = horaSaida;
    }


    public float getValorTotal() {
        return valorTotal;
    }


    public void setValorTotal(float valorTotal) {
        this.valorTotal = valorTotal;
    }

   

    @Override
    public String toString() {
        return  "Automovel [Placa= " + placa + " horaEntrada= " + horaEntrada + " horaSaida= " + horaSaida +" valorTotal= " + valorTotal + "]";
    }

    

    
    
}
