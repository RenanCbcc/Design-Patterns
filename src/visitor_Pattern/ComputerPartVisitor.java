package visitor_Pattern;

public interface ComputerPartVisitor {
	public void visit(Memoria memoria);
	public void visit(Teclado teclado);
	public void visit(Monitor monitor);
	public void visit(Computador computador);
	public void visit(Cpu amd);
	public void visit(Gcard nVidea);
}
