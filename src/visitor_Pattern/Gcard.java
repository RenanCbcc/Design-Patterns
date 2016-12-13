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
	public Gcard(String peça, String detalhe) {
		super();
		this.componente = peça;
		this.detalhe = detalhe;
	}
	
	
}
