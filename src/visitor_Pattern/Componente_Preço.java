package visitor_Pattern;



public class Componente_Pre�o implements ComputerPartVisitor {
	  @Override
	   public void visit(Computador computer) {
	      System.out.println("Pre�o do computador.");
	      computer.getValor();
	   }

	   @Override
	   public void visit(Memoria memoria) {
	      System.out.println("Pre�o da mem�ria ram.");
	      memoria.getValor();
	   }

	   @Override
	   public void visit(Gmemoria gram) {
	      System.out.println("Displaying Gram.");
	      gram.getValor();
	   }

	   @Override
	   public void visit(Gpu gpu) {
	      System.out.println("Displaying Gcard.");
	      gpu.getValor();
	 
	   }

	   @Override
	   public void visit(Monitor monitor) {
	      System.out.println("Displaying Monitor.");
	   } 
	   
	   
	   public void visit(Cpu amd) {
		      System.out.println("Displaying Cpu.");
		   } 
	   
	   public void visit(Teclado teclado) {
		      System.out.println("Displaying Teclado.");
		   } 
	   
}
