package visitor_Pattern;

public interface Computador_Componente {
			
			public void accept(ComputerPartVisitor computerPartVisitor);
			public int getValor();
		

	}


