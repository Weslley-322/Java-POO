package oficina;

public class Carro extends Veiculo {
	private boolean multimidia;
	private int qtdPortas;
	 public Carro(String marca, String modelo, String cor, int ano, double km, Motor motor,
			 TipoCombustivel tipoCombustivel, boolean multimidia, int qtdPortas) {
		 super(marca, modelo, cor, ano, km, motor, tipoCombustivel);
		 this.multimidia = multimidia;
		 this.qtdPortas = qtdPortas;
	 }
	 
	 public int getQtdPortas() {
		 return qtdPortas;
	 }
	 public void setQtdPortas(int qtdPortas) {
		 this.qtdPortas = qtdPortas;
	 }
	  public boolean getMultimidia() {
		  return multimidia;
	  }
	  public void setMuktimidia(boolean multimidia) {
		  this.multimidia = multimidia;
	  }
	 
	 public void ligarMultimidia() {
		 if(multimidia) {
			 System.out.println("Sistema multimídia ligado");
		 } else {
			 System.out.println("Este carro não possui sistemas de multimídia...");
		 }
	 }
	  public void abrirPortas() {
		  System.out.println("Abrindo uma das " + qtdPortas + " do carro");
	  }
	  
	  @Override
	  public String toString() {
		  return super.toString() + "qtdPortas = " + qtdPortas + ", " + "multimídia = " + (multimidia ? "Sim, " : "Não, ");
	  }
	  @Override
	  public void ligar() {
		  System.out.println("O carro " + getModelo() + " está ligado");
	  }
	  @Override
	  public void desligar() {
		  System.out.println("O carro " + getModelo() + " está desligado");
	  }

}
