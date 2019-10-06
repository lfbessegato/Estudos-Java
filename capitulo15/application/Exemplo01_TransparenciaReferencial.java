package course.capitulo15.application;
import java.util.Arrays;

public class Exemplo01_TransparenciaReferencial {
	// Pois a fun��o depende do vlr externo globalValue
	public static int globalValue = 3;
	
	public static void main(String[] args) {
		int[] vect = new int[] {3, 4, 5};
		changeOddValues(vect);
		System.out.println(Arrays.toString(vect));
		// Exemplo de fun��o que n�o � referencialmente transparente
	}
	
	public static void changeOddValues(int[] numbers) {
		for (int i=0; i<numbers.length; i++) {
			if (numbers[i] % 2 != 0) {
				numbers[i] += globalValue;
			}
		}
	}	
}
