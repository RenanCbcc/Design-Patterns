package visitor_Pattern;

public class Monitor implements Computador_Pe�a {
	@Override
	   public void accept(ComputerPartVisitor computerPartVisitor) 
	{
	      computerPartVisitor.visit(this);
	}
	
}
