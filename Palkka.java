import java.text.DecimalFormat;
import java.util.Scanner;

public class Palkka {

	public static void main(String[] args) {
		

		Scanner input = new Scanner(System.in);
		DecimalFormat d = new DecimalFormat("0.00");
		
		int palkka;
		System.out.println("Anna palkka: ");
		palkka = input.nextInt();
		double veroprosentti;
		System.out.println("Anna veroprosentti: ");
		veroprosentti = input.nextDouble();
		double ika;
		System.out.println("Anna ikä: ");
		ika = input.nextDouble();
	
		System.out.println("Bruttopalkka " + palkka);
		
		double veronosuus = palkka*veroprosentti/100;
		System.out.println("Veron osuus " + d.format(veronosuus));
		
		double vakuutusmaksu1 = palkka*0.0825;
		double vakuutusmaksu2 = palkka*0.0675;
		
			if (ika >= 53 && ika <= 63) {
			System.out.println("Työeläkevakuutusmaksun osuus " + d.format(vakuutusmaksu1));
		} else {
			System.out.println("Työeläkevakuutusmaksun osuus " + d.format(vakuutusmaksu2));
		} 
			
			double tmaksu = palkka * 0.015;
			System.out.println("Työttömyysvakuutuksen osuus " + d.format(tmaksu));
			
			if (ika >= 53 && ika <= 63) {
				System.out.println("Käteen jää  " + d.format(palkka-veronosuus-vakuutusmaksu1-tmaksu));
			} else {
			System.out.println("Käteen jää  " + d.format(palkka-veronosuus-vakuutusmaksu2-tmaksu));
			}	
		input.close();

	}

}
