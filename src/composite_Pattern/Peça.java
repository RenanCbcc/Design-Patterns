package composite_Pattern;
import java.util.ArrayList;

public class Pe�a implements Componente {
	  private String               descri��o;
	  private String			   fabricante;
	  private int                  pre�o;
	  private ArrayList<Pe�a> subordinateList = new ArrayList<Pe�a>();
	  
	  public Pe�a( String descri��o,String fabricante, int pre�o)
	  {
	    super();
	    this.descri��o = descri��o;
	    this.pre�o = pre�o;
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
		  return descri��o;
	  }

	public void setDescri��o(String descri��o) {
		this.descri��o = descri��o;
	}

	public int getPre�o() {
		return pre�o;
	}

	public void setPre�o(int pre�o) {
		this.pre�o = pre�o;
	}

	public ArrayList<Pe�a> getSubordinateList() {
		return subordinateList;
	}

	public void setSubordinateList(Pe�a subordinate) {
		this.subordinateList.add(subordinate);
	}
	
	public void remove(Pe�a subordinate) {
		subordinateList.remove(subordinate);
	   }

	@Override
	public String toString() {
		return "\nDetalhes: " + getDetalhes() + "\nFabricante:" + getFabricante() + ",\nPre�o:"
				+ getPre�o() + ",\nSubordinate:" + getSubordinateList();
	}
	
	
	

	  
	  
}
