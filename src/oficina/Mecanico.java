package oficina;

public class Mecanico extends Pessoa implements IMecanico{
	private EspecMecanico espec;
	 public Mecanico(String nome, String CPF, EspecMecanico espec) {
	 super(nome, CPF);
	 this.espec = espec;
	 }
	  public EspecMecanico getEspecialidade() {
		  return espec;
	  }
	  
	  public void setEspecialidade(EspecMecanico espec) {
		  this.espec = espec;
	  }
	  
	  @Override
	  public void realizarConserto() {
		  System.out.println("Mecânico " + getNome() + " está realizando o conserto!!");
	  }
	  @Override
	  public String toString() {
		  return "Mecanico =>" + "nome = " + getNome() + ", " + "CPF = " + getCPF() + ", " + "especialidade = " + espec + " ";
	  }
	 
}
