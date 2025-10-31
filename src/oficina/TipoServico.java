package oficina;

public enum TipoServico {
	REVISAO("Revisão geral"), TROCA_OLEO("Troca de óleo"), ALINHAMENTO("Alinhamento de rodas"), BALANCEAMENTO("Balanceamento de rodas"),
	FREIOS("Serviço nos freios"), SUSPENSAO("Serviço na suspensão"), PINTURA("Serviço de pintura"), ELETRICA("Serviço elétrico");
	 private final String Tservico;
	  private TipoServico(String Tservico) {
		  this.Tservico = Tservico;
	  }
	  
	  public String getTservico() {
		  return Tservico;
	  }

}
