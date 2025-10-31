package oficina;

public class Cliente extends Pessoa {
	private String carroVinculado;
	 public Cliente(String nome, String CPF, String carroVinculado) {
		 super(nome, CPF);
		 this.carroVinculado = carroVinculado;
	 }
	 
	  public String getCarroVinculado() {
		  return carroVinculado;
	  }
	  
	  public void setCarroVinculado(String carroVinculado) {
		  this.carroVinculado = carroVinculado;
	  }
	  @Override
	  public String toString() {
		  return "Cliente: " + 
	              "nome = " + getNome() + ", " + "CPF = " + getCPF() + ", " + "Veículo vinculado = " + carroVinculado + ".";
	  }
	

}
