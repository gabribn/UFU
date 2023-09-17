
public class CalculadoraBinaria {
	public String soma(String a, String b) {
		int tamanho = Math.max(a.length(), b.length());
		StringBuilder resultado = new StringBuilder();
		int carry = 0;

		a = preencherZeros(a, tamanho);
		b = preencherZeros(b, tamanho);

		for (int i = tamanho - 1; i >= 0; i--) {
			int bitA = Character.getNumericValue(a.charAt(i));
			int bitB = Character.getNumericValue(b.charAt(i));

			int soma = bitA + bitB + carry;

			resultado.insert(0, soma % 2);

			carry = soma / 2;
		}

		if (carry != 0) {
			resultado.insert(0, carry);
		}

		return resultado.toString();
	}

	public String sub(String a, String b) {
		int tamanho = Math.max(a.length(), b.length());
		StringBuilder resultado = new StringBuilder();
		int emprestimo = 0;

		a = preencherZeros(a, tamanho);
		b = preencherZeros(b, tamanho);


		for (int i = tamanho - 1; i >= 0; i--) {
			int bitA = Character.getNumericValue(a.charAt(i));
			int bitB = Character.getNumericValue(b.charAt(i));


			bitA -= emprestimo;


			if (bitA < bitB) {
				bitA += 2;
				emprestimo = 1;
			} else {
				emprestimo = 0;
			}

			int diferenca = bitA - bitB;

			resultado.insert(0, diferenca);
		}

		return resultado.toString();
	}

	private String preencherZeros(String s, int tamanho) {
		StringBuilder sb = new StringBuilder(s);
		while (sb.length() < tamanho) {
			sb.insert(0, '0');
		}
		return sb.toString();
	}
}
