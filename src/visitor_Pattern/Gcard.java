package visitor_Pattern;

public abstract class Gcard implements Computador_Componente {
	protected String componente;
	protected String detalhe;
	
	public String getComponente() {
		return componente;
	}
	public String getDetalhe() {
		return detalhe;
	}
	public Gcard(String pe�a, String detalhe) {
		super();
		this.componente = pe�a;
		this.detalhe = detalhe;
	}
	
	
}
