package oficina;

import java.time.LocalDate;
public class Consertos {
	
	private Veiculo veiculo;
	private Mecanico mecanico;
	private LocalDate data;
	private Double custo;
	private StatusConserto status;
	private PrioriConserto prioridade;
	private TipoServico tipo;
	  public Consertos(Veiculo veiculo, Mecanico mecanico, LocalDate data, Double custo, StatusConserto status, 
			  PrioriConserto prioridade, TipoServico tipo) {
		  this.veiculo = veiculo;
		  this.mecanico = mecanico;
		  this.data = data;
		  this.custo = custo;
		  this.status = status;
		  this.prioridade = prioridade;
		  this.tipo = tipo;
	  }
	public Veiculo getVeiculo() {
		return veiculo;
	}
	public void setVeiculo(Veiculo veiculo) {
		this.veiculo = veiculo;
	}
	public Mecanico getMecanico() {
		return mecanico;
	}
	public void setMecanico(Mecanico mecanico) {
		this.mecanico = mecanico;
	}
	public LocalDate getData() {
		return data;
	}
	public void setData(LocalDate data) {
		this.data = data;
	}
	public Double getCusto() {
		return custo;
	}
	public void setCusto(Double custo) {
		this.custo = custo;
	}
	public StatusConserto getStatus() {
		return status;
	}
	public void setStatus(StatusConserto status) {
		this.status = status;
	}
	public PrioriConserto getPrioridade() {
		return prioridade;
	}
	public void setPrioridade(PrioriConserto prioridade) {
		this.prioridade = prioridade;
	}
	public TipoServico getTipo() {
		return tipo;
	}
	public void setTipo(TipoServico tipo) {
		this.tipo = tipo;
	}
	  public void IniciarConserto() {
		  if(status == StatusConserto.PENDENTE) {
			  status = StatusConserto.EM_ANDAMENTO;
			  System.out.println("Conserto iniciado");
		  }else {
			  System.out.println("Não é possível iniciar o conserto. Status atual: " + status);
		  }
	  }
	    public void FinalizarConserto() {
	    	if(status == StatusConserto.EM_ANDAMENTO) {
	    		status = StatusConserto.FINALIZADO;
	    		System.out.println("Conserto finalizado");
	    	}else {
	    		System.out.println("Não foi possível finalizar o conserto. Status atual: " + status);
	    	}
	    }
	      public void CancelarConserto() {
	    	  if(status == StatusConserto.FINALIZADO) {
	    		  status = StatusConserto.CANCELADO;
	    		  System.out.println("Conserto cancelado");
	    	  }else {
	    		  System.out.println("Não é possível cancelar um conserto finalizado");
	    	  }
	      }
    public void AtualizarPriori(PrioriConserto novaPrioridade) {
    	this.prioridade = novaPrioridade;
    	System.out.println("Prioridade atualizada para: " + novaPrioridade);
    }
    @Override
    public String toString() {
    	return "Conserto => " + veiculo + mecanico + ", data = " + data + ", custo = " + custo +
    			", status = " + status + ", prioridade = " + prioridade + ", serviço = " + tipo + ". ";
    }
}
