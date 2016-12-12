package visitor_Pattern;

public class Gpu extends Gcard {
	private int valor;

	public int getValor() {
		return valor;
	}

	public Gpu(int valor,String componente, String detalhe) {
		super(componente, detalhe);
		this.valor = valor;
	}
	
	public void accept(ComputerPartVisitor computerPartVisitor) 
	{
	      computerPartVisitor.visit(this);
	}

	
	
}
