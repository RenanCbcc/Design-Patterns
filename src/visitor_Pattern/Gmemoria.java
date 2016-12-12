package visitor_Pattern;

public class Gmemoria extends Gcard{
	private int valor;
	
	public Gmemoria(String peça, String detalhe, int valor) {
		super(peça, detalhe);
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
