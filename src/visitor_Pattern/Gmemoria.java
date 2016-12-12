package visitor_Pattern;

public class Gmemoria extends Gcard{
	private int valor;
	
	public Gmemoria(String pe�a, String detalhe, int valor) {
		super(pe�a, detalhe);
		this.valor = valor;
	}
	
	public void accept(ComputerPartVisitor computerPartVisitor) 
		{
		      computerPartVisitor.visit(this);
		}

	public int getValor()
	{
		return valor;
	}




		
	
}
