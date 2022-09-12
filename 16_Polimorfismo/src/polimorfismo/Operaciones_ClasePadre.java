package polimorfismo;

import java.util.Scanner;

public abstract class Operaciones_ClasePadre {

	protected int valor1, valor2, resultado;
	Scanner entrada = new Scanner(System.in);

	public void PedirDatos() {
		System.out.print("Dame el primer Valor : ");
		valor1 = entrada.nextInt();

		System.out.print("Dame el segundo Valor: ");
		valor2 = entrada.nextInt();

	}

	public abstract void Operaciones();

	public void MostralResultado() {
		System.out.print(resultado);
	}

}
