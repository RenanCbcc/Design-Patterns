package visitor_Pattern;

public interface ComputerPartVisitor {
	public void visit(Memoria memoria);
	public void visit(Computador computador);
	public void visit(Gmemoria gram);
	public void visit(Gpu gpu);
	public void visit(Teclado teclado);
	public void visit(Monitor monitor);
	public void visit(Cpu amd);
		
}
