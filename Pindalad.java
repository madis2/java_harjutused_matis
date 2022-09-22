package harjutused_matis;
import java.util.Scanner;

public class Pindalad {

	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
		System.out.print("Kuubi ruumala (1) \nRisttahuka ruumala (2) \nVali tegevus: "); 
		String valik = scanner.next();
		
		int s;
		int a;
		int d;
		switch (Integer.parseInt(valik)) {
		case 1:
			
			System.out.println("Sisesta a väärtus: ");
			a = scanner.nextInt();
			
			s = Ruumalad.kuup(a);
			System.out.println("Kuubi ruumala on "+s+" kuupmeetrit.");
			break;
		case 2:
			
			System.out.println("Sisesta a väärtus: ");
			a = scanner.nextInt();
			System.out.println("Sisesta b väärtus: ");
			int b = scanner.nextInt();
			System.out.println("Sisesta c väärtus: ");
			int c = scanner.nextInt();
			
			d = Ruumalad.risttahukas(a,b,c);
			System.out.println("Risttahuka ruumala on "+d+" kuupmeetrit.");
			break;
		default:
			System.out.print("Valikust arusaamine ebaõnnestus!");
			break;
		}
	}

}
