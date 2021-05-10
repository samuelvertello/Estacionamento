public class SistemaDeEstacionamento implements ControleDeEstacionamento{
    
    Estacionamento estacionamento;
    

    public boolean registrarEstacionamento(int vagas, float taxaHora, String nome){  
        
        if(estacionamento != null){
            System.out.println("Estacionamento ja registrado.");
            return false;
        }
        
        this.estacionamento = new Estacionamento(vagas, taxaHora, nome);
        System.out.println("Estacionamento registrado.");
        return true;

        

    }    

   

    @Override
    public void cadastrarEntradaVeiculo(String placa) {

       estacionamento.cadastrarEntrada(placa);        
        
    }

    @Override
    public void cadastrarSaidaVeiculo(String placa) {
        
        estacionamento.cadastrarSaida(placa);
        
    }

    @Override
    public float calcularValorEstacionamento(String placa) {

        estacionamento.calcularValor(placa);
        
        return 0;
    }

    @Override
    public void exibirVeiculosEstacionados() {

        estacionamento.exibirVeiculos();
        
        
    }

    @Override
    public float obterTaxaDeOcupacao() {   
        
        float taxa = estacionamento.obterTaxaOcupacao();
        

        return taxa;

    }

    @Override
    public int obterNumeroTotalDeVagas() {        
       
        int totalVagas = estacionamento.ObterTotalVagas();
        
        return totalVagas;
    }

    @Override
    public int obterNumeroTotalDeAutomoveis() {     
        
        int totalVeiculos = estacionamento.obterNumeroTotalDeAutomoveis();
        
        return  totalVeiculos;

    }


}
    

