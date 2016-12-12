package visitor_Pattern;

public class Teclado implements Computador_Pe�a {
	
	private int valor = 0;
	private String pe�a;
	private String detalhe;
	
	public Teclado(int valor,String pe�a,String detalhe)
	{
		this.valor = valor;
		this.detalhe = detalhe;
		this.pe�a = pe�a;
	}
	
	
	@Override
	   public void accept(ComputerPartVisitor computerPartVisitor) 
	{
	      computerPartVisitor.visit(this);
	}
	
}
