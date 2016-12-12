package visitor_Pattern;

public class Gpu extends Gcard {
	private int valor;

	public int getValor() {
		return valor;
	}

	public Gpu(String peça, String detalhe, int valor) {
		super(peça, detalhe);
		this.valor = valor;
	}
	
	public void accept(ComputerPartVisitor computerPartVisitor) 
	{
	      computerPartVisitor.visit(this);
	}

	
	
}
