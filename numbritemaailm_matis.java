package java_harjutused_matis;

public class numbritemaailm_matis {

	public static void main(String[] args) {
		
		tollidmeetriteks(2);
		minutidtundideks(100);
	}
	
	/* Loon alamprogrammi, et muuta tollid meetriteks. */
	
	static void tollidmeetriteks(int tollid) {
		double meetrid;
		meetrid = tollid*0.0254;
		System.out.println("Sinu vastuseks on: "+meetrid+"m");
		System.out.println();
	}
	
	
	/*
	static void ellipspindala(int a) {
		
	}
	*/
	
	static void minutidtundideks(int min) {
		int tund, kokku, minut;
		tund = min/60;
		kokku = tund*60;
		minut = min - kokku;
		System.out.println("Ajaks on: "+tund+" tund ja "+minut+" minutit.");
		System.out.println();
	}
}