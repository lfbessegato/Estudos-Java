package course.capitulo2;

public class Expressao_Ternaria {
	public static void main(String[] args) {
		
		double preco = 34.5;
		double desconto = (preco < 20.0) ? preco * 0.1 : preco * 0.05;
		
		System.out.println("O Desconto foi: " + desconto + "O preço é: " + preco);
	}

}
