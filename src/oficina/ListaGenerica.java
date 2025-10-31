package oficina;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class ListaGenerica<T> {
	private List<T> listaRegistros;
	public ListaGenerica() {
		this.listaRegistros = new ArrayList<>();
	}
	 public void addElemento(T elemento) {
		 listaRegistros.add(elemento);
	 }
	 public void removerElemento(T elemento) {
		 listaRegistros.remove(elemento);
	 }
	  public void ListarElementos() {
		  if(listaRegistros.isEmpty()) {
			  System.out.println("A lista está vazia");
		  }else {
			  for(T elemento : listaRegistros) {
				  System.out.println(elemento);
			  }
		  }
	  }
	
	  public List<T> buscarElemento(Predicate<T> filtro){
		  List<T> resultados = new ArrayList<>();
		   for(T elemento : listaRegistros) {
			   if(filtro.test(elemento)) {
				   resultados.add(elemento);
			   }
		   }
		   return resultados;
	  }
	   public int tamanhoLista() {
		   return listaRegistros.size();
	   }
	    public static void main(String[] args) {
	    	ListaGenerica<Veiculo> listaVeiculos = new ListaGenerica<>();
	    	
	    	Veiculo carro1 = new Carro("Fiat", "Uno", "Branco", 2020, 50000, new Motor(150, 100, 12345), TipoCombustivel.GASOLINA, true, 4);
	    	Veiculo moto1 = new Moto("Honda", "CG 160", "Preta", 2021, 2000, new Motor(120, 50, 67890), TipoCombustivel.ETANOL, "Retificado", true);
	    	
	    	listaVeiculos.addElemento(carro1);
	    	listaVeiculos.addElemento(moto1);
	    	
	    	System.out.println("Veículos cadastrados");
	    	listaVeiculos.ListarElementos();
	    	
	    	System.out.println("Buscando veículos da marca 'Fiat':  ");
	    	List<Veiculo> veiculosFiat = listaVeiculos.buscarElemento(v -> v.getMarca().equals("Fiat"));
	    	for(Veiculo veiculo : veiculosFiat) {
	    		System.out.println(veiculo);
	    	}
	    	 System.out.println("Removendo o veículo Fiat");
	    	 listaVeiculos.removerElemento(carro1);
	    	 
	    	 System.out.println("Veículos cadastrados após a remoção: ");
	    	 listaVeiculos.ListarElementos();
	    	 
	    	 System.out.println("Tamanho da lista de veículos: " + listaVeiculos.tamanhoLista());
	    }
	

}
