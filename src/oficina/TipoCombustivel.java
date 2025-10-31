package oficina;

public enum TipoCombustivel {
     GASOLINA("Gasolina"), DIESEL("Diesel"), ETANOL("Etanol"), ELETRICO("Elétrico"), FLEX("Flex"), GNV("Gás Natural Veicular");
	  private final String descricao;
       TipoCombustivel(String descricao){
    	   this.descricao = descricao;
       }
       
       public String getDescricao() {
    	   return descricao;
       }
       
}
