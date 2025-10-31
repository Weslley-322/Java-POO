package oficina;

public abstract class Veiculo {
	private String marca;
	private String modelo;
	private String cor;
	private int ano;
	private double km;
	private Motor motor;
	private TipoCombustivel tipoCombustivel;
	  public Veiculo(String marca, String modelo, String cor, int ano, double km, Motor motor, TipoCombustivel tipoCombustivel) {
		  this.marca = marca;
		  this.modelo = modelo;
		  this.cor = cor;
		  this.ano = ano;
		  this.km = km;
		  this.motor = motor;
		  this.tipoCombustivel = tipoCombustivel;
	  }
	  
	  public String getMarca() {
		  return marca;
	  }
	  public void setMarca(String marca) {
		  this.marca = marca;
	  }
	   public String getModelo() {
		   return modelo;
	   }
	   public void setModelo(String modelo) {
		   this.modelo = modelo;
	   }
	    public String getCor() {
	    	return cor;
	    }
	    public void setCor(String cor) {
	    	this.cor = cor;
	    }
	     public int getAno() {
	    	 return ano;
	     }
	     public void setAno(int ano) {
	    	 this.ano = ano;
	     }
	      public double getKm() {
	    	  return km;
	      }
	      public void setKm(double km) {
	    	  this.km = km;
	      }
	       public Motor getMotor() {
	    	   return motor;
	       }
	       public void setMotor(Motor motor) {
	    	   this.motor = motor;
	       }
	        public TipoCombustivel getTipoCombustivel() {
	        	return tipoCombustivel;
	        }
	        public void setTipoCombustivel(TipoCombustivel tipoCombustivel) {
	        	this.tipoCombustivel = tipoCombustivel;
	        }
	        
	      public abstract void ligar();
	      public abstract void desligar();
	      
	     @Override
	     public String toString() {
	    	 return "Veículo => marca = " + marca + ", " + "modelo = " + modelo + ", " + "cor = " + cor + 
	    			 ", " + "ano = " + ano + ", " + "KM = " + km + ", " + motor + 
	    			 ", " + "tipo de combustível = " + tipoCombustivel + ", ";
	     }
	        
	       


}
