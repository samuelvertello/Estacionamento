public interface ControleDeEstacionamento {

    // permite cadastrar um novo veiculo sendo estacionado
   
    void cadastrarEntradaVeiculo(String placa);
   
    // permite cadastrar uma saída de um veiculo estacionado
   
    void cadastrarSaidaVeiculo(String placa);
   
    // calcula o valor total do estacionamento em função da entrada e saída do veículo
   
    float calcularValorEstacionamento(String placa);
   
    // lista na saída padrão todos os veículos estacionados (placas)
   
    void exibirVeiculosEstacionados();
   
    // informa a taxa de ocupação do estacionamento (numCarros/TotalDeVagas)
   
    float obterTaxaDeOcupacao();
   
    // informa a quantidade total de vagas existentes no estacionamento
   
    int obterNumeroTotalDeVagas();
   
    // informa a quantidade de automóveis estacionados 
   
    int obterNumeroTotalDeAutomoveis();
   
   }
