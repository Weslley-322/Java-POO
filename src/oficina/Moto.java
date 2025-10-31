package oficina;

public class Moto extends Veiculo {
	private String TipoGuidao;
	private boolean SuportePe;
	public Moto(String marca, String modelo, String cor, int ano, double km, Motor motor, TipoCombustivel tipoCombustivel,
			String TipoGuidao, boolean SuportePe) {
        super(marca, modelo, cor, ano, km, motor, tipoCombustivel); 
        this.TipoGuidao = TipoGuidao;
        this.SuportePe = SuportePe;
	  }
	  
	public String getTipoGuidao() {
		  return TipoGuidao;
	  }
	   public void setTipoGuidao(String TipoGuidao) {
		   this.TipoGuidao = TipoGuidao;
	   }
	    
	  public boolean SuportePe() {
		  return SuportePe;
	  }
	   public void setSuportePe(boolean SuportePe) {
		   this.SuportePe = SuportePe;
	   }
	  public void abrirSuportePe() {
		  if(SuportePe) {
			  System.out.println("O suporte de pé já está aberto");
		  }else {
			  System.out.println("Abrindo o suporte de pé");
			  SuportePe = true;
		  }
		  
	  }
	  @Override
	  public String toString() {
		  return super.toString() + "Tipo do guidão = " + TipoGuidao + ", Status do suporte de pé = " + SuportePe + ", ";
	  }
	  @Override
	  public void ligar() {
		  System.out.println("A moto " + getModelo() + " está ligado");
	  }
	  @Override
	  public void desligar() {
		  System.out.println("A moto " + getModelo() + " está desligado");
	  }

}
