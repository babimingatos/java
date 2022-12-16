package lista08_fatec;

public class Ex_10 {

	public static void main(String[] args) {
		//Barbara Mingatos
		
		int[] pa = new int[5];
		int[] pb = new int[5];
		int[] pc = new int[100];
		int soma = 0;
		int somapa = 0;
		int somapb = 0;

		for (int i = 0; i < 5; i++) {
			pa[i] = (int) (1 + (Math.random() * 10));
			pb[i] = (int) (1 + (Math.random() * 10));
		}

		System.out.print("VETOR A: ");
		for (int i = 0; i < 5; i++) {
			System.out.print(pa[i] + " ");
			somapa += pa[i];
		}

		System.out.print("\nVETOR B: ");
		for (int i = 0; i < 5; i++) {
			System.out.print(pb[i] + " ");
			somapb += pb[i];
		}
		for (int i = 0; i < 5; i++) {
			soma = pa[i] + pb[i];
			System.out.print("\nSoma do " + (i + 1) + " elemento: " + soma);
		}
		
		System.out.print("\nSoma PB: " + somapb);
		System.out.print("\nSoma PA: " + somapa);
	}

}
