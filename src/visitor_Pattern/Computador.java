package visitor_Pattern;

public class Computador implements Computador_Peça {
	Computador_Peça[] parts;
	private int valor = 0;
	private String peça;
	private String detalhe;
	
	public Computador(int valor,String peça,String detalhe)
	{
		this.valor = valor;
		this.detalhe = detalhe;
		this.peça = peça;
		parts = new Computador_Peça[] {
				new Monitor(300,"Monitor","Samsung"),
				new Memoria(100,"Memoria","Kingston"),
				new Cpu(200,"Processador","Amd"),
				new Gpu(100,"Gpu","Amd"),
				new Gmemoria(100,"Gmemoria","Amd"),
				new Teclado(20,"Teclado","Maxprint")};
	}
	

	   public int getValor() {
		for (Computador_Peça pc : parts)
		{
			this.valor+= pc.getValor();
		}
		return this.valor;
	}


	public String getPeça() {
		return peça;
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
