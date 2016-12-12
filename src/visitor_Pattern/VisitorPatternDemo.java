package visitor_Pattern;

public class VisitorPatternDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Computador_Componente computer = new Computador("Computador","Dell");
	      computer.accept(new Componente_Valor());
	}

}
