package harjutused_matis;

public class Elukas {
	public String nimi;
	public String varv;
	public int vanus;
	
	public Elukas(String n, String va, int v){
		this.nimi = n;
		this.varv = va;
		this.vanus = v;
	}
	
	public void tutvusta() {
		System.out.println("Eluka nimi on "+nimi+", värvus on "+varv+" ja vanust on elukal "+vanus+" aastat.");
	}
}
