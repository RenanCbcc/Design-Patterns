package visitor_Pattern;

public abstract class Gcard implements Computador_Pe�a {
	protected String pe�a;
	protected String detalhe;
	
	public String getPe�a() {
		return pe�a;
	}
	public String getDetalhe() {
		return detalhe;
	}
	public Gcard(String pe�a, String detalhe) {
		super();
		this.pe�a = pe�a;
		this.detalhe = detalhe;
	}
	
	
}
