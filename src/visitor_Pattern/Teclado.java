package visitor_Pattern;

public class Teclado implements Computador_Componente {
	
	private int valor = 0;
	private String componente;
	private String detalhe;
	
	public Teclado(int valor,String componete,String detalhe)
	{
		this.valor = valor;
		this.detalhe = detalhe;
		this.componente = componete;
	}
	
	
	public int getValor() {
		return valor;
	}



	public String getComponente() {
		return componente;
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
