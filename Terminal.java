import java.util.Scanner;
public class Terminal {

    Scanner ler = new Scanner(System.in);

    SistemaDeEstacionamento sistema = new SistemaDeEstacionamento();
    

    public void menu(){

        System.out.println("\n******************************************");        
        System.out.println("*** 1 - criar Estacionamento           ***");
        System.out.println("*** 2 - Cadastrar entrada veiculo      ***");
        System.out.println("*** 3 - Cadastrar saida veiculo        ***");
        System.out.println("*** 4 - Calcular valor estacionamento  ***");
        System.out.println("*** 5 - Exibir veiculos estacionados   ***");
        System.out.println("*** 6 - Obter taxa de ocupação         ***");        
        System.out.println("*** 7 - Obter numero total de vagas    ***");
        System.out.println("*** 8 - Obter numero total de veiculos ***");
        System.out.println("*** 0 - Sair                           ***");        
        System.out.println("******************************************\n\n");
    }
   
    

    public void gerenciarEstacionamento(){          

        int select = 9;              

        while(select != 0){

            menu();

            System.out.println("\nQual operação deseja realizar...");
            select = ler.nextInt(); 

            switch (select) {
                case 1: // criar estacionamento

                ler = new Scanner(System.in);

                System.out.println("\nInsira nome do estacionamento.");
                String nome = ler.nextLine();

                System.out.println("\nInsira quantidade de vagas o estacionamento possui.");
                int vagas = ler.nextInt();

                System.out.println("\nInforme o valor da taxa/hora ");
                float taxa = ler.nextFloat();

                sistema.registrarEstacionamento(vagas, taxa, nome);
                   
                    
                    break;

                case 2: // cadastrar entrada veiculo

                if(sistema.estacionamento == null){
                    System.out.println("Não existe estacionamento para cadastrar veiculo");
                    break;
                }

                ler = new Scanner(System.in);

                System.out.println("*** CADASTRO VEICULO. ***\n");
                System.out.print("PLACA: ");
                String entradaVeiculo = ler.nextLine();                

                sistema.cadastrarEntradaVeiculo(entradaVeiculo.toUpperCase());

                    break;

                case 3: // cadastrar saida veiculo
                
                ler = new Scanner(System.in);

                System.out.println("*** SAIDA VEICULO. ***\n");
                System.out.print("PLACA: ");
                String saidaVeiculo = ler.nextLine();

                sistema.cadastrarSaidaVeiculo(saidaVeiculo.toUpperCase());

                    break;

                case 4: // calcular valor estacionamento

                ler = new Scanner(System.in);

                System.out.println("*** CALCULAR VALOR ESTACIONAMENTO. ***\n");
                System.out.print("PLACA: ");
                String pesquisarPlaca = ler.nextLine().toUpperCase();

                sistema.calcularValorEstacionamento(pesquisarPlaca.toUpperCase());              
                

                    break;

                case 5: // exibir veiculos estacionados

                System.out.println("*** VEICULOS ESTACIONADOS. ***\n");

                sistema.exibirVeiculosEstacionados();
                System.out.println();

                     break;

                case 6: // taxa de ocupação

                System.out.println("\nTaxa de ocupação: "+sistema.obterTaxaDeOcupacao()+"%\n");                
                
                     break;
                
                case 7: // total de vagas

                System.out.println("\nTotal de vagas: "+sistema.obterNumeroTotalDeVagas()+"\n");
              
                    break;

                case 8: // total de veiculos estacionados

                System.out.println("\nTotal de veiculos estacionados: "+sistema.obterNumeroTotalDeAutomoveis()+"\n");
                
                    break;

                case 0 : // sair

                System.out.println("Saindo...");
                break;
            
                default:

                System.out.println("Opção invalida...");
                    break;
            }
        }




    }
    
}
