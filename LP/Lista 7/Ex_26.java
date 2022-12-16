package lista07_fatec;

public class Ex_26 {

	public static void main(String[] args) {
		// Barbara Mingatos

		StringBuilder seq = new StringBuilder();

		for (int i = 1; i <= 10; i++) {
			seq.append((char) ('a' + Math.random() * 26));
		}
		System.out.println("Seq: " + seq.toString());
		int cont = 0;
		System.out.print("Falta: ");
		String nAchadas = "";
		for (int i = 'a'; i <= 'z'; i++) {
			cont = 0;
			for (int j = 0; j < seq.length(); j++) {
				if (seq.charAt(j) == i) {
					cont++;
				}
			}
			if (cont == 0) {
				nAchadas += (char) i + " ";
			}
		}
		if (nAchadas.isEmpty()) {
			System.out.print("Todas\n");
		} else {
			System.out.print(nAchadas + "\n");
		}
		System.out.print("Maior repetidas: ");
		int maior = 0;
		for (int i = 'a'; i <= 'z'; i++) {
			cont = 0;
			for (int j = 0; j < seq.length(); j++) {
				if (i == seq.charAt(j)) {
					cont++;
				} else {
					cont = 0;
				}
				if (cont > maior) {
					maior = cont;
				}
			}
		}
		System.out.print(maior + "\n");
		String vogais = "aeiou";
		maior = 0;
		System.out.print("Maior vogais: ");
		for (int i = 0; i < vogais.length(); i++) {
			cont = 0;
			for (int j = 0; j < seq.length(); j++) {
				if (vogais.charAt(i) == seq.charAt(j)) {
					cont++;
				} else {
					cont = 0;
				}
				if (cont > maior) {
					maior = cont;
				}
			}
		}

		System.out.print(maior + "\n");
		System.out.print("Maior sequência alfabética: ");
		maior = 0;
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
				if (cont > maior) {
					maior = cont;
				}
			}
		}
		System.out.print(maior + "\n");
	}

}
