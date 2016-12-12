package visitor_Pattern;

public class Gpu extends Gcard {
	private int valor;

	public int getValor() {
		return valor;
	}

	public Gpu(String pe�a, String detalhe, int valor) {
		super(pe�a, detalhe);
		this.valor = valor;
	}
	
	public void accept(ComputerPartVisitor computerPartVisitor) 
	{
	      computerPartVisitor.visit(this);
	}

	
	
}
