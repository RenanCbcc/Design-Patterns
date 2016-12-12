package visitor_Pattern;

public class Monitor implements Computador_Peça {
	@Override
	   public void accept(ComputerPartVisitor computerPartVisitor) 
	{
	      computerPartVisitor.visit(this);
	}
	
}
