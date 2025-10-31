package oficina;

public enum EspecMecanico {
	MOTOR("Especialista em motores"), TRANSMISSAO("Especialista em transmissão"), ELETRICA("Esepcialista em elétrica"), FREIOS("Especialista em freios"),
	SUSPENSAO("Especialista em suspensão"), PINTURA("Esepecialista em pintura");
      private final String espec;
      private EspecMecanico(String espec) {
    	  this.espec = espec;
      }
       public String getSpec() {
    	   return espec;
       }
}
