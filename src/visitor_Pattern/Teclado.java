package visitor_Pattern;

public class Teclado implements Computador_Peça {
	
	private int valor = 0;
	private String peça;
	private String detalhe;
	
	public Teclado(int valor,String peça,String detalhe)
	{
		this.valor = valor;
		this.detalhe = detalhe;
		this.peça = peça;
	}
	
	
	public int getValor() {
		return valor;
	}


	public String getPeça() {
		return peça;
	}


	public String getDetalhe() {
		return detalhe;
	}


	@Override
	   public void accept(ComputerPartVisitor computerPartVisitor) 
	{
	      computerPartVisitor.visit(this);
	}
	
}
