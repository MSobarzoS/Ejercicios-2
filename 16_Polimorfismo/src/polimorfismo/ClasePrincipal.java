package polimorfismo;

public class ClasePrincipal {

	public static void main(String[] args) {
	Operaciones_ClasePadre mensajero_Suma = new Suma_ClaseHija();
	mensajero_Suma.PedirDatos();
	mensajero_Suma.Operaciones();
	mensajero_Suma.MostralResultado();
	
	
	Operaciones_ClasePadre mensajero_Resta = new Resta_ClaseHija();
	mensajero_Resta.PedirDatos();
	mensajero_Resta.Operaciones();
	mensajero_Resta.MostralResultado();

	}

}
