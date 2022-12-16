package lista07_fatec;

public class Ex_26 {

	public static void main(String[] args) {
		// Barbara Mingatos

		String nAchadas = "";
		int cont = 0;
		StringBuilder seq = new StringBuilder();

		for (int i = 1; i <= 100; i++) {
			seq.append((char) ('a' + Math.random() * 26));
		}
		System.out.println("Random: " + seq.toString());

		System.out.print("Falta: ");
		for (int i = 'a'; i <= 'z'; i++) {
			cont = 0;
			for (int j = 0; j < seq.length(); j++) {
				if (seq.charAt(j) == i) {
					cont++;
				}
			}
			if (cont == 0) {
				nAchadas += (char) i;
			}
		}
		if (nAchadas.isEmpty()) {
			System.out.print("Todas estão\n");
		} else {
			System.out.print(nAchadas + "\n");
		}
		System.out.print("Maior seq de repetidas: ");
		int rep = 0;
		for (int i = 'a'; i <= 'z'; i++) {
			cont = 0;
			for (int j = 0; j < seq.length(); j++) {
				if (i == seq.charAt(j)) {
					cont++;
				} else {
					cont = 0;
				}
				if (cont > rep) {
					rep = cont;
				}
			}
		}
		System.out.print(rep + "\n");

		System.out.print("Maior seq alfabética: ");
		rep = 0;

		String alf = "";

		for (int i = 'a'; i <= 'z'; i++) {
			alf += (char) i;
		}
		for (int i = 0; i <= alf.length(); i++) {
			cont = 0;
			String achando = alf.substring(0, alf.length() - i);
			for (int j = 0; j < seq.length(); j++) {
				if (seq.substring(j).startsWith(achando)) {
					cont = achando.length();
				} else {
					cont = 0;
				}
				if (cont > rep) {
					rep = cont;
				}
			}
		}
		System.out.print(rep + "\n");
	}

}
