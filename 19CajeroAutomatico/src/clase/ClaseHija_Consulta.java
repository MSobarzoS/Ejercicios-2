package clase;

public class ClaseHija_Consulta extends ClasePadre_Abstracta {

	public void Transacciones() {
		System.out.println("-------------------------------");
		System.out.println("Tu saldo Actual es" + getSaldo());
		System.out.println("-------------------------------");

	}

}
