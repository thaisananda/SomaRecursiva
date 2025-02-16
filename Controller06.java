package controller;

public class Controller06 {

	public Controller06() {
		super();
	}
	
	public int SomaRecursiva(int x, int y) {
		// Condição de parada: quando b for 0, retornamos a, pois a soma foi realizada
		if (y == 0) {
			return x;
		}else {
		// Chamada recursiva: adicionamos 1 a 'a' e diminuímos 1 de 'b', assim, a soma será realizada sem utilização de +.
		return SomaRecursiva(x + 1, y - 1);
		}
	}
}
