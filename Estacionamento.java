import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Estacionamento {

    private int totalVagas;
    private float taxaHora;
    private String nome;

    private int quantidade = 0;

    
    private List<Automovel> veiculo = new ArrayList<>(); 

    
    public Estacionamento(int totalVagas, float taxaHora, String nome) {
        this.totalVagas = totalVagas;
        this.taxaHora = taxaHora;
        this.nome = nome;
    }


    public boolean cadastrarEntrada(String placa){
        
        if(totalVagas == this.quantidade){
            System.out.println("Estacionamento cheio...");
            return false;
        }


        var auto = new Automovel(placa);
        veiculo.add(auto);
        System.out.println("Veiculo registrado. "+placa);
        this.quantidade++;       
        return true;
        
    }

    public boolean cadastrarSaida(String placa){    
        

        for(Automovel a : veiculo){
            if(a.getPlaca().equals(placa)){
               if( a.getValorTotal() != 0){
                veiculo.remove(a);
                this.quantidade--;
                System.out.println("Veiculo saindo: placa "+placa);
                return true;
               }
            
                else{
                System.out.println("\nPrimeiro deve calcular valor para dar baixa no sistema");
                return false;
            }
        }

        }       

       
        System.out.println("\nPlaca de veiculo não encontrada\n");
        return false;
    }

    public boolean calcularValor(String placa){

        for(Automovel a : veiculo){
            if(a.getPlaca().equals(placa)){

               a.setHoraSaida(LocalDateTime.now());

               int hora = a.getHoraSaida().getHour() - a.getHoraEntrada().getHour();
               if(hora != 0){
                   hora = hora * 60;
               }

               int tempo = a.getHoraSaida().getMinute() - a.getHoraEntrada().getMinute();

               tempo = tempo + hora;

               float valor = tempo * getTaxaHora();

               a.setValorTotal(valor);
        

               System.out.println(toString());
               System.out.println("Placa: "+a.getPlaca());
               System.out.print("Hora de entrada: "+a.getHoraEntrada().getHour()+":");
               System.out.println(a.getHoraEntrada().getMinute());
               System.out.print("Hora de saida: "+a.getHoraSaida().getHour()+":");
               System.out.println(a.getHoraSaida().getMinute());
               System.out.println("Tempo percorrido: "+tempo+" minutos.");
               System.out.println("Valor a pagar: R$ "+a.getValorTotal()); 
               return true;

            }
                  

        }

        System.out.println("Veiculo nao encontrado.");
        return false;
        
    }

    public void exibirVeiculos(){

        for(Automovel a : veiculo){
            System.out.println(a.getPlaca());
        }

    }
    public float obterTaxaOcupacao(){

        float valor = 0;

        if(veiculo.size() / getTotalVagas() == 0 && veiculo.size() % getTotalVagas() != 0){
            valor = (veiculo.size()% getTotalVagas());
            valor = (valor * 100)/getTotalVagas();
        }

        if(veiculo.size() / getTotalVagas() == 1 && veiculo.size() % getTotalVagas() == 0){
            valor = veiculo.size() / getTotalVagas();
            valor = valor * 100;
        }

        if(veiculo.size() / getTotalVagas() == 0 && veiculo.size() % getTotalVagas() == 0){
            valor = valor * 100;
        }
        
        

        return valor;
    }

    public int ObterTotalVagas(){
        
        return getTotalVagas();

    }

    public int obterNumeroTotalDeAutomoveis(){

        int totalVeiculos = veiculo.size();

        return totalVeiculos;
    }


    public int getTotalVagas() {
        return totalVagas;
    }

    public void setTotalVagas(int totalVagas) {
        this.totalVagas = totalVagas;
    }


    public float getTaxaHora() {

        return taxaHora/60;
    }


    public void setTaxaHora(float taxaHora) {
        this.taxaHora = taxaHora;
    }  
  


    @Override
    public String toString() {
        return "\nESTACIONAMENTO=> NOME: " + nome + " | TAXAHORA: R$ " + taxaHora + " | TOTALVAGAS: " + totalVagas;
    }

    
        
    

    
}
