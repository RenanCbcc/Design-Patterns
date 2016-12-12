package composite_Pattern;

import javax.swing.JOptionPane;

public class CompositePatternDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Peça computer = new Peça("Computador","Positivo",4000);
		Peça cpu = new Peça("Processador","Celeron",290);
		Peça monitor = new Peça("Monitor","Positivo",100);
		Peça keyboard = new Peça("teclado","Positivo",20);
		Peça memory = new Peça("Memória","kingston",80);
		Peça gCard = new Peça("GCard","Amd",300);
		Peça gpu = new Peça("GPU","Amd",100);
		Peça gmemory = new Peça("Gmemory","Amd",100);
		
		computer.setSubordinateList(monitor);
		computer.setSubordinateList(cpu);
		computer.setSubordinateList(monitor);
		computer.setSubordinateList(keyboard);
		computer.setSubordinateList(memory);
		computer.setSubordinateList(gCard);
		gCard.setSubordinateList(gpu);
		gCard.setSubordinateList(gmemory);
		
		JOptionPane.showMessageDialog(null,computer.toString());
		 
		
	}

}
