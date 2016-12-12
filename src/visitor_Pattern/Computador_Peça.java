package visitor_Pattern;

public interface Computador_Peça {
	
	public void accept(ComputerPartVisitor computerPartVisitor);
	public int getValor();
}
