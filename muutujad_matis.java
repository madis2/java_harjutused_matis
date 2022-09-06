/* Matis Russi IT-21 */

package harjutused_matis;

public class muutujad_matis {

	public static void main(String[] args) {
		String eesnimi = new String();
		eesnimi = "Matis";
		int kursus = 2;
		
		System.out.println(eesnimi+", "+kursus+". kursus");
		System.out.println();
		
		/* Täisarv vanuse jaoks */
		
		int vanus = 17;
		
		/* Komaarv enda pikkuse jaoks */
		
		float komaarv = 1.78f;
		
		/* String hüüdnime jaoks */
		
		String hyydnimi = new String();
		hyydnimi = "Madis";
		
		/* Täislause kasutades muutujaid */
		
		System.out.println("Olen "+vanus+" aastat vana, "+komaarv+"m pikk ning huudnimeks on "+hyydnimi+".");
		
		/*
		
		int minuarv;
		
		System.out.println(minuarv);
		
		Üleval olev annab välja errori.
		
		*/
	}

}
