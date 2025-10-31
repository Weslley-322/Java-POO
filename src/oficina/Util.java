package oficina;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Util {
	private static List<Veiculo> veiculos = new ArrayList<>();
	private static List<Mecanico> mecanicos = new ArrayList<>();
	private static List<Consertos> consertos = new ArrayList<>();
	private static List<Cliente> clientes = new ArrayList<>();
	private static Scanner scanner = new Scanner(System.in);
	public static void CadCliente() {
		System.out.println("Informe o nome do cliente: ");
		String nome = scanner.nextLine();
		
		System.out.println("Informe o CPF do cliente: ");
		String CPF = scanner.nextLine();
		
		System.out.println("Informe o veiculo vinculado ao cliente (Carro ou moto): ");
		String carroVinculado = scanner.nextLine();
		
		Cliente cliente = new Cliente(nome, CPF, carroVinculado);
		clientes.add(cliente);
		System.out.println("Cliente cadastrado com sucesso!!");
	}
	
	 public static void exibirClientes() {
		 if(clientes.isEmpty()) {
			 System.out.println("Nenhum cliente resgistrado...");
		 }else {
			 System.out.println("Clientes cadastrados: ");
			 for(Cliente cliente : clientes) {
				 System.out.println(cliente);
			 }
		 }
	 }
	
	public static void CadVeiculo() {
	    System.out.println("Selecione o tipo de veículo: (1- carro, 2- moto): ");
	    int TipoVeiculo = Integer.parseInt(scanner.nextLine());

	    System.out.println("Informe a marca do veículo");
	    String marca = scanner.nextLine();
	  
	    System.out.println("Informe o modelo do veículo");
	    String modelo = scanner.nextLine();
	  
	    System.out.println("Informe a cor do veículo");
	    String cor = scanner.nextLine();
	  
	    System.out.println("Informe o ano do veículo");
	    int ano = Integer.parseInt(scanner.nextLine());
	  
	    System.out.println("Informe a quilometragem do veículo");
	    double km = Double.parseDouble(scanner.nextLine());
	  
	    System.out.println("Informe o torque do motor");
	    int torque = Integer.parseInt(scanner.nextLine());
	  
	    System.out.println("Informe a potência do motor");
	    int potencia = Integer.parseInt(scanner.nextLine());
	  
	    System.out.println("Informe o número do chassi do motor");
	    int numChassi = Integer.parseInt(scanner.nextLine());
	  
	    Motor motor = new Motor(torque, potencia, numChassi);
	  
	    System.out.println("Selecione o tipo de combustível:");
	    System.out.println("1 - Gasolina");
	    System.out.println("2 - Diesel");
	    System.out.println("3 - Etanol");
	    System.out.println("4 - Elétrico");
	    System.out.println("5 - GNV");
	    
	    TipoCombustivel tipoCombustivel = TipoCombustivel.values()[Integer.parseInt(scanner.nextLine()) - 1];
	  
	    Veiculo veiculo;
	    if (TipoVeiculo == 1) { 
	        System.out.println("O carro possui multimidia?(true para SIM/ false para NÂO): ");
	        boolean multimidia = Boolean.parseBoolean(scanner.nextLine());
	        System.out.println("Quantas portas este carro possui? ");
	        int qtdPortas = Integer.parseInt(scanner.nextLine());
	        veiculo = new Carro(marca, modelo, cor, ano, km, motor, tipoCombustivel, multimidia, qtdPortas);
	    } else { 
	        System.out.println("Informe qual o tipo de guidão da moto? ");
	        String TipoGuidao = scanner.nextLine();
	        System.out.println("Esta moto possui suporte de pé?(true para SIM/ false para NÂO): ");
	        boolean SuportePe = Boolean.parseBoolean(scanner.nextLine());
	        veiculo = new Moto(marca, modelo, cor, ano, km, motor, tipoCombustivel, TipoGuidao, SuportePe);
	    }
	  
	     System.out.println("Deseja vincular um cliente a este veículo? (S/N)");
	     String res = scanner.nextLine().trim().toUpperCase();
	      while(!res.equals("S") && !res.equals("N")) {
	    	  System.out.println("Resposta inválida. Digite S para sim e N para não");
	    	  res = scanner.nextLine().trim().toUpperCase();
	      }
	      if(res.equals("S")) {
	    	  System.out.println("Selecione o cliente que deseja vincular: ");
	    	  for(int i = 0; i < clientes.size(); i++) {
	    		  System.out.println((i + 1) + " - " + clientes.get(i));
	    	  }
	    	   int clienteEscolhido = Integer.parseInt(scanner.nextLine()) - 1;
	    	     if (clienteEscolhido>= 0 && clienteEscolhido < clientes.size()) {
	    	    	 Cliente cliente= clientes.get(clienteEscolhido);
	    	    	  cliente.setCarroVinculado(veiculo.toString());
	    	    	  System.out.println("Cliente vinculado com sucesso!!");
	    	     }else {
	    	    	 System.out.println("Cliente inválido.");
	    	     }
	      }
	     
	    
	    veiculos.add(veiculo);
	    System.out.println("Veículo cadastrado com sucesso!!");
	}

	   public static void exibirVeiculos() {
		   if(veiculos.isEmpty()) {
			   System.out.println("Nenhum veículo cadastrado");
		   }else {
			   System.out.println("Veículos cadastrados: ");
			   for(Veiculo veiculo: veiculos) {
				   System.out.println(veiculo);
			   }
		   }
	   }
	     public static void cadMecanico() {
	    	 System.out.println("Digite o nome do mecânico: ");
	    	 String nome = scanner.nextLine();
	    	 
	    	 System.out.println("Digite o CPF do mecânico: ");
	    	 String CPF = scanner.nextLine();
	    	 
	    	 System.out.println("Informe a especialidade do mecânico: ");
	    	 System.out.println("1 - Motor");
	    	 System.out.println("2 - Transmissão");
	    	 System.out.println("3 - Elétrica");
	    	 System.out.println("4 - Freios");
	    	 System.out.println("5 - Suspensão");
	    	 System.out.println("6 - Pintura");
	    	 
	    	 EspecMecanico espec = EspecMecanico.values()[Integer.parseInt(scanner.nextLine()) - 1];
	    	   Mecanico mecanico = new Mecanico(nome, CPF, espec);
	    	   mecanicos.add(mecanico);
	    	   System.out.println("Mecânico cadastrado com sucesso!!");
	     }
	      public static void exibirMecanicos() {
	    	  if(mecanicos.isEmpty()) {
	    		  System.out.println("Nenhum mecânico registrado");
	    	  }else {
	    		  System.out.println("Mecânicos cadastrados: ");
	    		  for(Mecanico mecanico : mecanicos) {
	    			  System.out.println(mecanico);
	    		  }   
	    	  }
	      }
	      
	       public static void IniConsertos() {
	    	   System.out.println("Escolha qual veículo deseja consertar: ");
	    	   for(int i = 0; i < veiculos.size(); i++) {
	    		   System.out.println((i + 1) + " - " + veiculos.get(i));
	    	   }
	    	   int VeiculoEscolhido = Integer.parseInt(scanner.nextLine()) - 1;
	    	     if(VeiculoEscolhido < 0 || VeiculoEscolhido >= veiculos.size()) {
	    	    	 System.out.println("Inválido...");
	    	    	 return;
	    	     }
	    	     
	    	     Veiculo veiculo = veiculos.get(VeiculoEscolhido);
	    	     
	    	     
	    	    System.out.println("Escolha um mecânico para realizar o conserto: ");
	    	    for(int i = 0; i < mecanicos.size(); i++) {
	    	    	System.out.println((i + 1) + " - " + mecanicos.get(i));
	    	    }
	    	    int MecanicoEscolhido = Integer.parseInt(scanner.nextLine()) - 1;
	    	      if(MecanicoEscolhido < 0 || MecanicoEscolhido >= mecanicos.size()) {
	    	    	 System.out.println("Inválido...");
	    	    	 return;
	    	      }
	    	      
	    	      Mecanico mecanico = mecanicos.get(MecanicoEscolhido);
	    	    
	    	    
	    	    System.out.println("Informe o valor do conserto: ");
	    	    double custo = Double.parseDouble(scanner.nextLine());
	    	    
	    	    System.out.println("Escolha o tipo do serviço: ");
	    	    System.out.println("1 - Revisão");
	    	    System.out.println("2 - Troca de óleo");
	    	    System.out.println("3 - Alinhamento");
	    	    System.out.println("4 - Balanceamento");
	    	    System.out.println("5 - Freios");
	    	    System.out.println("6 - Suspensão");
	    	    System.out.println("7 - Pintura");
	    	    System.out.println("8 - Elétrica");
	    	    
	    	    TipoServico Tservico = TipoServico.values()[Integer.parseInt(scanner.nextLine()) - 1];
	    	    
	    	    System.out.println("Informe o nível de prioridade do conserto:");
	    	    System.out.println("1 - Baixa");
	    	    System.out.println("2 - Média");
	    	    System.out.println("3 - Alta");
	    	    System.out.println("4 - Urgente");
	    	    
	    	    
	    	    PrioriConserto priori = PrioriConserto.values()[Integer.parseInt(scanner.nextLine()) - 1];
	    	    
	    	    System.out.println("Informe o status do conserto: ");
	    	    System.out.println("1 - Pendente");
	    	    System.out.println("2 - Em andamento");
	    	    System.out.println("3 - Finalizado");
	    	    System.out.println("4 - Cancelado");
	    	    
	    	    StatusConserto status = StatusConserto.values()[Integer.parseInt(scanner.nextLine()) - 1];
	    	    
					Consertos conserto = new Consertos(veiculo, mecanico, LocalDate.now(), custo, status, priori, Tservico);
					consertos.add(conserto);
					System.out.println("Conserto registrado com sucesso!!");
				}
	       
	       public static void ExibirConsertos() {
	    	   if(consertos.isEmpty()) {
	    		   System.out.println("Nenhum conserto registrado");
	    	   }else {
	    		   System.out.println("Consertos registrados:");
	    		   for(Consertos conserto : consertos) {
	    			   System.out.println(conserto);
	    		   }
	    	   }
	       }
	       
	       public static void AtualizarStatusConserto() {
	    	   if(consertos.isEmpty()) {
	    		   System.out.println("Nenhum conserto registrado...");
	    		   return;
	    	   }
	    	    System.out.println("Selecione o conserto que deve ser atualizado: ");
	    	    for(int i = 0; i < consertos.size(); i++) {
	    	    	System.out.println((i + 1) + " - " + consertos.get(i));
	    	    }
	    	    int consertoEscolhido = Integer.parseInt(scanner.nextLine()) - 1;
	    	    if(consertoEscolhido < 0 || consertoEscolhido >= consertos.size()) {
	    	    	System.out.println("Inválido...");
	    	    	return;
	    	    }
	    	    Consertos conserto = consertos.get(consertoEscolhido);
	    	    
	    	    System.out.println("Prioridade atual é: " + conserto.getPrioridade());
	    	     System.out.println("Selecione a nova prioridade: ");
	    	     System.out.println(" 1 - Baixa");
	    	     System.out.println(" 2 - Média");
	    	     System.out.println(" 3 - Alta");
	    	     System.out.println(" 4 - Urgente");
	    	     
	    	     int NovaPriori = Integer.parseInt(scanner.nextLine()) - 1;
	    	     if(NovaPriori < 0 || NovaPriori >= PrioriConserto.values().length) {
	    	    	 System.out.println("Atualização falhou...");
	    	    	 return;
	    	     }
	    	      PrioriConserto novaPrioridade = PrioriConserto.values()[NovaPriori];
	    	      
	    	      conserto.AtualizarPriori(novaPrioridade);
	       }
	       
	       public static void Menu() {
	    	   boolean sair = false;
	    	     while(!sair) {
	    	    	 System.out.println("Selecione uma opção: ");
	    	    	 System.out.println("1 - Cadastrar cliente");
	    	    	 System.out.println("2 - Cadastrar veículo");
	    	    	 System.out.println("3 - Cadastrar mecânico");
	    	    	 System.out.println("4 - Iniciar conserto");
	    	    	 System.out.println("5 - Exibir cliente");
	    	    	 System.out.println("6 - Exibir veículo");
	    	    	 System.out.println("7 - Exibir mecânico");
	    	    	 System.out.println("8 - Exibir consertos");
	    	    	 System.out.println("9 - Atualizar status do conserto");
	    	    	 System.out.println("10 - Sair");
	    	    	 
	    	    	  int escolha = Integer.parseInt(scanner.nextLine());
	    	    	  
	    	    	   switch(escolha) {
	    	    	   case 1:
	    	    		   CadCliente();
	    	    		   break;
	    	    		   
	    	    	   case 2:
	    	    		   CadVeiculo();
	    	    		   break;
	    	    		   
	    	    	   case 3: 
	    	    		   cadMecanico();
	    	    		   break;
	    	    		   
	    	    	   case 4:
	    	    		   IniConsertos();
	    	    		   break;
	    	    		   
	    	    	   case 5: 
	    	    		   exibirClientes();
	    	    		   break;
	    	    		   
	    	    	   case 6: 
	    	    		   exibirVeiculos();
	    	    		   break;
	    	    		   
	    	    	   case 7:
	    	    		   exibirMecanicos();
	    	    		   break;
	    	    	   case 8:
	    	    		   ExibirConsertos();
	    	    		   break;
	    	    	   case 9:
	    	    		   AtualizarStatusConserto();
	    	    		   break;
	    	    	   case 10:
	    	    		   sair = true;
	    	    		   break;
	    	    		    default:
	    	    		    	System.out.println("Selecione apenas números de 1 a 10");
	    	    	   }
	    	     }
	       }
	        public static void main(String[] args) {
	        	Menu();
	  }
}
