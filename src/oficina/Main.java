package oficina;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        //Cliente
        Cliente cliente = new Cliente("João", "123.456.789-00", "Fusca 1978");
        System.out.println(cliente);

        //Mecânico com especialidade em Motor
        Mecanico mecanico = new Mecanico("Carlos", "987.654.321-00", EspecMecanico.MOTOR);
        System.out.println(mecanico);
        System.out.println();

        //Motor
        Motor motor = new Motor(350, 150, 123456);

        //Combustivel do tipo gasolina
        TipoCombustivel tipoCombustivel = TipoCombustivel.GASOLINA; 

        //Carro
        Carro carro = new Carro("Fiat", "Uno", "Azul", 2020, 15000, motor, tipoCombustivel, true, 4);
        

        // Exibindo as informações do carro
        System.out.println("Informações do Carro:");
        carro.desligar();
        System.out.println(carro.toString());
        System.out.println();

        //Moto
        Moto minhaMoto = new Moto("Honda", "CB 500", "Preta", 2021, 12000, motor, tipoCombustivel, "Retrô", false);

        //Exibindo as informações da moto
        System.out.println("Informações da Moto:");
        minhaMoto.ligar();
        System.out.println(minhaMoto.toString()); 

        System.out.println("Sobre o suporte: ");
        minhaMoto.abrirSuportePe();
        System.out.println();

        //Atualizando o status do suporte de pé e imprimindo novamente
        minhaMoto.setSuportePe(true);
        System.out.println("Estado do Suporte após atualização:");
        minhaMoto.abrirSuportePe();  
        System.out.println();

        //Conserto para o Carro
        Consertos consertoCarro = new Consertos(carro, mecanico, LocalDate.now(), 500.00,
                                                StatusConserto.PENDENTE, PrioriConserto.MEDIA, TipoServico.REVISAO);

        //Exibindo o início do conserto do Carro
        System.out.println("Detalhes do Conserto do Carro:");
        System.out.println(consertoCarro);

        //Iniciando o conserto do Carro
        consertoCarro.IniciarConserto();

        //Atualizando a prioridade do conserto do Carro
        consertoCarro.AtualizarPriori(PrioriConserto.ALTA);

        //Finalizando o conserto do Carro
        consertoCarro.FinalizarConserto();
        System.out.println();

        //Detalhes após as alterações do conserto do Carro
        System.out.println("Detalhes após o Conserto do Carro:");
        System.out.println(consertoCarro);
        System.out.println();

        //Conserto para a Moto
        Consertos consertoMoto = new Consertos(minhaMoto, mecanico, LocalDate.now(), 200.00,
                                               StatusConserto.PENDENTE, PrioriConserto.BAIXA, TipoServico.TROCA_OLEO);

        //Exibindo o início do conserto da Moto
        System.out.println("Detalhes do Conserto da Moto:");
        System.out.println(consertoMoto);

        //Iniciando o conserto da Moto
        consertoMoto.IniciarConserto();

        //Atualizando a prioridade do conserto da Moto
        consertoMoto.AtualizarPriori(PrioriConserto.MEDIA);

        //Finalizando o conserto da Moto
        consertoMoto.FinalizarConserto();
        System.out.println();

        //Detalhes após as alterações do conserto da Moto
        System.out.println("Detalhes após o Conserto da Moto:");
        System.out.println(consertoMoto);
    }
}
