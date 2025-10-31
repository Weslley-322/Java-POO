package oficina;

public enum StatusConserto {
	PENDENTE("Conserto pendente"), EM_ANDAMENTO("Conserto em andamento"), FINALIZADO("Conserto finalizado"), CANCELADO("Conserto cancelado");
	 private final String status;
	  private StatusConserto(String status) {
		  this.status = status;
	  }
	  
	   public String getStatus() {
		   return status;
	   }
	   
 
}
