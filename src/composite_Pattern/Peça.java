package composite_Pattern;
import java.util.ArrayList;

public class Peça implements Componente {
	  private String               descrição;
	  private String			   fabricante;
	  private int                  preço;
	  private ArrayList<Peça> subordinateList = new ArrayList<Peça>();
	  
	  public Peça( String descrição,String fabricante, int preço)
	  {
	    super();
	    this.descrição = descrição;
	    this.preço = preço;
	    this.fabricante = fabricante;
	  }

	  public String getFabricante() {
		return fabricante;
	}

	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}

	public String getDetalhes()
	  {
		  return descrição;
	  }

	public void setDescrição(String descrição) {
		this.descrição = descrição;
	}

	public int getPreço() {
		return preço;
	}

	public void setPreço(int preço) {
		this.preço = preço;
	}

	public ArrayList<Peça> getSubordinateList() {
		return subordinateList;
	}

	public void setSubordinateList(Peça subordinate) {
		this.subordinateList.add(subordinate);
	}
	
	public void remove(Peça subordinate) {
		subordinateList.remove(subordinate);
	   }

	@Override
	public String toString() {
		return "\nDetalhes: " + getDetalhes() + "\nFabricante:" + getFabricante() + ",\nPreço:"
				+ getPreço() + ",\nSubordinate:" + getSubordinateList();
	}
	
	
	

	  
	  
}
