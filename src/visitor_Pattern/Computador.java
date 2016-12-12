package visitor_Pattern;

public class Computador implements Computador_Pe�a {
	Computador_Pe�a[] parts;
	private int valor = 0;
	private String pe�a;
	private String detalhe;
	
	public Computador(int valor,String pe�a,String detalhe)
	{
		this.valor = valor;
		this.detalhe = detalhe;
		this.pe�a = pe�a;
		parts = new Computador_Pe�a[] {
				new Monitor(),
				new Memoria(100,"Memoria","Kingston"),
				new Cpu(200,"Processador","Amd"),
				new Teclado(20,"Teclado","Maxprint")};
	}
	

	   public int getValor() {
		return valor;
	}


	public String getPe�a() {
		return pe�a;
	}


	public String getDetalhe() {
		return detalhe;
	}


	   @Override
	   public void accept(ComputerPartVisitor computerPartVisitor) {
	      for (int i = 0; i < parts.length; i++) {
	         parts[i].accept(computerPartVisitor);
	      }
	      computerPartVisitor.visit(this);
	   }
}
