package visitor_Pattern;

public abstract class Gcard implements Computador_Peça {
	protected String peça;
	protected String detalhe;
	
	public String getPeça() {
		return peça;
	}
	public String getDetalhe() {
		return detalhe;
	}
	public Gcard(String peça, String detalhe) {
		super();
		this.peça = peça;
		this.detalhe = detalhe;
	}
	
	
}
