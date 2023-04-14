package cifraDeCesar;

import java.util.Scanner;

public class CifradeCesar {
	private String textoCriptografado;
	private String textoDescriptografado;

	public CifradeCesar(String textoCriptografado, String textoDescriptografado) {
		super();
		this.textoCriptografado = textoCriptografado;
		this.textoDescriptografado = textoDescriptografado;
	}

	public CifradeCesar() {
		this("", "");
	}

	public String getTextoCriptografado() {
		return textoCriptografado;
	}

	public void setTextoCriptografado(String textoCriptografado) {
		this.textoCriptografado = textoCriptografado;
	}

	public String getTextoDescriptografado() {
		return textoDescriptografado;
	}

	public void setNomeDoFuncionario(String textoDescriptografado) {
		this.textoDescriptografado = textoDescriptografado;
	}

	public static String encriptar(int chave, String texto) {
		StringBuilder textoCifrado = new StringBuilder();
		int tamanhoTexto = texto.length();

		for (int c = 0; c < tamanhoTexto; c++) {
			int letraCifradaASCII = ((int) texto.charAt(c)) + (chave - 1);

			while (letraCifradaASCII > 126) {
				letraCifradaASCII -= 94;
			}

			textoCifrado.append((char) letraCifradaASCII);
		}

		return textoCifrado.toString();
	}

	public static String decriptar(int chave, String textoCifrado) {
		StringBuilder texto = new StringBuilder();
		int tamanhoTexto = textoCifrado.length();

		for (int c = 0; c < tamanhoTexto; c++) {
			int letraDecifradaASCII = ((int) textoCifrado.charAt(c)) - (chave - 1);

			while (letraDecifradaASCII < 32) {
				letraDecifradaASCII += 94;
			}

			texto.append((char) letraDecifradaASCII);
		}

		return texto.toString();
	}

	public static void main(String[] args) {

		try {
			Scanner entrada = new Scanner(System.in);

			System.out.println("*****************************************************");

			System.out.print("Informe o texto a ser criptografado: ");
			String texto = entrada.nextLine();
			System.out.print("Informe a chave de deslocamento: ");
			int chave = entrada.nextInt();

			String textoCriptografado = encriptar(chave, texto);
			String textoDescriptografado = decriptar(chave, textoCriptografado);

			System.out.println("\n\nTEXTO CRIPTOGRAFADO: " + textoCriptografado);
			System.out.println("TEXTO DESCRIPTOGRAFADO: " + textoDescriptografado);

			System.out.println("*****************************************************");

		} catch (RuntimeException e) {
			System.out.println("A chave de deslocamento foi informada incorretamente.");
			System.out.println("Execute o programa novamente e entre com uma chave valida.");
		}

	}
}
