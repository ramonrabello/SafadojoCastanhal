package androidnarede.calculadorasafa.test;

/**
 * Representa uma calculadora bem simples.
 * 
 * @author ramonrabello
 * 
 */
public class Calculadora {

	/**
	 * 
	 * @param op1
	 * @param op2
	 * @return
	 */
	public float somar(float op1, float op2) {
		return op1 + op2;
	}

	/**
	 * 
	 * @param op1
	 * @param op2
	 * @return
	 */
	public float subtrair(float op1, float op2) {
		return op1 - op2;
	}

	/**
	 * 
	 * @param op1
	 * @param op2
	 * @return
	 */
	public float multiplicar(float op1, float op2) {
		return op1 * op2;
	}

	/**
	 * 
	 * @param op1
	 * @param op2
	 * @return
	 */
	public float dividir(float op1, float op2) {
		return op1 / op2;
	}

	/**
	 * 
	 * @param op1
	 * @return
	 */
	public Double calcularPotencia(double op1) {
		return Math.pow(op1, 2);
	}
}