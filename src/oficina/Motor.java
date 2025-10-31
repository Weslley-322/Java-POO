package oficina;

public class Motor {
	private int torque;
	private int potencia;
	private int numChassi;
	 public Motor(int torque, int potencia, int numChassi) {
		 this.torque = torque;
		 this.potencia = potencia;
		 this.numChassi = numChassi;
	 }
	public int getTorque() {
		return torque;
	}
	public void setTorque(int torque) {
		this.torque = torque;
	}
	public int getPotencia() {
		return potencia;
	}
	public void setPotencia(int potencia) {
		this.potencia = potencia;
	}
	public int getNumChassi() {
		return numChassi;
	}
	public void setNumChassi(int numChassi) {
		this.numChassi = numChassi;
	}
	 public double calcEficiencia() {
		 if(torque == 0) return 0;
		 return (double) potencia / torque;
	 }
	  public String toString() {
		  return "Motor => torque = " + torque + "NM, " + "potência = " + potencia + "Cv, " + "Número do Chassi = " + numChassi + ",";
	  }

}
