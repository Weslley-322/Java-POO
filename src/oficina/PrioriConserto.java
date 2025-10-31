package oficina;

public enum PrioriConserto {
	BAIXA("Prioridade baixa"), MEDIA("Prioridade média"), ALTA("Prioridade alta"), URGENTE("Prioridade urgente");
	 private final String priori;
	  private PrioriConserto(String priori) {
		  this.priori = priori;
	  }
	  
	   public String getPriori() {
		   return priori;
	   }

}
