package composite_Pattern;

import javax.swing.JOptionPane;

public class CompositePatternDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Pe�a computer = new Pe�a("Computador","Positivo",4000);
		Pe�a cpu = new Pe�a("Processador","Celeron",290);
		Pe�a monitor = new Pe�a("Monitor","Positivo",100);
		Pe�a keyboard = new Pe�a("teclado","Positivo",20);
		Pe�a memory = new Pe�a("Mem�ria","kingston",80);
		Pe�a gCard = new Pe�a("GCard","Amd",300);
		Pe�a gpu = new Pe�a("GPU","Amd",100);
		Pe�a gmemory = new Pe�a("Gmemory","Amd",100);
		
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
